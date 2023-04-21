package com.example.lutemon_fighter_ultimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class BattleActivity extends AppCompatActivity {

    private Lutemon enemy;
    private RadioGroup rg;
    private Lutemon battlingLutemon;
    private Storage s;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

        rg = findViewById(R.id.rgChooseLutemon);
        tv = findViewById(R.id.tvBattleText);

    }

    public Lutemon chooseLutemon(){


        switch (rg.getCheckedRadioButtonId()){
            ArrayList<Lutemon> lutemonsBattleList = new ArrayList<>();
            lutemonsBattleList = s.getLutemons();

            case R.id.rbWhite:

                for (Lutemon l: lutemonsBattleList) {
                    if (l instanceof White){
                        battlingLutemon = l;
                        break;
                    }
                }
                break;
            case R.id.rbPink:

                for (Lutemon l: lutemonsBattleList) {
                    if (l instanceof Pink){
                        battlingLutemon = l;
                        break;
                    }
                }
                break;
            case R.id.rbGreen:

                for (Lutemon l: lutemonsBattleList) {
                    if (l instanceof Green){
                        battlingLutemon = l;
                        break;
                    }
                }
                break;
            case R.id.rbOrange:

                for (Lutemon l: lutemonsBattleList) {
                    if (l instanceof Orange){
                        battlingLutemon = l;
                        break;
                    }
                }
                break;
            case R.id.rbBlack:

                for (Lutemon l: lutemonsBattleList) {
                    if (l instanceof Black){
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

    public void battle(){
        int i = 0;
        Lutemon own = chooseLutemon();
        Lutemon enemy = generateEnemy();
        while (true){
            System.out.println(i + ": " + own.getColor() + " " + own.getName() + ", Hyök: " + own.getAttack() +
                    ", Puol: " + own.getDefense() + ", Elämä: " + own.getHealth() + "/" + own.getMaxHealth() + "XP: " + own.getExperience());
            System.out.println(i + ": " + enemy.getColor() + " " + enemy.getName() + ", Hyök: " + enemy.getAttack() +
                    ", Puol: " + enemy.getDefense() + ", Elämä: " + enemy.getHealth() + "/" + enemy.getMaxHealth() + "XP: " + enemy.getExperience());

            System.out.println(own.getName() + "iskee vihollista");


        }


    }

}