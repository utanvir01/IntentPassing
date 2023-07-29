package com.tanvir.intantpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext;
        btnNext = findViewById(R.id.btnNext);

        Intent iNext = new Intent(MainActivity.this, secondActivity.class);
        iNext.putExtra("title", "HOME");
        iNext.putExtra("name", "Rohit");
        iNext.putExtra("roll", 12);
        getSupportActionBar().setTitle("");

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iNext);
            }
        });
    }
}