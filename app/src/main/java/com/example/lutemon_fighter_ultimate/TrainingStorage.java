package com.example.lutemon_fighter_ultimate;

public class TrainingStorage extends Storage{

    public void returnHome(double id){
        Lutemon lutemon = null;
        lutemon = lutemon.getLutemonById(id);
        HomeStorage.getInstance().addLutemon(lutemon);
        TrainingStorage.getInstance().deleteLutemon(id);
    }

}
