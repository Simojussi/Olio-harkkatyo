package com.example.lutemon_fighter_ultimate;

import java.util.ArrayList;

public class TrainingStorage extends Storage{

    protected static TrainingStorage trainingStorage = null;

    public static TrainingStorage getInstance(){
        if(trainingStorage == null){
            trainingStorage = new TrainingStorage();
        }
        return trainingStorage;
    }
    public void returnHome(double id){
        ArrayList<Lutemon> lutemons = TrainingStorage.getInstance().getLutemons();
        Lutemon lutemon = null;
        for (Lutemon l : lutemons) {
            if (l.getId() == id){
                lutemon = l;
                HomeStorage.getInstance().addLutemon(l);
                lutemons.remove(l);
                break;
            }
        }

    }



}
