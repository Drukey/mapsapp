package com.example.mapsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void openMap(View view) {
        Intent home =  new Intent(Home.this, CustomerMapActivity.class);
        startActivity(home);
    }

    public void openSearch(View view) {
        Intent search =  new Intent(Home.this, Search.class);
        startActivity(search);
    }

    public void openSettings(View view) {
        Intent settings =  new Intent(Home.this, Settings.class);
        startActivity(settings);
    }

    public void openHistory(View view) {
        Intent history =  new Intent(Home.this, HistorySingleActivity.class);
        startActivity(history);
    }

}
