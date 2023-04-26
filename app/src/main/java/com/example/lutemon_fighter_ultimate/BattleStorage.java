package com.example.lutemon_fighter_ultimate;

public class BattleStorage extends Storage{

    protected static BattleStorage battleStorage = null;

    public static BattleStorage getInstance(){
        if(battleStorage == null){
            battleStorage = new BattleStorage();
        }
        return battleStorage;
    }

    public void returnHome(double id){
        Lutemon lutemon = null;
        lutemon = lutemon.getLutemonById(id);
        HomeStorage.getInstance().addLutemon(lutemon);
        BattleStorage.getInstance().deleteLutemon(id);
    }





}
