package com.example.tarotraining.alignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tarotraining.R;
import com.example.tarotraining.alignment.futureAlignment.DescriptionAlignmentActivity;

public class AlignmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alignment);
    }

    public void onFutureAlignment(View view) {
        Intent intent = new Intent(AlignmentActivity.this, DescriptionAlignmentActivity.class);
        startActivity(intent);
    }
}