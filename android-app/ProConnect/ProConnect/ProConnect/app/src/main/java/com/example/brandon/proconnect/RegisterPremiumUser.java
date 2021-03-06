package com.example.brandon.proconnect;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/**<p>
 * RegisterPremiumUser display the xml file for
 * A premium user registration form.
 * </p>
 * <p>
 * User will be asked to fill out entire form
 * and can choose to upload a profile picture if they wish.
 * </p>
 *
 * Account will be created for user, once the form is complete.
 *
 *<p>
 *User will be notified if fields are missing, or if
 *email is already in the system.
 *</p>
 *
 */
public class RegisterPremiumUser extends ActionBarActivity {
    private static final int GALLERY = 0;
    private static final int CAMERA = 1;
    private Intent getPictureIntent = null;
    private ImageView profilePic;
    private EditText etPassword,etConfirmPassword,etEmail;
    private Button Submit,photoSubmit;
    InputStream is = null;
    String result = "";
    int success = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_premium_user);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        etPassword = (EditText) findViewById(R.id.PremiumPasswordEdit);
        etConfirmPassword = (EditText) findViewById(R.id.PremiumConfirmPasswordEdit);
        etEmail = (EditText) findViewById(R.id.PremiumEmailEdit);
        profilePic = (ImageView) findViewById(R.id.PremiumThumbnail);

        photoSubmit = (Button) findViewById(R.id.PremiumProfilePictureButton);
        Submit = (Button) findViewById(R.id.PremiumRegisterSubmitButton);

        photoSubmit = (Button) findViewById(R.id.PremiumProfilePictureButton);

        /**<p>
         * Ask the user if they want to grab the picture from their
         * gallery, or if they want to take the picture.
         * </p>
         *
         */
        photoSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder chooser = new AlertDialog.Builder(RegisterPremiumUser.this);
                chooser.setTitle("Choose Picture Option");
                chooser.setMessage("How do you want to upload your picture?");

                chooser.setPositiveButton("Gallery", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getPictureIntent = new Intent(Intent.ACTION_GET_CONTENT, null);
                        getPictureIntent.setType("image/*");
                        startActivityForResult(getPictureIntent,GALLERY);
                    }
                });

                chooser.setNegativeButton("Camera", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getPictureIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivityForResult(getPictureIntent, CAMERA);

                    }
                });

                chooser.show();
            }
        });

        /**
         * Checks to see if fields are filled and user can be registered
         *
         */
        Submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String password = "" + etPassword.getText().toString();
                String confirmPassword = ""+etConfirmPassword.getText().toString();
                String email = ""+etEmail.getText().toString();

                if(confirmPassword.equals(password)) {
                    if(password.trim().length() !=0 && email.trim().length() !=0) {
                        ValidateUser validate = new ValidateUser();
                        validate.execute(new String[]{password, confirmPassword, email});
                    }
                    else if(email.trim().length() == 0)
                    {
                        Toast.makeText(getApplicationContext(),"Email field blank.",Toast.LENGTH_LONG).show();
                    }
                    else if(password.trim().length() == 0)
                    {
                        Toast.makeText(getApplicationContext(),"Password field blank.",Toast.LENGTH_LONG).show();
                    }

                    }else
                {
                    Toast.makeText(getApplicationContext(),"Passwords don't match.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    /**<p>
     * This is an overridden method that store an image
     * and set a thumbnail in an ImageView, based on if
     * the user chose a picture from the gallery or
     * if they took the picture at that moment.
     * </p>
     *
     * @param requestCode Checks to see if user picked camera or gallery
     * @param resultCode Checks to see if operation succeeded
     * @param data The data of the picture is passed here
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CAMERA && resultCode == RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            profilePic.setImageBitmap(photo);
        }
        else if(requestCode == GALLERY && resultCode == RESULT_OK)
        {
            Uri selectedImage = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };
            Cursor cursor = getContentResolver().query(selectedImage,filePathColumn, null, null, null);
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();
            profilePic.setImageBitmap(BitmapFactory.decodeFile(picturePath));
        }
    }

    /**This class handles http requests off the UI thread
     *
     * <p>
     * This class takes the information the user enters and
     * stores it into a database through an http request.
     * This will operate outside the UI thread
     * so the app doesn't appear to be frozen.
     * </p>
     *
     */
    private class ValidateUser extends AsyncTask<String, Void, String> {
        /**This is a Asynctask defined method.
         *
         * @param params The information that the user wants to store.
         * @return The string representation of JSON object
         */
        protected String doInBackground(String... params) {

            try {
                HttpClient httpClient = new DefaultHttpClient();

                HttpPost httpPost = new HttpPost("http://192.168.1.119/Connect_Premium_db.php");

                HttpResponse response = httpClient.execute(httpPost);

                HttpEntity entity = response.getEntity();

                is = entity.getContent();

            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                BufferedReader response = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
                StringBuilder sb = new StringBuilder();
                String line = null;
                while ((line = response.readLine()) != null) {
                    sb.append(line + "\n");

                    is.close();
                    result = sb.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }

        /**<p>
         * This method converts string into json object
         * and uses object to determine if user was
         * able to register.
         * </p>
         *
         * @param s The JSON string passed from doInBackground
         */
        protected void onPostExecute(String s) {
            try {
                JSONObject json = new JSONObject(result);
                success = json.getInt("Success");

                if (success == 1) {
                    Toast.makeText(getApplicationContext(), "Account Created!", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Username Exists!", Toast.LENGTH_LONG).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register_premium_user, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
