package com.example.tarotraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlignmentActivity extends AppCompatActivity {

    Button futureButton, loveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alignment);

        futureButton = findViewById(R.id.buttonFuture);
        futureButton.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

        loveButton = findViewById(R.id.buttonLove);
        loveButton.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
    }

    public void onFutureAlignment(View view) {
        Intent intent = new Intent(AlignmentActivity.this, DescriptionAlignmentActivity.class);
        startActivity(intent);
    }

    public void onLoveAlignment(View view) {
        Intent intent = new Intent(AlignmentActivity.this, DescriptionLoveAlignment.class);
        startActivity(intent);
    }
}