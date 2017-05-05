package com.example.derek.msuapp;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import static android.content.Intent.ACTION_VIEW;
import static android.net.Uri.parse;

public class MSUHelp extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msuhelp);

        // Create the button variables
        Button directions;
        Button weather;
        Button twitter;
        Button search;
        Button departments;

        // Associate the variables with their buttons
        directions = (Button) findViewById(R.id.directions);
        weather = (Button) findViewById(R.id.weather);
        twitter = (Button) findViewById(R.id.twitter);
        search = (Button) findViewById(R.id.search);
        departments = (Button) findViewById(R.id.departments);

        // Turn on the OnClickListener to use the buttons
        directions.setOnClickListener(this);
        weather.setOnClickListener(this);
        twitter.setOnClickListener(this);
        search.setOnClickListener(this);
        departments.setOnClickListener(this);

        VideoView video = (VideoView) findViewById(R.id.msu_vid);
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.msu));
        video.setMediaController(new MediaController(this));
        video.requestFocus();
        video.start();
    }

    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.directions:
                // Launches the DirectionsSelector Activity to pick the building for directions
                Intent intent = new Intent(MSUHelp.this, DirectionsSelector.class);
                startActivity(intent);
                break;

            case R.id.weather:
                // Launches a browser that will contain
                String uri = "https://weather.com/weather/today/l/65897:4:US";
                intent = new Intent(ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
                break;

            case R.id.twitter:
                try
                {
                    // Tries to open the MSU Twitter Page in Twitter App
                    uri = "twitter:://user?screen_name=MissouriState";
                    intent = new Intent(ACTION_VIEW, parse(uri));
                    startActivity(intent);
                }
                catch(Exception e)
                {
                    // If App is not installed, opens the page in the browser
                    uri = "https://twitter.com/MissouriState";
                    intent = new Intent(ACTION_VIEW, Uri.parse(uri));
                    startActivity(intent);
                }
                break;

            case R.id.facebook:
                try
                {
                    // Gets the versionCode of the Facebook App
                    int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                    if (versionCode >= 3002850) // Do this if app is new enough to support this request
                    {
                        intent = new Intent(ACTION_VIEW, Uri.parse("fb://facewebmodal/f?href=missouristateu"));
                        startActivity(intent);
                    }
                    else // Do this if the app is not
                    {
                        intent = new Intent(ACTION_VIEW, Uri.parse("fb://page/missouristateu"));
                        startActivity(intent);
                    }
                }
                catch (Exception e) // Otherwise open the page in the browser
                {
                    intent = new Intent(ACTION_VIEW, Uri.parse("https://facebook.com/missouristateu"));
                    startActivity(intent);
                }
                break;

            case R.id.instagram:
                // Open the instagram app
                uri = "http://instagram.com/_u/missouristate";
                intent = new Intent(ACTION_VIEW, Uri.parse(uri));

                intent.setPackage("com.instagram.android");

                try // Tries to open the MSU instagram page in the app
                {
                    startActivity(intent);
                }
                catch(Exception e) // If not open it in an internet browser
                {
                    uri = "http://instagram.com/missouristate";
                    intent = new Intent(ACTION_VIEW, Uri.parse(uri));
                    startActivity(intent);
                }
                break;

            case R.id.search:
                // Search the MSU website
                EditText searchField = (EditText) findViewById(R.id.searchText);
                String searchContent = searchField.getText().toString();
                searchContent = searchContent.replace(" ", "+");

                String url = "http://search.missouristate.edu/?q=" + searchContent + "#gsc.tab=0&gsc.q=" + searchContent + "&gsc.page=1";

                intent = new Intent(MSUHelp.this, SearchViewer.class);
                intent.putExtra("url", url);

                try
                {
                    startActivity(intent);
                }
                catch (Exception e)
                {
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, "Please install an internet browser.", Toast.LENGTH_LONG);
                    toast.show();
                }
                break;

            case R.id.departments:
                // Opens a list of the departments at MSU
                intent = new Intent(MSUHelp.this, DepartmentSelector.class);
                startActivity(intent);
                break;
        }
    }
}