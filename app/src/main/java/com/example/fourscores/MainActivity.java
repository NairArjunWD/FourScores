package com.example.fourscores;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    /**
     * Restarts the App
     */
    Button restart;
    /**
     * Home Team's Score
     */
    int homeTeam = 0;
    /**
     * Visiting Team's Score
     */
    int visitingTeam = 0;

    int homeExtraPoint = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Restart App
         */
        restart=(Button)findViewById(R.id.resetButton);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restartIntent = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage(getBaseContext().getPackageName());
                restartIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(restartIntent);
            }
        });
    }

    /**
     * Give Home Team 1 Points
     */
    public void homeOnePoint(View view) {
        homeTeam = homeTeam + 1;
        displayHomeScore(homeTeam);
        homeExtraPoint = homeExtraPoint + 1;
        displayExtraHomeCount(homeExtraPoint);
    }

    /**
     * Give Home Team 2 Points
     */
    public void homeTwoPoints(View view) {
        homeTeam = homeTeam +2;
        displayHomeScore(homeTeam);
    }

    /**
     * Give Home Team 3 Points
     */
    public void homeThreePoints(View view) {
        homeTeam = homeTeam + 3;
        displayHomeScore(homeTeam);
    }

    /**
     * Give Home Team 6 Points
     */
    public void homeSixPoints(View view) {
        homeTeam = homeTeam + 6;
        displayHomeScore(homeTeam);
    }

    /**
     * Give Visiting Team 1 Points
     */
    public void visitorOnePoint(View view) {
        visitingTeam = visitingTeam + 1;
        displayVisitorScore(visitingTeam);
    }

    /**
     * Give Visiting Team 2 Points
     */
    public void visitorTwoPoints(View view) {
        visitingTeam = visitingTeam +2;
        displayVisitorScore(visitingTeam);
    }

    /**
     * Give Visiting Team 3 Points
     */
    public void visitorThreePoints(View view) {
        visitingTeam = visitingTeam + 3;
        displayVisitorScore(visitingTeam);
    }

    /**
     * Give Visiting Team 6 Points
     */
    public void visitorSixPoints(View view) {
        visitingTeam = visitingTeam + 6;
        displayVisitorScore(visitingTeam);
    }

    /**
     * Display Home Team's Score
     */
    public void displayHomeScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display Visiting Team's Score
     */
    public void displayVisitorScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitor_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *
     * Display How Many Extra Points Home Team Received
     */

    public void displayExtraHomeCount(int score) {
        TextView scoreView = (TextView) findViewById(R.id.extraPointCountHome);
        scoreView.setText(String.valueOf(score));
    }



}