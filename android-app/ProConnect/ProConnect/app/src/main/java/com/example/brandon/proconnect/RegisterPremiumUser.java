package com.example.brandon.proconnect;

import android.os.StrictMode;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class RegisterPremiumUser extends ActionBarActivity {

    private EditText etName,etPassword,etConfirmPassword,etEmail,etCompanyName;
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_premium_user);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        etName = (EditText) findViewById(R.id.PremiumUsernameEdit);
        etPassword = (EditText) findViewById(R.id.PremiumPasswordEdit);
        etConfirmPassword = (EditText) findViewById(R.id.PremiumConfirmPasswordEdit);
        etEmail = (EditText) findViewById(R.id.PremiumEmailEdit);
        etCompanyName = (EditText) findViewById(R.id.ComanyNameEdit);


        Submit = (Button) findViewById(R.id.PremiumRegisterSubmitButton);

        Submit.setOnClickListener(new View.OnClickListener() {

            InputStream is = null;

            @Override
            public void onClick(View v) {
                String name = "" + etName.getText().toString();
                String password = "" + etPassword.getText().toString();
                String confirmPassword = ""+etConfirmPassword.getText().toString();
                String email = ""+etEmail.getText().toString();
                String companyName = ""+etCompanyName.getText().toString();

                if(confirmPassword.equals(password)) {
                    List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);

                    nameValuePairs.add(new BasicNameValuePair("name", name));
                    nameValuePairs.add(new BasicNameValuePair("password", password));
                    nameValuePairs.add(new BasicNameValuePair("email", email));
                    nameValuePairs.add(new BasicNameValuePair("companyName",companyName));

                    try {
                        HttpClient httpClient = new DefaultHttpClient();

                        HttpPost httpPost = new HttpPost("http://192.168.1.129/Connect_Premium_db.php");

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
