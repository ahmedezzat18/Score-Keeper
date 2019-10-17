package com.example.scorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity  {

    @BindView(R.id.teamname)
    TextView Ateamname;
    @BindView(R.id.score)
    TextView Ascore;
    @BindView(R.id.btn1)
    Button Abtn1;
    @BindView(R.id.btn2)
    Button Abtn2;
    @BindView(R.id.btn3)
    Button Abtn3;
    @BindView(R.id.Aresult)
    TextView Aresult;
    @BindView(R.id.Bteamname)
    TextView Bteamname;
    @BindView(R.id.Bscore)
    TextView Bscore;
    @BindView(R.id.Bbtn1)
    Button Bbtn1;
    @BindView(R.id.Bbtn2)
    Button Bbtn2;
    @BindView(R.id.Bbtn3)
    Button Bbtn3;
    @BindView(R.id.Bresult)
    TextView Bresult;

    static int ScoreOfA = 0;
    static int ScoreOfB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.Bbtn1, R.id.Bbtn2, R.id.Bbtn3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                ScoreOfA += 6;
                Ascore.setText(String.valueOf(ScoreOfA));
                CheckA();
                break;
            case R.id.btn2:
                ScoreOfA += 4;
                Ascore.setText(String.valueOf(ScoreOfA));
                CheckA();
                break;
            case R.id.btn3:
                ScoreOfA += 2;
                Ascore.setText(String.valueOf(ScoreOfA));
                CheckA();
                break;
            case R.id.Bbtn1:
                ScoreOfB += 6;
                Bscore.setText(String.valueOf(ScoreOfB));
                CheckB();
                break;
            case R.id.Bbtn2:
                ScoreOfB += 4;
                Bscore.setText(String.valueOf(ScoreOfB));
                CheckB();
                break;
            case R.id.Bbtn3:
                ScoreOfB += 2;
                Bscore.setText(String.valueOf(ScoreOfB));
                CheckB();
                break;
        }
    }


    void CheckA() {
        if (ScoreOfA >= 30) {
            Aresult.setText("A Winner");
            Bresult.setText("");
            ScoreOfA = 0;
            ScoreOfB = 0;
        }
    }

    void CheckB() {
        if (ScoreOfB >= 30) {
            Bresult.setText("B Winner");
            Aresult.setText("");
            ScoreOfA = 0;
            ScoreOfB = 0;
        }
    }


}
