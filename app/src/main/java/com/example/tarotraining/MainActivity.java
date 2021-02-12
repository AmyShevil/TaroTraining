package com.example.tarotraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAlignment(View view) {
        Intent intent = new Intent(MainActivity.this, AlignmentActivity.class);
        startActivity(intent);
    }

    public void onTest(View view) {
       // Intent intent = new Intent(MainActivity.this, .class);
       // startActivity(intent);
    }
}