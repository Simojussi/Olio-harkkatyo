package com.example.lutemon_fighter_ultimate;

public class HomeStorage extends Storage{

    protected static HomeStorage HomeStorage = null;

    public static HomeStorage getInstance(){
        if(HomeStorage == null){
            HomeStorage = new HomeStorage();
        }
        return HomeStorage;
    }

    public void moveLutemonToBattle(int i) {

        BattleStorage.getInstance().addLutemon(lutemons.get(i));
        HomeStorage.getInstance().deleteLutemon(i);
    }

    public void moveLutemonToTrain(int i) {
        TrainingStorage.getInstance().addLutemon(lutemons.get(i));
        HomeStorage.getInstance().deleteLutemon(i);
    }










}
