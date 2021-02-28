package com.example.tarotraining.alignment.futureAlignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tarotraining.R;
import com.example.tarotraining.alignment.AlignmentActivity;

public class DescriptionAlignmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_alignment);
    }

    public void onFutureChoice(View view) {
        Intent intent = new Intent(DescriptionAlignmentActivity.this, ChoiceCardAlignmentActivity.class);
        startActivity(intent);
    }
}