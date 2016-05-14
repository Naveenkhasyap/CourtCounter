package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */
    int Score =0;
    int scoreTeamB=0;
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetButton(View view ){
        Score=0;
        scoreTeamB= 0;
        displayForTeamA(Score);
        displayForTeamB(scoreTeamB);

    }
    public void plus2clicked(View view) {
        //TextView t = (TextView) findViewById(R.id.plus2);
        //t.setText(String.valueOf(score));
        Score=Score+2;
        displayForTeamA(Score);
    }

    public void plus3clicked(View view) {
        //TextView t = (TextView) findViewById(R.id.plus3);
        //t.setText(String.valueOf(3));
        Score=Score+3;
        displayForTeamA(Score);
    }

    public void plus1clicked(View view) {
        //TextView t = (TextView) findViewById(R.id.plus1);
        //t.setText(String.valueOf(score));
        Score=Score+1;
        displayForTeamA(Score);
    }
    //B
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void bplus2clicked(View view) {
        //TextView t = (TextView) findViewById(R.id.plus2);
        //t.setText(String.valueOf(score));
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    public void bplus3clicked(View view) {
        //TextView t = (TextView) findViewById(R.id.plus3);
        //t.setText(String.valueOf(3));
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    public void bplus1clicked(View view) {
        //TextView t = (TextView) findViewById(R.id.plus1);
        //t.setText(String.valueOf(score));
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }



}
