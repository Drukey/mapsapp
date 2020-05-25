package com.example.mapsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button mSettings = findViewById(R.id.settings);



 mSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.this, CustomerSettingsActivity.class);
                startActivity(intent);
            }
        });





    }

    public void openProfile(View view) {
        Intent in= new Intent(Settings.this, CustomerSettingsActivity.class);
        startActivity(in);

    }
}
