package com.example.gegoff.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int score1 = 0;
    int score2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(int a,boolean b ){
        if(b) {
            TextView teamOne = findViewById(R.id.teamOneScore);
            teamOne.setText(score1+a+"");
            score1=score1+a;
        }
        else{
            TextView teamTwo=findViewById(R.id.teamTwoScore);
            teamTwo.setText(score2+a+"");
            score2=score2+a;
        }
    }

    public void touchdownO(View view){
        increment(6,true);
    }
    public void touchdownT(View view){
        increment(6,false);
    }
    public void EPO(View view){
        increment(1,true);
    }
    public void EPT(View view){
        increment(1,false);
    }
    public void CO(View view){
        increment(2,true);
    }
    public void CT(View view){
        increment(2,false);
    }
    public void FGO(View view){
        increment(3,true);
    }
    public void FGT(View view){
        increment(3,false);
    }
    public void SO(View view){
        increment(2,true);
    }
    public void ST(View view){
        increment(2,false);
    }
    public void reset(View view){
        TextView teamOne = findViewById(R.id.teamOneScore);
        TextView teamTwo=findViewById(R.id.teamTwoScore);
        teamOne.setText("0");
        teamTwo.setText("0");
        score1=0;
        score2=0;
    }
}
