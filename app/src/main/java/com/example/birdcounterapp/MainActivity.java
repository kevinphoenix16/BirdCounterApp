package com.example.birdcounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int birdOneCount = 0;
    private int birdTwoCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBirdOneInc(View view) {
        birdOneCount++;//increment the birdOneCount
        TextView text = (TextView) findViewById(R.id.bird1Count);// resource location
        text.setText(Integer.toString(birdOneCount));// view in the text
    }

    public void onClickBirdTwoInc(View view) {
        birdTwoCount++;//increment the birdOneCount
        TextView text=(TextView)findViewById(R.id.bird2Count);// resource location
        text.setText(Integer.toString(birdTwoCount));// view in the text
    }

    public void onClickBirdOneDec(View view) {
        if(birdOneCount > 0) {
            birdOneCount--;//increment the birdOneCount
        }
        TextView text = (TextView) findViewById(R.id.bird1Count);// resource location
        text.setText(Integer.toString(birdOneCount));// view in the text
    }

    public void onClickBirdTwoDec(View view) {
        if(birdTwoCount > 0) {
            birdTwoCount--;//increment the birdOneCount
        }
        TextView text=(TextView)findViewById(R.id.bird2Count);// resource location
        text.setText(Integer.toString(birdTwoCount));// view in the text
    }

}
