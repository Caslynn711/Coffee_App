package com.example.coffeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [] coffee = {"STARBUCKS", "DUNKIN' DONUTS", "WAWA", "PANERA"};
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, coffee));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(MainActivity.this, Starbucks.class));
                break;

            case 1:
                startActivity(new Intent(MainActivity.this, Dunkin.class));
                break;

            case 2:
                startActivity(new Intent(MainActivity.this, Wawa.class));
                break;

            case 3:
                startActivity(new Intent(MainActivity.this, Panera.class));
        }
    }
}
