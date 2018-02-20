package com.example.android.paperfootballscoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
     * Adjust values for Touchdown, Field Goal, and Extra Point here
     */
    final int SCORE_TD = 3; /* Touchdown */
    final int SCORE_FG = 2; /* Field Goal */
    final int SCORE_EP = 1; /* Extra Point */
    /**
     * variables to hold each player's score
     */
    public int p1Score = 0;
    public int p2Score = 0;

    /**
     * TODO: Figure out how to keep board from resetting when landscape/portrait
     * TODO: Have a different layout for landscape mode
     * TODO: Add settings panel or whatever
     * TODO: Spanish / localization
     * TODO: Make team/player name/color customizable
     * TODO: Make scoring customizable
     * TODO: have default pre-set options (eg ping pong, paper football, pizza party)
     * TODO: put default pre-set options behind pay-wall
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * methods to handle button press for Player 1|2 getting a TD|FG|EP:
     * player one touchdown
     */
    public void p1TD(View v) {
        p1Score = p1Score + SCORE_TD;
        display();
    }

    /**
     * player one field goal
     */
    public void p1FG(View v) {
        p1Score = p1Score + SCORE_FG;
        display();
    }

    /**
     * player one extra point
     */
    public void p1EP(View v) {
        p1Score = p1Score + SCORE_EP;
        display();
    }

    /**
     * player two touchdown
     */
    public void p2TD(View v) {
        p2Score = p2Score + SCORE_TD;
        display();
    }

    /**
     * player two field goal
     */
    public void p2FG(View v) {
        p2Score = p2Score + SCORE_FG;
        display();
    }

    /**
     * player two extra point
     */
    public void p2EP(View v) {
        p2Score = p2Score + SCORE_EP;
        display();
    }

    /**
     * Display the scoreboard. No scores need to be passed to this method because
     * it operates using the global variables declared and initialized already.
     * It also displays both scores regardless of which was updated.
     */
    private void display() {
        TextView textView1 = (findViewById(R.id.tvP1Score));
        TextView textView2 = (findViewById(R.id.tvP2Score));
        String sP1Score = "" + p1Score;
        String sP2Score = "" + p2Score;
        textView1.setText(sP1Score);
        textView2.setText(sP2Score);
    }

    /**
     * the reset button sets scores to 0 and refreshes the display
     * TODO: Say which player won the game
     */
    public void newGame(View v) {
        p1Score = 0;
        p2Score = 0;
        display();
        Toast.makeText(this, "A clear winner!", Toast.LENGTH_SHORT).show();

    }

}
