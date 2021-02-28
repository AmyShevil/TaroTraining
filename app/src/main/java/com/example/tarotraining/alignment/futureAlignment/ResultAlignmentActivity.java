package com.example.tarotraining.alignment.futureAlignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tarotraining.MainActivity;
import com.example.tarotraining.R;

public class ResultAlignmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_alignment);
    }

    public void onMain(View view) {
        Intent intent = new Intent(ResultAlignmentActivity.this, MainActivity.class);
        startActivity(intent);
    }
}