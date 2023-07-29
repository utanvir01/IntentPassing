package com.tanvir.intantpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String name = intent.getStringExtra("name");
        int roll = intent.getIntExtra("roll", 0);

        TextView textTitle, textName, textRoll;

        textTitle = findViewById(R.id.textTitle);
        textName = findViewById(R.id.textName);
        textRoll = findViewById(R.id.textRoll);

        textTitle.setText("title: " + title);
        textRoll.setText("roll: " + roll);
        textName.setText("name: " + name);
        getSupportActionBar().setTitle("Student Info");
    }
}