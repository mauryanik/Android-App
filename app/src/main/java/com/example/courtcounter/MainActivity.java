package com.example.courtcounter;

import static java.lang.Math.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        ans = (TextView)findViewById(R.id.result);
        ans.setVisibility(View.GONE);

    }
    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void result(View v)
    {

        if(scoreTeamA > scoreTeamB) {
            String results = "Team A won by "+String.valueOf(abs(scoreTeamA-scoreTeamB))+" points";
            ans.setText(results);
        }
        else if(scoreTeamB > scoreTeamA){
            String results = "Team B won by "+String.valueOf(abs(scoreTeamB-scoreTeamA))+" points";
            ans.setText(results);
        }
        else{
            String results = "It's a draw with "+String.valueOf(scoreTeamB)+" points each";
            ans.setText(results);
        }
        ans.setVisibility(View.VISIBLE);
        scoreTeamA = 0;
        scoreTeamB = 0;
    }
    public void addThree(View v)
    {
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwo(View v)
    {
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void addOne(View v)
    {
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    public void addThreetoB(View v)
    {
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwotoB(View v)
    {
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void addOnetoB(View v)
    {
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void resetScore(View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}