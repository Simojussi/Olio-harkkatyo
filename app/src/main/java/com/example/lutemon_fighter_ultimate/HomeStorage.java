package com.example.lutemon_fighter_ultimate;

public class HomeStorage extends Storage{

    public void moveLutemonToBattle(int i) {

        BattleStorage.getInstance().addLutemon(lutemons.get(i));
        HomeStorage.getInstance().deleteLutemon(lutemons.get(i).getId());
    }

    public void moveLutemonToTrain(double id) {
        Lutemon lutemon = null;
        lutemon = lutemon.getLutemonById(id);
        TrainingStorage.getInstance().addLutemon(lutemon);
        HomeStorage.getInstance().deleteLutemon(id);
    }










}
