package com.example.lutemon_fighter_ultimate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class HomeActivity extends AppCompatActivity {

    private Context context;
    private ArrayList<Lutemon> lutemons = new ArrayList<>();
    EditText txtLutemonName;
    TextView txtWhiteStats, txtGreenStats, txtPinkStats, txtOrangeStats, txtBlackStats;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RadioGroup rgLutemonColors = findViewById(R.id.rgLutemonColors);
        Button btnAddNew = findViewById(R.id.btnAddNew);

        Storage storage = Storage.getInstance();
        context = this;

        txtLutemonName = findViewById(R.id.txtLutemonName);
        txtWhiteStats = findViewById(R.id.txtWhiteStats);
        txtGreenStats = findViewById(R.id.txtGreenStats);
        txtPinkStats = findViewById(R.id.txtPinkStats);
        txtOrangeStats = findViewById(R.id.txtOrangeStats);
        txtBlackStats  = findViewById(R.id.txtBlackStats);

        txtWhiteStats.setText("Hyökkäys: 5 \n" + "Puolustus: 4 \n" + "Elämä: 20");
        txtGreenStats.setText("Hyökkäys: 9 \n" + "Puolustus: 6 \n" + "Elämä: 19");
        txtPinkStats.setText("Hyökkäys: 7 \n" + "Puolustus: 2 \n" + "Elämä: 17");
        txtOrangeStats.setText("Hyökkäys: 8 \n" + "Puolustus: 1 \n" + "Elämä: 17");
        txtBlackStats.setText("Hyökkäys: 9 \n" + "Puolustus: 0 \n" + "Elämä: 16");


    }

    public void addLutemon(View view) {
        RadioGroup rgLutemonColors = findViewById(R.id.rgLutemonColors);

        switch (rgLutemonColors.getCheckedRadioButtonId()) {
            case R.id.rbAddWhite:
                Lutemon white = new White(txtLutemonName.getText().toString());
                Storage.getInstance().addLutemon(white);
                break;

            case R.id.rbAddGreen:
                Lutemon green = new Green(txtLutemonName.getText().toString());
                Storage.getInstance().addLutemon(green);
                break;

            case R.id.rbAddPink:
                Lutemon pink = new Pink(txtLutemonName.getText().toString());
                Storage.getInstance().addLutemon(pink);
                break;

            case R.id.rbAddOrange:
                Lutemon orange = new Orange(txtLutemonName.getText().toString());
                Storage.getInstance().addLutemon(orange);
                break;

            case R.id.rbAddBlack:
                Lutemon black = new Black(txtLutemonName.getText().toString());
                Storage.getInstance().addLutemon(black);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + rgLutemonColors.getCheckedRadioButtonId());

        }
    Storage.getInstance().saveLutemons(this);

    }



}