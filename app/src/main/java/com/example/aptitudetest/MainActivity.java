package com.example.aptitudetest;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aptitudetest.Questions;

public class MainActivity extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Aptitude Test");

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Questions.class);
                startActivity(intent);
            }
        });
    }
}

