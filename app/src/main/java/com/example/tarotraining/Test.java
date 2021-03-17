package com.example.tarotraining;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Test extends AppCompatActivity {

    Button transcriptTest,nameTest,situationSchemaTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        transcriptTest = findViewById(R.id.transcriptTest);
        transcriptTest.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

        nameTest = findViewById(R.id.nameTest);
        nameTest.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

        situationSchemaTest = findViewById(R.id.situationSchemaTest);
        situationSchemaTest.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
    }

    public void onTranscriptTestClick (View view){
        Log.i("TestActivityLog", "Переход на TranscriptTestActivity");
        Intent intent = new Intent(com.example.tarotraining.Test.this, TranscriptTestActivity.class);
        startActivity(intent);
    }

    public void onNameTestClick (View view){
        Log.i("TestActivityLog", "Переход на NameTestActivity");
        Intent intent = new Intent(com.example.tarotraining.Test.this, NameTestActivity.class);
        startActivity(intent);
    }

    public void onSituationSchemaTestClick (View view){
        Log.i("TestActivityLog", "Переход на SituationSchemaTestActivity");
        Intent intent = new Intent(com.example.tarotraining.Test.this, SituationSchemaTestActivity.class);
        startActivity(intent);
    }

}