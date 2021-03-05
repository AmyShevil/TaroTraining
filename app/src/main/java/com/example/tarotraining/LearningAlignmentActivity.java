package com.example.tarotraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LearningAlignmentActivity extends AppCompatActivity {

    Button buttonScan, buttonEnd;
    TextView description,title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_alignment);


        description = findViewById(R.id.describe);
        description.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoRegular)));


        title = findViewById(R.id.title);
        title.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

        buttonScan= findViewById(R.id.buttonScan);
        buttonScan.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
        buttonEnd= findViewById(R.id.buttonScan);
        buttonEnd.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
    }

    public void onMain(View view) {
        Intent intent = new Intent(LearningAlignmentActivity.this, MainActivity.class);
        startActivity(intent);
    }
}