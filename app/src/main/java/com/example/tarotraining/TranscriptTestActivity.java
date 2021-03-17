package com.example.tarotraining;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TranscriptTestActivity extends AppCompatActivity {
    private ImageView mQuizImage;

    private String mAnswer;

    private int mScore = 0,mQuizNum = 1,questionNum = 0;

    private TextView mQuestionView, mQuizNumber;

    boolean check;

    private QuestionTranscriptTest questionTranscriptTest = new QuestionTranscriptTest();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests);

        mQuestionView = findViewById(R.id.question_textview);
        mQuizNumber = findViewById(R.id.quiznum_textview);

        updateQuestion();

        Button submit = findViewById(R.id.button);

        mQuestionView.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
        mQuizNumber.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
        submit.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check) {

                if (questionTranscriptTest.getQuestionType(questionNum) == com.example.tarotraining.Constants.RADIO_BUTTON_CONST){

                    if (questionTranscriptTest.getCorrectAnswer(questionNum).equals(mAnswer)){

                        mScore++;
                        showToastCorrectAnswer();

                    }

                    else showToastWrongAnswer();

                }

                if (questionNum == questionTranscriptTest.getLength()-1){

                    Intent intentResult = new Intent(com.example.tarotraining.TranscriptTestActivity.this, com.example.tarotraining.ResultActivity.class);
                    intentResult.putExtra(com.example.tarotraining.Constants.TOTAL_QUESTIONS_CONST, questionTranscriptTest.getLength());
                    intentResult.putExtra(com.example.tarotraining.Constants.FINAL_SCORE_CONST, mScore);
                    startActivity(intentResult);

                    questionNum = 0;
                    mQuizNum = 1;
                    mScore=0;

                } else {
                    questionNum++;
                    mQuizNum++;
                    check = false;
                }

                updateQuestion();

                }else {
                    showToastChooseAnswer();
                }
            }
        });

    }

    private void showToastCorrectAnswer(){
        Toast.makeText(this, com.example.tarotraining.Constants.CORRECT_CONST, Toast.LENGTH_SHORT).show();
    }

    private void showToastWrongAnswer(){
        Toast.makeText(this, com.example.tarotraining.Constants.WRONG_CONST, Toast.LENGTH_SHORT).show();
    }

    private void showToastChooseAnswer(){
        Toast.makeText(this, Constants.CHOOSE_ANSWER, Toast.LENGTH_SHORT).show();
    }

    private void updateQuestion(){

        LinearLayout answerLayout = findViewById(R.id.answers);
        answerLayout.removeAllViews();
        mAnswer= com.example.tarotraining.Constants.NOTHING_CONST;

        mQuizNumber.setText(mQuizNum + com.example.tarotraining.Constants.SLASH_CONST + String.valueOf(questionTranscriptTest.getLength()));
        mQuestionView.setText(questionTranscriptTest.getQuestions(questionNum));

        if (questionTranscriptTest.getQuestionType(questionNum) == com.example.tarotraining.Constants.RADIO_BUTTON_CONST){
            showRadioButtonAnswers(questionNum);
        }

        showImage();
        ScrollView scrollView = findViewById(R.id.scrollView);
        scrollView.smoothScrollTo(0, 0);

    }

    private void showImage(){
        mQuizImage = findViewById(R.id.quiz_image);
        String img = questionTranscriptTest.getImages(questionNum);
        mQuizImage.setImageResource(getResources().getIdentifier(img, com.example.tarotraining.Constants.DRAWABLE_CONST, getPackageName()));
    }

    private void showRadioButtonAnswers(int qnum){
        final LinearLayout answerLayout = findViewById(R.id.answers);
        RadioGroup rg = new RadioGroup(this);
        rg.setOrientation(RadioGroup.VERTICAL);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        rg.setLayoutParams(lp);
        rg.setPadding(90, 0, 0, 0);

        final RadioButton[] bArray = new RadioButton[3];

        for (int i=0; i<=2; i++){
            bArray[i] = new RadioButton(this);
            bArray[i].setText(questionTranscriptTest.getChoice(qnum)[i]);
            bArray[i].setTextColor(Color.rgb(97,57,95));
            bArray[i].setPadding(100, 16, 8, 16);
            bArray[i].setTextSize(20);
            bArray[i].setId(i);
            bArray[i].setWidth(1500);
            bArray[i].setLinkTextColor(ColorStateList.valueOf((int) 61395F));
            rg.addView(bArray[i]);

        }

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                mAnswer = questionTranscriptTest.getChoice(questionNum)[checkedId];
                check = true;
            }
        });

        answerLayout.addView(rg);

    }

}
