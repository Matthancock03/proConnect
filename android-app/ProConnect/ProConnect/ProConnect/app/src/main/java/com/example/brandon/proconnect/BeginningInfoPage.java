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
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class BeginningInfoPage extends ActionBarActivity {

    private static final int GALLERY = 0;
    private static final int CAMERA = 1;
    private Intent getPictureIntent = null;
    private EditText etFname,etLname,etCurrentEmployer,etRecentSchool,etLocation,etExperience,etEducation,etProjects,etAboutMe;
    private ImageView profilePic;
    private Button Submit,photoSubmit;
    InputStream is = null;
    String set = "";
    String result = "";
    String success = "";
    String json = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginning_info_page);

        etFname = (EditText) findViewById(R.id.FirstNameEdit);
        etLname = (EditText) findViewById(R.id.LastNameEdit);
        etCurrentEmployer = (EditText) findViewById(R.id.CurrentEmployerEdit);
        etRecentSchool = (EditText) findViewById(R.id.RecentSchoolEdit);
        etLocation = (EditText) findViewById(R.id.LocationEdit);
        etExperience = (EditText) findViewById(R.id.ExperienceEdit);
        etEducation = (EditText) findViewById(R.id.EducationEdit);
        etProjects = (EditText) findViewById(R.id.ProjectEdit);
        etAboutMe = (EditText) findViewById(R.id.AboutMeEdit);
        profilePic = (ImageView) findViewById(R.id.InfoThumbnail);
        Submit = (Button) findViewById(R.id.InfoSubmitButton);
        photoSubmit = (Button) findViewById(R.id.PictureButton);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        photoSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder chooser = new AlertDialog.Builder(BeginningInfoPage.this);
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

                String firstName = "" + etFname.getText().toString();
                String lastName = "" + etLname.getText().toString();
                String CurrentEmployer = "" + etCurrentEmployer.getText().toString();
                String RecentSchool = "" + etRecentSchool.getText().toString();
                String Location = "" + etLocation.getText().toString();
                String Experience = "" + etExperience.getText().toString();
                String Education = "" + etEducation.getText().toString();
                String Project = "" + etProjects.getText().toString();
                String aboutMe = "" + etAboutMe.getText().toString();

                if(firstName.trim().length() !=0 && lastName.trim().length() !=0 && CurrentEmployer.trim().length() !=0 && RecentSchool.trim().length() != 0 && Location.trim().length() !=0 && Education.trim().length() !=0 && Project.trim().length() !=0 && Experience.trim().length() !=0)
                {
                    UserInfo userinfo = new UserInfo();
                    userinfo.execute(new String[]{firstName,lastName,CurrentEmployer,RecentSchool,Location,Experience,Education,Project,aboutMe});
                }
                else if(firstName.trim().length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"First Name field blank.",Toast.LENGTH_LONG).show();
                }
                else if(lastName.trim().length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"Last Name field blank.",Toast.LENGTH_LONG).show();
                }
                else if(CurrentEmployer.trim().length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"Current Employer field blank.",Toast.LENGTH_LONG).show();
                }
                else if(RecentSchool.trim().length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"Recent School field blank.",Toast.LENGTH_LONG).show();
                }
                else if(Location.trim().length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"Location field blank.",Toast.LENGTH_LONG).show();
                }
                else if(Experience.trim().length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"Experience field blank.",Toast.LENGTH_LONG).show();
                }
                else if(Education.trim().length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"Education field blank.",Toast.LENGTH_LONG).show();
                }
                else if(Project.trim().length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"Project field blank.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

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

    private class UserInfo extends AsyncTask<String, Void, String>
    {
        @Override
        protected String doInBackground(String... params) {
            json = "{\"userName\":\"" + params[0] + " " + params[1] + "\"," + "\"currentEmployer\":\"" + params[2] + "\"," + "\"recentSchool\":\"" + params[3] + "\"," + "\"aboutMe\":\"" + params[8] + "\"," + "\"experience\":\"" + params[4] + "\"," + "\"education\":\"" + params[5] + "\"," + "\"projects\":\"" + params[6] + "\"}";
            try
            {
                JSONObject usermodel = new JSONObject(json);
                set = usermodel.toString();
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }

            try
            {
                HttpClient httpClient = new DefaultHttpClient();

                HttpPost httpPost = new HttpPost("http://proconnect.herokuapp.com/androidSaveUser");

                httpPost.setEntity(new StringEntity(set));

                HttpResponse response = httpClient.execute(httpPost);

                HttpEntity entity = response.getEntity();

                is = entity.getContent();
            }
            catch (Exception e)
            {
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

        @Override
        protected void onPostExecute(String s) {
            if(s.length() != 0) {
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
            }
            super.onPostExecute(s);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_beginning_info_page, menu);
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
