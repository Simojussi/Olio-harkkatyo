package com.example.lutemon_fighter_ultimate;

public class BattleStorage extends Storage{

    protected static BattleStorage battleStorage = null;

    public static BattleStorage getInstance(){
        if(battleStorage == null){
            battleStorage = new BattleStorage();
        }
        return battleStorage;
    }

    public void returnHome(int i){
        HomeStorage.getInstance().addLutemon(lutemons.get(i));
        BattleStorage.getInstance().deleteLutemon(i);
    }





}
