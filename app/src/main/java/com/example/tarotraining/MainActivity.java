package com.example.tarotraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView mainTextView;
    Button alignmentButton,testButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTextView = findViewById(R.id.mainNameTextView);
        mainTextView.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.eczarExtraBold)));

        alignmentButton = findViewById(R.id.mainAlignmentButton);
        alignmentButton.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

        testButton = findViewById(R.id.mainTestButton);
        testButton.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
    }

    public void onAlignment(View view) {

        Intent intent = new Intent(MainActivity.this, AlignmentActivity.class);
        startActivity(intent);
    }

    public void onTest(View view) {

        Intent intent = new Intent(MainActivity.this, Test.class);
        startActivity(intent);
    }
}