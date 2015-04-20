package com.example.brandon.proconnect;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class RegisterRegularUser extends ActionBarActivity {

    private static final int GALLERY = 0;
    private static final int CAMERA = 1;
    private Intent getPictureIntent = null;
    private EditText etPassword,etConfirmPassword,etEmail,etFname,etLname;
    private Button Submit,photoSubmit;
    InputStream is = null;
    String result = "";
    int success = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_regular_user);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        etPassword = (EditText) findViewById(R.id.RegularPasswordEdit);
        etConfirmPassword = (EditText) findViewById(R.id.RegularConfirmPasswordEdit);
        etEmail = (EditText) findViewById(R.id.RegularEmailEdit);
        etFname = (EditText) findViewById(R.id.RegularFirstNameEdit);
        etLname = (EditText) findViewById(R.id.RegularLastNameEdit);

        Submit = (Button) findViewById(R.id.RegularSubmitButton);
        photoSubmit = (Button) findViewById(R.id.RegularProfilePictureButton);

        photoSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder chooser = new AlertDialog.Builder(RegisterRegularUser.this);
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

        Submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String password = "" + etPassword.getText().toString();
                String confirmPassword = ""+etConfirmPassword.getText().toString();
                String email = ""+etEmail.getText().toString();
                String fname = ""+etFname.getText().toString();
                String lname = ""+etLname.getText().toString();

                if(confirmPassword.equals(password)) {
                    if(password.trim().length() !=0 && email.trim().length() !=0 && fname.trim().length() !=0 && lname.trim().length() !=0) {
                        validateUser validate = new validateUser();
                        validate.execute(new String[]{password, confirmPassword, email, fname, lname});
                    }
                    else if(password.trim().length() == 0)
                    {
                        Toast.makeText(getApplicationContext(),"Password field blank.",Toast.LENGTH_LONG).show();
                    }
                    else if(email.trim().length() == 0)
                    {
                        Toast.makeText(getApplicationContext(),"Email field blank.",Toast.LENGTH_LONG).show();
                    }
                    else if(fname.trim().length() == 0)
                    {
                        Toast.makeText(getApplicationContext(),"First Name field blank.",Toast.LENGTH_LONG).show();
                    }
                    else if(lname.trim().length() == 0)
                    {
                        Toast.makeText(getApplicationContext(),"Last Name field blank.",Toast.LENGTH_LONG).show();
                    }

                }
                else {
                    Toast.makeText(getApplicationContext(), "Passwords don't match.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private class validateUser extends AsyncTask<String,Void,String>
    {
        protected String doInBackground(String...params) {
                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);

                nameValuePairs.add(new BasicNameValuePair("password", params[0]));
                nameValuePairs.add(new BasicNameValuePair("email", params[2]));
                nameValuePairs.add(new BasicNameValuePair("fname", params[3]));
                nameValuePairs.add(new BasicNameValuePair("lname", params[4]));

                try {
                    HttpClient httpClient = new DefaultHttpClient();

                    HttpPost httpPost = new HttpPost("http://192.168.1.119/Connect_Regular_db.php");

                    httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

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
        getMenuInflater().inflate(R.menu.menu_register_regular_user, menu);
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
