package com.example.android.sportsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreBlackStars;
    int scoreSuperEagles;
    int scoreFoul;
    int scoreFoulB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }
    /**
     * Displays the given score for the Black Stars.
     */

    public void displayForBlackStars(int score) {
        TextView scoreView = findViewById ( R.id.black_stars_score );
        scoreView.setText ( String.valueOf ( score ) );

    }
    /**
     * A point is added for Black Stars when the Goal button is clicked
     */

    public void onePoint(View view) {
        scoreBlackStars = scoreBlackStars + 1;
        displayForBlackStars ( scoreBlackStars );

    }
    /**
     * Displays the Foul point for the Black Stars.
     */

    public void displayForFoul(int score) {
        TextView scoreView = findViewById ( R.id.foul_score );
        scoreView.setText ( String.valueOf ( score ) );

    }
    /**
     * A point is added for Black Stars when the Foul button is clicked
     */

    public void foulPoint(View view) {
        scoreFoul = scoreFoul + 1;
        displayForFoul ( scoreFoul );

    }
    /**
     * Resets all scores back to zero
     */

    public void resetScore(View view) {
        scoreBlackStars = 0;
        scoreSuperEagles = 0;
        displayForBlackStars ( scoreBlackStars );
        displayForSuperEagles ( scoreSuperEagles );
        scoreFoul = 0;
        scoreFoulB = 0;
        displayForFoul ( scoreFoul );
        displayForFoulB ( scoreFoulB );

    }
    /**
     * Displays the given score for the Super Eagles.
     */

    public void displayForSuperEagles(int score) {
        TextView scoreView = findViewById ( R.id.super_eagles_score );
        scoreView.setText ( String.valueOf ( score ) );
    }
    /**
     * A point is added for Super Eagles when the Goal button is clicked
     */

    public void onePointB(View view) {
        scoreSuperEagles++;
        displayForSuperEagles ( scoreSuperEagles );

    }
    /**
     * Displays the Foul point for the Super Eagles.
     */

    public void displayForFoulB(int score) {
        TextView scoreView = findViewById ( R.id.foulB_score );
        scoreView.setText ( String.valueOf ( score ) );
    }
    /**
     * A point is added for Super Eagles when the foul button is clicked
     */

    public void foulPointB(View view) {
        scoreFoulB++;
        displayForFoulB ( scoreFoulB );
    }
}



