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
import org.apache.http.client.methods.HttpGet;
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
 * RegisterRegularUser display the xml file for
 * A regular user registration form.
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
public class RegisterRegularUser extends ActionBarActivity {

    private EditText etPassword,etConfirmPassword,etEmail;
    private Button Submit;
    InputStream is = null;
    String result = "";
    String success = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_regular_user);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        etPassword = (EditText) findViewById(R.id.RegularPasswordEdit);
        etConfirmPassword = (EditText) findViewById(R.id.RegularConfirmPasswordEdit);
        etEmail = (EditText) findViewById(R.id.RegularEmailEdit);
        Submit = (Button) findViewById(R.id.RegularSubmitButton);


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
                        validateUser validate = new validateUser();
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

                }
                else {
                    Toast.makeText(getApplicationContext(), "Passwords don't match.", Toast.LENGTH_LONG).show();
                }
            }
        });

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
    private class validateUser extends AsyncTask<String,Void,String>
    {
        /**This is a Asynctask defined method.
         *
         * @param params The information that the user wants to store.
         * @return The string representation of JSON object
         */
        protected String doInBackground(String...params) {

                try {
                    HttpClient httpClient = new DefaultHttpClient();

                    HttpGet httpPost = new HttpGet("http://proconnect.herokuapp.com/androidCreateAccount?email=" + params[2] + ";password=" + params[0]);

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
                if(json.has("Accepted"))
                    success = json.getString("Accepted");
                else
                    success = "";

                if (success.equals("Account Created")) {
                    Toast.makeText(getApplicationContext(), "Account Created!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(RegisterRegularUser.this,BeginningInfoPage.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "User Exists!", Toast.LENGTH_LONG).show();
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
