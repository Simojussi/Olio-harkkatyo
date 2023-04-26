package com.example.lutemon_fighter_ultimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class TrainingActivity extends AppCompatActivity {

    private RadioGroup rgChooseLutemon, rgChooseTrainingMethod;
    private Lutemon chosenLutemon;

    private ArrayList<Lutemon> myLutemons = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        rgChooseLutemon = findViewById(R.id.rgChooseLutemon);

        rgChooseTrainingMethod = findViewById(R.id.rgChooseTrainingMethod);

        myLutemons = Storage.getInstance().getLutemons();

        for(int i = 0;i < myLutemons.size(); i++){
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(myLutemons.get(i).getName() + " (" + myLutemons.get(i).getColor() + ")");
            radioButton.setId(i);
            rgChooseLutemon.addView(radioButton);
        }
    }

    private Lutemon chooseLutemonToTrain(){
        switch(rgChooseLutemon.getCheckedRadioButtonId()){
            case R.id.rbBlack:
                for (Lutemon choice:myLutemons){
                    if(choice instanceof Black){
                        chosenLutemon = choice;
                        break;
                    }
                }
                break;

            case R.id.rbOrange:
                for (Lutemon choice:myLutemons){
                    if(choice instanceof Orange){
                        chosenLutemon = choice;
                        break;
                    }
                }
                break;
            case R.id.rbGreen:
                for (Lutemon choice:myLutemons){
                    if(choice instanceof Green){
                        chosenLutemon = choice;
                        break;
                    }
                }
                break;

            case R.id.rbPink:
                for (Lutemon choice:myLutemons){
                    if(choice instanceof Pink){
                        chosenLutemon = choice;
                        break;
                    }
                }
                break;

            case R.id.rbWhite:
                for (Lutemon choice:myLutemons){
                    if(choice instanceof White){
                        chosenLutemon = choice;
                        break;
                    }
                }
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + rgChooseLutemon.getCheckedRadioButtonId());
        }
        return chosenLutemon;
    }

    public void trainLutemon(View view){

        Lutemon chosen = chooseLutemonToTrain();

        switch(rgChooseTrainingMethod.getCheckedRadioButtonId()){
            case R.id.rbRunning:
                try {
                    Thread.sleep(5000);
                    chosen.trainLutemon(1);
                    chosen.addTrainingDays();
                    Toast.makeText(this, chosen.getName() + " lopettaa juoksemisen", Toast.LENGTH_LONG).show();
                }catch (InterruptedException e){
                    System.out.println("tapahtui virhe");
                }

                break;

            case R.id.rbParkour:
                try {
                Thread.sleep(7000);
                chosen.trainLutemon(2);
                chosen.addTrainingDays();
                Toast.makeText(this, chosen.getName() + " lopettaa parkouraamisen", Toast.LENGTH_LONG).show();
                }catch (InterruptedException e){
                    System.out.println("tapahtui virhe");
                }
                break;

            case R.id.rbBenchPress:
                try {
                Thread.sleep(10000);
                chosen.trainLutemon(3);
                chosen.addTrainingDays();
                Toast.makeText(this, chosen.getName() + " lopettaa punnertamisen", Toast.LENGTH_LONG).show();
                }catch (InterruptedException e){
                    System.out.println("tapahtui virhe");
                }
                break;

            case R.id.rbSquating:
                try {
                Thread.sleep(15000);
                chosen.trainLutemon(5);
                chosen.addTrainingDays();
                Toast.makeText(this, chosen.getName() + " lopettaa kyykkämisen", Toast.LENGTH_LONG).show();
                }catch (InterruptedException e){
                    System.out.println("tapahtui virhe");
                }
                break;

            case R.id.rbBoxing:
                try {
                Thread.sleep(20000);
                chosen.trainLutemon(7);
                chosen.addTrainingDays();
                Toast.makeText(this, chosen.getName() + " lopettaa nyrkkeilemisen", Toast.LENGTH_LONG).show();
                }catch (InterruptedException e){
                    System.out.println("tapahtui virhe");
                }
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + rgChooseTrainingMethod.getCheckedRadioButtonId());
        }
    }
}