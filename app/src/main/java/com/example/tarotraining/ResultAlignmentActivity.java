package com.example.tarotraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultAlignmentActivity extends AppCompatActivity {

    Button materialButton, materialButton2;
    TextView scanResult,title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_alignment);


        materialButton = findViewById(R.id.materialButton);
        materialButton.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
        materialButton2 = findViewById(R.id.materialButton2);
        materialButton2.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

        scanResult = findViewById(R.id.scanResult);
        scanResult.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoRegular)));
        title = findViewById(R.id.title);
        title.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

    }

    public void onMain(View view) {
        Intent intent = new Intent(ResultAlignmentActivity.this, MainActivity.class);
        startActivity(intent);
    }
}