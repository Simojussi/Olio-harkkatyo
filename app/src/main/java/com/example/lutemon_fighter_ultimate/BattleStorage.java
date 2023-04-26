package com.example.lutemon_fighter_ultimate;

public class BattleStorage extends Storage{

    public void returnHome(double id){
        Lutemon lutemon = null;
        lutemon = lutemon.getLutemonById(id);
        HomeStorage.getInstance().addLutemon(lutemon);
        BattleStorage.getInstance().deleteLutemon(id);
    }





}
