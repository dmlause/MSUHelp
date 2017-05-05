package com.example.derek.msuapp;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DepartmentSelector extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDepartments = getListView();

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                String uri = Departments.departments[position].getDept_url();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));

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
            }
        };

        ArrayAdapter<Departments> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Departments.departments);
        listDepartments.setAdapter(listAdapter);
        listDepartments.setOnItemClickListener(itemClickListener);
    }
}
