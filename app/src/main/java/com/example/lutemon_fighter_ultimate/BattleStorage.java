package com.example.lutemon_fighter_ultimate;

import java.util.ArrayList;

public class BattleStorage extends Storage{

    protected static BattleStorage battleStorage = null;

    public static BattleStorage getInstance(){
        if(battleStorage == null){
            battleStorage = new BattleStorage();
        }
        return battleStorage;
    }

    public void returnHome(double id){
        ArrayList<Lutemon> lutemons = HomeStorage.getInstance().getLutemons();
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
