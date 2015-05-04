package com.example.brandon.proconnect;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
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
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/** LogInScreen handles the user info required to log in.
 *
 * <p>
 *     Also contains button to register a user and
 * users can choose to be a premium or
 * regular member.
 * </p>
 *
 */
public class LogInScreen extends ActionBarActivity {

    private String username,password;
    EditText usernameField, passwordField;
    private Button LogInButton;
    InputStream is = null;
    String resultRegular = "";
    String resultPremium = "";
    String rejected = "";
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

        /**
         * This operation will try to log in a user once clicked.
         *
         * <p>
         *  Tells user "incorrect email or password" if
         *  credentials are incorrect, otherwise
         *  send user to their homepage.
         * </p>
         */
        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = usernameField.getText().toString();
                password = passwordField.getText().toString();

                    if(username.trim().length() !=0 && password.trim().length() !=0) {
                        //sends username and password to URL
                        try {
                            HttpClient httpClient = new DefaultHttpClient();

                            HttpGet httpPost = new HttpGet("http://proconnect.herokuapp.com/androidLogin?email=" + username + ";password=" + password);

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

                        //PROCCESS WBSITES REPSONSE
                        try {
                            JSONObject jsonRegular = new JSONObject(resultRegular);
                            if(jsonRegular.has("Rejected"))
                            {
                                rejected = jsonRegular.getString("Rejected");

                                if(rejected.equals("Invalid Password"))
                                    Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
                                else if(rejected.equals("User Not Found"))
                                    Toast.makeText(getApplicationContext(),"User Not Found",Toast.LENGTH_LONG).show();

                            }
                            else if(jsonRegular.has("id"))
                            {
                                String email = jsonRegular.getString("email");
                                String currentEmployer = jsonRegular.getString("currentEmployer");
                                String recentSchool = jsonRegular.getString("recentSchool");
                                String location = jsonRegular.getString("location");
                                String aboutMe = jsonRegular.getString("aboutMe");
                                String experience = jsonRegular.getString("experience");
                                String education = jsonRegular.getString("education");
                                String project = jsonRegular.getString("project");
                                Intent intent = new Intent(LogInScreen.this, UserHomePage.class);
                                intent.putExtra("email", email);
                                startActivity(intent);
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

    /** <p>
     * This method displays a dialog box that asks
     * whether the user want to be a premium or
     * regular user. Based on what is pressed
     * the user will be sent to a page that
     * corresponds with what type of user they picked.
     * </p>
     */
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
