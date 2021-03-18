package com.example.tarotraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DescriptionLoveAlignment extends AppCompatActivity {

    Button nextButton;
    TextView description,title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_love_alignment);

        nextButton = findViewById(R.id.nextButton);
        nextButton.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));


        description = findViewById(R.id.describe);
        description.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoRegular)));


        title = findViewById(R.id.title);
        title.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

    }

    public void onLoveChoice(View view) {
        Intent intent = new Intent(DescriptionLoveAlignment.this, ChoiceCardLoveAlignment.class);
        startActivity(intent);
    }
}