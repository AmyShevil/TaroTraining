package com.example.tarotraining;

import android.content.Intent;
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

public class NameTestActivity extends AppCompatActivity {

    private ImageView mQuizImage;

    private String mAnswer;
    boolean check;

    private int mScore = 0,mQuizNum = 1,questionNum = 0;

    private TextView mQuestionView,mQuizNumber;

    private QuestionNameTest questionsNameTest = new QuestionNameTest();
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tests);
        submit = findViewById(R.id.button);
        mQuestionView = findViewById(R.id.question_textview);
        mQuizNumber = findViewById(R.id.quiznum_textview);

        mQuestionView.setTypeface(Typeface.createFromAsset(getAssets(), getString(R.string.robotoMedium)));
        mQuizNumber.setTypeface(Typeface.createFromAsset(getAssets(), getString(R.string.robotoMedium)));
        submit.setTypeface(Typeface.createFromAsset(getAssets(), getString(R.string.robotoMedium)));

        updateQuestion();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (check) {

                    if (questionsNameTest.getQuestionType(questionNum) == Constants.RADIO_BUTTON_CONST) {

                        if (questionsNameTest.getCorrectAnswer(questionNum).equals(mAnswer)) {

                            mScore++;
                            showToastCorrectAnswer();

                        } else showToastWrongAnswer();

                    }

                    if (questionNum == questionsNameTest.getLength() - 1) {

                        Intent intentResult = new Intent(NameTestActivity.this, ResultActivity.class);
                        intentResult.putExtra(Constants.TOTAL_QUESTIONS_CONST, questionsNameTest.getLength());
                        intentResult.putExtra(Constants.FINAL_SCORE_CONST, mScore);
                        startActivity(intentResult);

                        questionNum = 0;
                        mQuizNum = 1;
                        mScore = 0;

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
        Toast.makeText(this, Constants.CORRECT_CONST, Toast.LENGTH_SHORT).show();
    }

    private void showToastWrongAnswer(){
        Toast.makeText(this, Constants.WRONG_CONST, Toast.LENGTH_SHORT).show();
    }

    private void showToastChooseAnswer(){
        Toast.makeText(this, Constants.CHOOSE_ANSWER, Toast.LENGTH_SHORT).show();
    }

    private void updateQuestion(){

        LinearLayout answerLayout = findViewById(R.id.answers);
        answerLayout.removeAllViews();
        mAnswer=Constants.NOTHING_CONST;

        mQuizNumber.setText(mQuizNum + Constants.SLASH_CONST + String.valueOf(questionsNameTest.getLength()));
        mQuestionView.setText(questionsNameTest.getQuestions(questionNum));

        if (questionsNameTest.getQuestionType(questionNum) == Constants.RADIO_BUTTON_CONST){
            showRadioButtonAnswers(questionNum);
        }

        showImage();
        ScrollView scrollView = findViewById(R.id.scrollView);
        scrollView.smoothScrollTo(0, 0);

    }

    private void showImage(){
        mQuizImage = findViewById(R.id.quiz_image);
        String img = questionsNameTest.getImages(questionNum);
        mQuizImage.setImageResource(getResources().getIdentifier(img, Constants.DRAWABLE_CONST, getPackageName()));
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
            bArray[i].setText(questionsNameTest.getChoice(qnum)[i]);
            bArray[i].setTextColor(Color.rgb(97,57,95));
            bArray[i].setPadding(100, 16, 8, 16);
            bArray[i].setTextSize(20);
            bArray[i].setId(i);
            bArray[i].setWidth(1500);
            bArray[i].setHighlightColor(Color.rgb(97,57,95));
            bArray[i].setHighlightColor(Color.rgb(97,57,95));

            rg.addView(bArray[i]);

        }

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                mAnswer = questionsNameTest.getChoice(questionNum)[checkedId];
                check = true;
            }
        });

        answerLayout.addView(rg);

    }

}
