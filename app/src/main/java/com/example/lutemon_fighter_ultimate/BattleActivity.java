package com.example.lutemon_fighter_ultimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class BattleActivity extends AppCompatActivity {

    private Lutemon enemy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
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