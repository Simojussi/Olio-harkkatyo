package com.example.lutemon_fighter_ultimate;

public class TrainingStorage extends Storage{

    protected static TrainingStorage trainingStorage = null;

    public static TrainingStorage getInstance(){
        if(trainingStorage == null){
            trainingStorage = new TrainingStorage();
        }
        return trainingStorage;
    }
    public void returnHome(double id){
        Lutemon lutemon = null;
        lutemon = lutemon.getLutemonById(id);
        HomeStorage.getInstance().addLutemon(lutemon);
        TrainingStorage.getInstance().deleteLutemon(id);
    }



}
