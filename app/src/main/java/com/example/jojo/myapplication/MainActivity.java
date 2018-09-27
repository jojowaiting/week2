package com.example.jojo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView scoreA;
    TextView scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreA = (TextView)findViewById(R.id.scoreA);
        scoreB = (TextView)findViewById(R.id.scoreB);

    }
    public  void onClick_add3_a(View view){
     showScoreA(3);

    }
    public  void onClick_add2_a(View view){
        showScoreA(2);
    }
    public  void onClick_add1_a(View view) {
        showScoreA(1);
    }

    public  void onClick_add3_b(View view){
        showScoreB(3);

    }
    public  void onClick_add2_b(View view){
        showScoreB(2);
    }
    public  void onClick_add1_b(View view) {
        showScoreB(1);
    }

    public  void onClick_reset(View view) {
        scoreA.setText("0");
        scoreB.setText("0");
    }


    private void showScoreA(int inc){
        String oldScoreA = (String)scoreA.getText();
        int newScoreA=Integer.parseInt(oldScoreA)+inc;
        scoreA.setText(""+newScoreA);

    }
    private void showScoreB(int inc){
        String oldScoreB = (String)scoreB.getText();
        int newScoreB=Integer.parseInt(oldScoreB)+inc;
        scoreB.setText(""+newScoreB);

    }

}
