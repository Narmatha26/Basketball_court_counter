package android.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    /**
     * GLOBAL VARIABLE SCORE FOR TEAM A
     */
    int scoreTeamA = 0;
    /**
     * GLOBAL VARIABLE SCORE FOR TEAM B
     */
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * displays the given score for team A
     */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(scoreTeamA));

    }
    /**
     * displays the given score for team B
     */
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreTeamB));
    }

    /**
     * resets the score of both the teams to 0
     */
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

    /**
     * ADD 3 FOR TEAM A
     */
    public void increment3A(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * ADD 2 FOR TEAM A
     */

    public void increment2A(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * ADD 1 FOR TEAM A
     */
    public void increment1A(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * ADD 3 FOR TEAM B
     */
    public void increment3B(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * ADD 2 FOR TEAM B
     */
    public void increment2B(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * ADD 1 FOR TEAM B
     */
    public void increment1B(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

}

