package com.example.tarotraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChoiceCardLoveAlignment extends AppCompatActivity {

    Button buttonNext;
    TextView title, materialTextView1,materialTextView2,materialTextView3,materialTextView4,materialTextView5,textView,choiceCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_card_love_alignment);

        buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));


        title = findViewById(R.id.title);
        title.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

        materialTextView5= findViewById(R.id.materialTextView5);
        buttonNext.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoRegular)));

        materialTextView4= findViewById(R.id.materialTextView4);
        buttonNext.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoRegular)));

        materialTextView3= findViewById(R.id.materialTextView3);
        buttonNext.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoRegular)));

        materialTextView2= findViewById(R.id.materialTextView2);
        buttonNext.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoRegular)));

        materialTextView1= findViewById(R.id.materialTextView);
        buttonNext.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoRegular)));

        textView= findViewById(R.id.textView);
        buttonNext.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

        choiceCard= findViewById(R.id.choiceCard);
        buttonNext.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
    }

    public void onLoveLearning(View view) {
        Intent intent = new Intent(ChoiceCardLoveAlignment.this, LearningLoveAlignment.class);
        startActivity(intent);
    }
}