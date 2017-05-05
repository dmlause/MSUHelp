package com.example.derek.msuapp;

import android.app.ListActivity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.Toast;

public class DirectionsSelector extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listBuildings = getListView();

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listBuildings, View v, int position, long id)
            {
                /* CURRENTLY IN WALKING MODE
                   WORK ON MODE SELECTOR?
                 */
                String uri = "google.navigation:q=" + Buildings.building[position].getLatitude() + "," + Buildings.building[position].getLongitude() + "&mode=w";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setPackage("com.google.android.apps.maps");
                try
                {
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e)
                {
                    try
                    {
                        uri = "https://maps.google.com//maps?daddr=" + Buildings.building[position].getLongitude() + "," + Buildings.building[position].getLongitude();
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        startActivity(browserIntent);
                    }
                    catch(ActivityNotFoundException innerE)
                    {
                        Context context = getApplicationContext();
                        Toast toast = Toast.makeText(context, "Please install a Google Maps or an internet browser.", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
            }
        };

        ArrayAdapter<Buildings> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Buildings.building);
        listBuildings.setAdapter(listAdapter);
        listBuildings.setOnItemClickListener(itemClickListener);
    }

}
