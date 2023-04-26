package com.example.lutemon_fighter_ultimate;

public class TrainingStorage extends Storage{

    protected static TrainingStorage trainingStorage = null;

    public static TrainingStorage getInstance(){
        if(trainingStorage == null){
            trainingStorage = new TrainingStorage();
        }
        return trainingStorage;
    }
    public void returnHome(int i){
        HomeStorage.getInstance().addLutemon(lutemons.get(i));
        TrainingStorage.getInstance().deleteLutemon(i);
    }



}
