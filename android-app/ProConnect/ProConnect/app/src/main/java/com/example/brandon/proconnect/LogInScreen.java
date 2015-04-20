package com.example.brandon.proconnect;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
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
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;


public class LogInScreen extends ActionBarActivity {

    private String username,password;
    EditText usernameField, passwordField;
    private Button LogInButton;
    InputStream is = null;
    String resultRegular = "";
    String resultPremium = "";
    boolean isPremium = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);

        usernameField = (EditText) findViewById(R.id.UsernameEditText);
        passwordField = (EditText) findViewById(R.id.PasswordEditText);

        LogInButton = (Button) findViewById(R.id.LogInButton);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = usernameField.getText().toString();
                password = passwordField.getText().toString();

                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
                nameValuePairs.add(new BasicNameValuePair("name", username));
                nameValuePairs.add(new BasicNameValuePair("password", password));

                    if(username.trim().length() !=0 && password.trim().length() !=0) {
                        //sends username and password to URL
                        try {
                            HttpClient httpClient = new DefaultHttpClient();

                            HttpGet httpPost = new HttpGet("http://proconnect.herokuapp.com/androidLogin?name=Matt;password=Password");

                            HttpResponse response = httpClient.execute(httpPost);

                            HttpEntity entity = response.getEntity();

                            is = entity.getContent();


                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //URL SENDS BACK RESPONSE
                        try {
                            BufferedReader response = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
                            StringBuilder sb = new StringBuilder();
                            String line = null;
                            while ((line = response.readLine()) != null) {
                                sb.append(line + "\n");

                                is.close();
                                resultRegular = sb.toString();

                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        try {
                            HttpClient httpClient = new DefaultHttpClient();

                            HttpPost httpPost = new HttpPost("http://192.168.1.119/Log_in_Premium.php");

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
                                resultPremium = sb.toString();


                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //PROCCESS WBSITES REPSONSE
                        try {
                            JSONObject jsonRegular = new JSONObject(resultRegular);
                            //JSONObject jsonPremium = new JSONObject(resultPremium);

                            String successRegular = jsonRegular.getString("Accepted");
                            //int successPremium = jsonPremium.getInt("success");

                            //if (successPremium == 1)
                                isPremium = true;

                            if (successRegular.equals("True")) {
                                Intent intent = new Intent(LogInScreen.this, UserHomePage.class);
                                intent.putExtra("username", username);
                                startActivity(intent);
                                isPremium = false;
                            } else {
                                Toast.makeText(getApplicationContext(), "Incorrect Username or Password", Toast.LENGTH_LONG).show();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    else if(username.trim().length() == 0)
                    {
                        Toast.makeText(getApplicationContext(),"No username entered.",Toast.LENGTH_LONG).show();
                    }
                    else if(password.trim().length() == 0)
                    {
                        Toast.makeText(getApplicationContext(),"No password entered.",Toast.LENGTH_LONG).show();
                    }
            }
        });
    }

    private class ValidateUser extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            return null;
        }
    }

    public void startRegistration(View view)
    {
        AlertDialog.Builder checkUserType = new AlertDialog.Builder(this);
        checkUserType.setMessage("What type of user do you want to be? Premium or Regular?");
        checkUserType.setPositiveButton("Regular", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(LogInScreen.this,RegisterRegularUser.class);
                startActivity(intent);

            }
        });
        checkUserType.setNegativeButton("Premium", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(LogInScreen.this, RegisterPremiumUser.class);
                startActivity(intent);
            }
        });

        checkUserType.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_log_in_screen, menu);
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
