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

public class LearningLoveAlignment extends AppCompatActivity {

    public static final String NETWORK_FILE= "model1.pt";
    int cameraRequestCode = 001;
    Classifier classifier;

    Button buttonScan, buttonEnd;
    TextView description,title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_love_alognment);


        description = findViewById(R.id.describe);
        description.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoRegular)));


        title = findViewById(R.id.title);
        title.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

        buttonScan= findViewById(R.id.buttonScan);
        buttonScan.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));
        buttonEnd= findViewById(R.id.buttonScan);
        buttonEnd.setTypeface(Typeface.createFromAsset(getAssets(),  getString(R.string.robotoMedium)));

        classifier = new Classifier(Utils.assetFilePath(this,NETWORK_FILE));

        Button capture = buttonScan;
        capture.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent,cameraRequestCode);
            }
        });
    }

    public void onMain(View view) {
        Intent intent = new Intent(LearningLoveAlignment.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == cameraRequestCode && resultCode == RESULT_OK) {
            Bitmap imageBitmap = (Bitmap) data.getExtras().get("data");
            String pred = classifier.predict(imageBitmap);
            Intent intent1 = new Intent(LearningLoveAlignment.this, ResultLoveAlignment.class);
            intent1.putExtra("pred",pred);
            startActivity(intent1);

        }

    }
}