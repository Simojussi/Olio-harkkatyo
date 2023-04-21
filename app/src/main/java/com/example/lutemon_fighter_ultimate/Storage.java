package com.example.lutemon_fighter_ultimate;

import java.util.ArrayList;

public class Storage {

    private static Storage storage = null;
    ArrayList<Lutemon> lutemons = new ArrayList<>();

    private Storage(){

    }

    public static Storage getInstance(){
        if(storage == null){
            storage = new Storage();
        }
        return storage;
    }

    public ArrayList<Lutemon> getLutemons() {
        return lutemons;
    }
}
