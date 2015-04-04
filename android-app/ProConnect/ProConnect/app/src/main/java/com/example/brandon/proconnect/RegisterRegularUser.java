package com.example.brandon.proconnect;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class RegisterRegularUser extends ActionBarActivity {

    private EditText etName,etPassword,etConfirmPassword,etEmail,etFname,etLname;
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_regular_user);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        etName = (EditText) findViewById(R.id.RegularUsernameEdit);
        etPassword = (EditText) findViewById(R.id.RegularPasswordEdit);
        etConfirmPassword = (EditText) findViewById(R.id.RegularConfirmPasswordEdit);
        etEmail = (EditText) findViewById(R.id.RegularEmailEdit);
        etFname = (EditText) findViewById(R.id.RegularFirstNameEdit);
        etLname = (EditText) findViewById(R.id.RegularLastNameEdit);

        Submit = (Button) findViewById(R.id.RegularSubmitButton);

        Submit.setOnClickListener(new View.OnClickListener() {

            InputStream is = null;

            @Override
            public void onClick(View v) {
                String name = "" + etName.getText().toString();
                String password = "" + etPassword.getText().toString();
                String confirmPassword = ""+etConfirmPassword.getText().toString();
                String email = ""+etEmail.getText().toString();
                String fname = ""+etFname.getText().toString();
                String lname = ""+etLname.getText().toString();

                if(confirmPassword.equals(password)) {
                    List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);

                    nameValuePairs.add(new BasicNameValuePair("name", name));
                    nameValuePairs.add(new BasicNameValuePair("password", password));
                    nameValuePairs.add(new BasicNameValuePair("email", email));
                    nameValuePairs.add(new BasicNameValuePair("fname", fname));
                    nameValuePairs.add(new BasicNameValuePair("lname", lname));

                    try {
                        HttpClient httpClient = new DefaultHttpClient();

                        HttpPost httpPost = new HttpPost("http://10.189.17.58/Connect_Regular_db.php");

                        httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

                        HttpResponse response = httpClient.execute(httpPost);

                        HttpEntity entity = response.getEntity();

                        is = entity.getContent();

                        Toast.makeText(getApplicationContext(), "Account Created!", Toast.LENGTH_LONG).show();

                       finish();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else
                {
                    Toast.makeText(getApplicationContext(),"Passwords don't match.",Toast.LENGTH_LONG).show();
                }
            }
        });
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
