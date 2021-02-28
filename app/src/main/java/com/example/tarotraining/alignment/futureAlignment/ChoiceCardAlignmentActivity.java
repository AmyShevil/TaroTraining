package com.example.tarotraining.alignment.futureAlignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tarotraining.R;

public class ChoiceCardAlignmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_card_alignment);
    }

    public void onFutureLearning(View view) {
        Intent intent = new Intent(ChoiceCardAlignmentActivity.this, LearningAlignmentActivity.class);
        startActivity(intent);
    }
}