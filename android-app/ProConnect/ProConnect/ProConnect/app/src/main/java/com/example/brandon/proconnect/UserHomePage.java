package com.example.brandon.proconnect;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**UserHomePage display the user profile.
 *
 * <p>
 * Holds a container in the action bar to
 * allow users to navigate through their
 * profile page.
 * </p>
 */
public class UserHomePage extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home_page);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_user_home_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId())
        {
            case R.id.edit_profile:
                Intent intent = new Intent(UserHomePage.this,EditProfile.class);
                startActivity(intent);
                break;
            case R.id.LogOut:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
