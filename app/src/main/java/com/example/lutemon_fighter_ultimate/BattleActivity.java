package com.example.lutemon_fighter_ultimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.Random;

public class BattleActivity extends AppCompatActivity {

    private Lutemon enemy;
    private RadioGroup rg;
    private Lutemon battlingLutemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

        rg = findViewById(R.id.rgChooseLutemon);


    }

    public Lutemon chooseLutemon(){
        ArrayList<Lutemon> lutemonsBattleList = new ArrayList<>();


        switch (rg.getCheckedRadioButtonId()){
            lutemonsBattleList = Storage.getInstance().getLutemons();

            case R.id.rbWhite:

                for (Lutemon l: lutemonsBattleList) {
                    if (l instanceof White){
                        battlingLutemon = l;
                        break;
                    }
                }
                break;
            case R.id.rbWhite:

                for (Lutemon l: lutemonsBattleList) {
                    if (l instanceof White){
                        battlingLutemon = l;
                        break;
                    }
                }
            break;
            case R.id.rbGreen:

                for (Lutemon l: lutemonsBattleList) {
                    if (l instanceof White){
                        battlingLutemon = l;
                        break;
                    }
                }
                break;
        }
        return battlingLutemon;
    }

    public Lutemon generateEnemy(){
        int randomNumber = new Random().nextInt(6-1) + 1;
        switch (randomNumber){
            case 1:
                enemy = new White("Muumi");
            case 2:
                enemy = new Green("Pepe");
            case 3:
                enemy = new Pink("Pipsa");
            case 4:
                enemy = new Orange("Karvinen");
            case 5:
                enemy = new Black("Vader");
        }
        return enemy;
    }

}