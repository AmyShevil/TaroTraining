package com.example.tarotraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultLoveAlignment extends AppCompatActivity {

    public static final String NETWORK_FILE= "model1.pt";
    int cameraRequestCode = 001;
    Classifier classifier;

    Button materialButton, materialButton2;
    TextView scanResult,title,scanResultTitle, scanResultValue ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_love_alignment);

        materialButton = findViewById(R.id.materialButton);
        materialButton.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
        materialButton2 = findViewById(R.id.materialButton2);
        materialButton2.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

        scanResult = findViewById(R.id.scanResult);
        scanResult.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoRegular)));
        scanResultTitle = findViewById(R.id.scanResultTitle);
        scanResultTitle.setTypeface(Typeface.createFromAsset(getAssets(), getString(R.string.robotoMedium)));
        scanResultValue = findViewById(R.id.scanResultValue);
        scanResultValue.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoRegular)));
        title = findViewById(R.id.title);
        title.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

        classifier = new Classifier(Utils.assetFilePath(this,NETWORK_FILE));

        Button capture = materialButton2;
        capture.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent,cameraRequestCode);
            }
        });

        String prediction  = getIntent().getStringExtra("pred");

        switch (prediction) {
            case "0_the_fool":
                scanResultTitle.setText(R.string.the_fool);
                scanResultValue.setText(R.string.the_fool_value);
                break;
            case "1_the_magician":
                scanResultTitle.setText(R.string.the_magician);
                scanResultValue.setText(R.string.the_magician_value);
                break;
            case "2_the_high_priestess":
                scanResultTitle.setText(R.string.the_high_priestess);
                scanResultValue.setText(R.string.the_high_priestess_value);
                break;
            case "3_the_empress":
                scanResultTitle.setText(R.string.the_empress);
                scanResultValue.setText(R.string.the_empress_value);
                break;
            case "4_the_emperor":
                scanResultTitle.setText(R.string.the_emperor);
                scanResultValue.setText(R.string.the_emperor_value);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == cameraRequestCode && resultCode == RESULT_OK) {
            Bitmap imageBitmap = (Bitmap) data.getExtras().get("data");
            String prediction = classifier.predict(imageBitmap);

            switch (prediction) {
                case "0_the_fool":
                    scanResultTitle.setText(R.string.the_fool);
                    scanResultValue.setText(R.string.the_fool_value);
                    break;
                case "1_the_magician":
                    scanResultTitle.setText(R.string.the_magician);
                    scanResultValue.setText(R.string.the_magician_value);
                    break;
                case "2_the_high_priestess":
                    scanResultTitle.setText(R.string.the_high_priestess);
                    scanResultValue.setText(R.string.the_high_priestess_value);
                    break;
                case "3_the_empress":
                    scanResultTitle.setText(R.string.the_empress);
                    scanResultValue.setText(R.string.the_empress_value);
                    break;
                case "4_the_emperor":
                    scanResultTitle.setText(R.string.the_emperor);
                    scanResultValue.setText(R.string.the_emperor_value);
                    break;
            }

        }

    }
    public void onMain(View view) {
        Intent intent = new Intent(ResultLoveAlignment.this, MainActivity.class);
        startActivity(intent);
    }
}