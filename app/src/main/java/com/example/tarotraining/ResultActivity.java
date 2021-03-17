package com.example.tarotraining;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {


    TextView textCorrectText,textPercentText;
    private int totalQuestions,finalScore;
    Button restartButton;
    int mPercentScore;
    String finalScoreText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textCorrectText = findViewById(R.id.correctTextView);
        textPercentText = findViewById(R.id.percentTextView);
        restartButton  = findViewById(R.id.restartSchemaTestButton);

        Intent intent = getIntent();
        totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS_CONST, 0);
        finalScore = intent.getIntExtra(Constants.FINAL_SCORE_CONST, 0);

        mPercentScore = finalScore * 100 / totalQuestions;

        textPercentText.setText(String.format(Constants.FORMAT_PERCENT_CONST, Integer.toString(mPercentScore)));

        finalScoreText = getString(R.string.textCorrectScore, finalScore, totalQuestions);

        textCorrectText.setText(finalScoreText);

        restartButton.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartQuiz(v);
            }});

    }

    public void restartQuiz(View view){

        Intent intent = new Intent(com.example.tarotraining.ResultActivity.this, MainActivity.class);
        startActivity(intent);

    }

}
