package com.segura.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threepointTeamA(View view) {
        scoreTeamA=scoreTeamA+3;
        display(scoreTeamA);
    }

    private void display(int scoreTeamA) {

        TextView TeamAValue = (TextView) findViewById(R.id.contador1);
        TeamAValue.setText(""+scoreTeamA);
    }

    public void twopointTeamA(View view) {
        scoreTeamA=scoreTeamA+2;
        display(scoreTeamA);
    }

    public void onepointTeamA(View view) {
        scoreTeamA=scoreTeamA+1;
        display(scoreTeamA);
    }

    public void threepointTeamB(View view) {
        scoreTeamB=scoreTeamB+3;
        displayB(scoreTeamB);
    }

    private void displayB(int scoreTeamB) {

        TextView TeamAValue = (TextView) findViewById(R.id.contador2);
        TeamAValue.setText(""+scoreTeamB);
    }

    public void twopointTeamB(View view) {
        scoreTeamB=scoreTeamB+2;
        displayB(scoreTeamB);
    }

    public void onepointTeamB(View view) {
        scoreTeamB=scoreTeamB+1;
        displayB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        display(scoreTeamA);
        displayB(scoreTeamB);
    }
}
