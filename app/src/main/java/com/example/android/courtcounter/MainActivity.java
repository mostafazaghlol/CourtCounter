package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(score));
    }
    //add 3 points for team A
    public void add3TeamA(View view) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    //add 2 points for team A
    public void add2TeamA(View view) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    //add 1 points for team !
    public void add1TeamA(View view) {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);

    }
    //rest Button
    public void restScoreTeamA(View v){
        scoreTeamA=0;
        displayForTeamA(scoreTeamA);

    }
    //add 3 points for team A
    public void add3TeamB(View view) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    //add 2 points for team A
    public void add2TeamB(View view) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    //add 1 points for team !
    public void add1TeamB(View view) {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);

    }
    //rest Button
    public void restScoreTeamB(View v){
        scoreTeamB=0;
        displayForTeamB(scoreTeamB);
    }
}
