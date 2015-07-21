package org.lauriewhite.project0;

/*
 * Copyright (C) Laurie White <copyright@lauriewhite.org>
 */

//  TODO Figure out what the copyright really should be!


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * An application to link to all other applications built
 * as part of the Android Nanodegree.  This first version only
 * displays messages promising great things to come.
 *
 * @author Laurie White
 * @version 21 July 2015
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Will display the appropriate Toast message for the button pressed,
     * based on the ID of the button.
     *
     * @param view the button that was pressed
     */
    public void showToast(View view) {
        Button pressed = (Button) view;
        //  TODO : Figure out what these buttons should really be.  Obviously,
        //  the list in the assignment is wrong, since it still includes Spotify.

        /* Okay, so I could create the Toast outside of the switch and display it
           after the switch, but over time I won't be displaying Toast for
           these, so instead, let's have each option do its own thing so it's easier to
           adjust in later versions.
         */
        Toast t;
        switch (pressed.getId()) {
            case R.id.project1:
                t = Toast.makeText(this, "This button will launch my Popular Movie App.", Toast.LENGTH_LONG);
                t.show();
            case R.id.project2:
                t = Toast.makeText(this, "This button will launch my Popular Movie App, Stage 2.", Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.project3:
                t = Toast.makeText(this, "This button will launch the Super Duo App.", Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.project4:
                t = Toast.makeText(this, "This button will launch my Build It Bigger App.", Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.project5:
                t = Toast.makeText(this, "This button will launch my Make It Material App.", Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.project6:
                t = Toast.makeText(this, "This button will launch my Go Ubiquitous App.", Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.project7:
                t = Toast.makeText(this, "This button will launch my Capstone Project, Stage 1 App.", Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.project8:
                t = Toast.makeText(this, "This button will launch my final Capstone App.", Toast.LENGTH_LONG);
                t.show();
                break;
            default:
                t = Toast.makeText(this, "Hmmnm, shouldn't see the value " + pressed.getId(), Toast.LENGTH_LONG);
                t.show();
                break;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            Toast t = Toast.makeText(this, "No settings available yet", Toast.LENGTH_LONG);
            t.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
