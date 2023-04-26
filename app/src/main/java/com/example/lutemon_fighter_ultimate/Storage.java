package com.example.lutemon_fighter_ultimate;

import android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Storage {

    protected static Storage storage = null;
    protected ArrayList<Lutemon> lutemons = new ArrayList<>();

    protected Storage(){

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

    public void addLutemon(Lutemon lutemon) {
        lutemons.add(lutemon);
    }

    public void deleteLutemon(int id){
        lutemons.remove(id);
    }



    public void saveLutemons(Context context) {
        try {
            ObjectOutputStream userWriter = new ObjectOutputStream(context.openFileOutput("users.data", context.MODE_PRIVATE));
            userWriter.writeObject(lutemons);
            userWriter.close();
        } catch (IOException ioe) {
            System.out.println("tallentaminen epäonnistui");
            ioe.printStackTrace();
        }
    }

        public void loadLutemons(Context context){
            try {
                ObjectInputStream userLoader = new ObjectInputStream(context.openFileInput("users.data"));
                lutemons = (ArrayList<Lutemon>) userLoader.readObject();
                userLoader.close();
            } catch (Exception e) {
                System.out.println("Lataaminen epäonnistui");
                e.printStackTrace();
            }
        }
    }