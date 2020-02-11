package com.example.birdcounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int birdOneCount = 0;
    int birdTwoCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBirdOne(View view) {
        birdOneCount++;//increment the birdOneCount
        TextView text=(TextView)findViewById(R.id.textView);// resource location
        text.setText("Votes for Bird #1: "+ birdOneCount);// view in the text
    }

    public void onClickBirdTwo(View view) {
        birdTwoCount++;//increment the birdOneCount
        TextView text=(TextView)findViewById(R.id.textView3);// resource location
        text.setText("Votes for Bird #2: "+ birdTwoCount);// view in the text
    }
}
