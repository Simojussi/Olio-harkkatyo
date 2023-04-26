package com.example.lutemon_fighter_ultimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.RadioButton;
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
        tv.setMovementMethod(new ScrollingMovementMethod());

        lutemonsBattleList = BattleStorage.getInstance().getLutemons();

        for(int i = 0;i < lutemonsBattleList.size(); i++){
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(lutemonsBattleList.get(i).getName() + " (" + lutemonsBattleList.get(i).getColor() + ")");
            radioButton.setId(i);
            rg.addView(radioButton);
        }

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int checkedRBId = rg.getCheckedRadioButtonId();
                RadioButton radioBtn = (RadioButton) findViewById(checkedRBId);

            }
        });

    }

    public Lutemon chooseLutemon(){

        battlingLutemon = lutemonsBattleList.get(rg.getCheckedRadioButtonId());

        return battlingLutemon;
    }

    public Lutemon generateEnemy(){
        int randomNumber = (int)(Math.random()*5)+1;
        switch (randomNumber){
            case 1:
                enemy = new White("Muumi");
                enemy.trainLutemon((int)(Math.random()*10)+1);
                break;
            case 2:
                enemy = new Green("Pepe");
                enemy.trainLutemon((int)(Math.random()*10)+1);
                break;
            case 3:
                enemy = new Pink("Pipsa");
                enemy.trainLutemon((int)(Math.random()*10)+1);
                break;
            case 4:
                enemy = new Orange("Karvinen");
                enemy.trainLutemon((int)(Math.random()*10)+1);
                break;
            case 5:
                enemy = new Black("Vader");
                enemy.trainLutemon((int)(Math.random()*10)+1);
                break;

        }

        return enemy;
    }

    public void battle(View view){
        tv.setText("");
        boolean x = true;
        int i = 0;
        Lutemon own = chooseLutemon();
        Lutemon enemy = generateEnemy();
        int ownHealth = own.getHealth();
        int enemyHealth = enemy.getHealth();
        int ownAttack = own.Attack(own.getId());
        int enemyAttack = enemy.getAttack() + enemy.getExperience();
        int ownDefense = own.Defense(own.getId());
        int enemyDefense = enemy.getDefense() + enemy.getExperience();


        while (x == true){
            tv.append(String.valueOf(i++ + ": " + own.getColor() + " " + own.getName() + ", Hyök: " + own.getAttack() +
                    ", Puol: " + own.getDefense() + ", Elämä: " + ownHealth + "/" + own.getMaxHealth() + ", XP: " + own.getExperience())+"\n");
            tv.append(String.valueOf(i + ": " + enemy.getColor() + " " + enemy.getName() + ", Hyök: " + enemy.getAttack() +
                    ", Puol: " + enemy.getDefense() + ", Elämä: " + enemyHealth + "/" + enemy.getMaxHealth() + ", XP: " + enemy.getExperience())+"\n");

            tv.append(String.valueOf(own.getName() + " iskee vihollista")+"\n");
            enemyHealth = enemyHealth - ((ownAttack + (int)(Math.random()*5)) - (enemyDefense) + (int)(Math.random()*2));

            if(enemyHealth <= 0){
                x = false;
                tv.append(String.valueOf(enemy.getName() + " kuoli")+"\n");
                int wins = own.getWins();
                own.setWins();
            }

            if (x == true) {
                tv.append(String.valueOf(enemy.getName() + " iskee takaisin") + "\n");
                ownHealth = ownHealth - ((enemyAttack + (int)(Math.random()*5)) - (ownDefense) + (int)(Math.random()*2));
                if (ownHealth <= 0) {
                    x = false;
                    tv.append(String.valueOf(own.getName() + " kuoli") + "\n");
                    int loses = own.getLoses();
                    own.setLoses();
                }

            }




        }


    }

    public void returnHome(View view){
        BattleStorage.getInstance().returnHome(chooseLutemon().getId());
    }


}