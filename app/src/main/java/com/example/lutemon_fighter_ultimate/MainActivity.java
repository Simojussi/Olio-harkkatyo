package com.example.lutemon_fighter_ultimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void loadLutemons(View view) {
        Storage.getInstance().loadLutemons(this);
    }
    public void toHome(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void toLutemonList(View view){
        Intent intent = new Intent(this, LutemonListActivity.class);
        startActivity(intent);
    }

    public void toTraining(View view){
        Intent intent = new Intent(this, TrainingActivity.class);
        startActivity(intent);
    }

    public void toBattle(View view){
        Intent intent = new Intent(this, BattleActivity.class);
        startActivity(intent);
    }

    public void toStats(View view){
        Intent intent = new Intent(this, StatsActivity.class);
        startActivity(intent);
    }

}