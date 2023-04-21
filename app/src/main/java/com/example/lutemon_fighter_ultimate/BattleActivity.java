package com.example.lutemon_fighter_ultimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

    private ArrayList<Lutemon> lutemonsBattleList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

        rg = findViewById(R.id.rgChooseLutemon);
        tv = findViewById(R.id.tvBattleText);

        lutemonsBattleList = Storage.getInstance().getLutemons();

    }

    public Lutemon chooseLutemon(){



        switch (rg.getCheckedRadioButtonId()){


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
            default:
                throw new IllegalStateException("Unexpected value: " + rg.getCheckedRadioButtonId());

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
            default:
                enemy = new Pink("Pipsa");
        }
        return enemy;
    }

    public void battle(View view){
        boolean x = true;
        int i = 0;
        Lutemon own = chooseLutemon();
        Lutemon enemy = generateEnemy();
        int ownHealth = own.getHealth();
        int enemyHealth = enemy.getHealth();
        int ownAttack = own.Attack(own.getId());



        while (x == true){
            tv.append(String.valueOf(i++ + ": " + own.getColor() + " " + own.getName() + ", Hyök: " + own.getAttack() +
                    ", Puol: " + own.getDefense() + ", Elämä: " + ownHealth + "/" + own.getMaxHealth() + ", XP: " + own.getExperience())+"\n");
            tv.append(String.valueOf(i++ + ": " + enemy.getColor() + " " + enemy.getName() + ", Hyök: " + enemy.getAttack() +
                    ", Puol: " + enemy.getDefense() + ", Elämä: " + enemyHealth + "/" + enemy.getMaxHealth() + ", XP: " + enemy.getExperience())+"\n");

            tv.append(String.valueOf(own.getName() + " iskee vihollista")+"\n");
            enemyHealth = enemyHealth - (own.attack - enemy.defense);
            if(enemyHealth <= 0){
                x = false;
                tv.append(String.valueOf(enemy.getName() + " kuoli")+"\n");
            }
            tv.append(String.valueOf(enemy.getName() + " iskee takaisin")+"\n");
            ownHealth = ownHealth - (enemy.attack - own.defense);
            if(enemyHealth <= 0){
                x = false;
                tv.append(String.valueOf(own.getName() + " kuoli")+"\n");
            }






        }


    }

}