package com.example.lutemon_fighter_ultimate;

import java.util.ArrayList;

public class Lutemon {
    protected String name;
    protected String color;
    protected int attack;
    protected int defense;
    protected int experience;
    protected int health;
    protected int maxHealth;
    protected double id;
    private int idCounter;
    protected int image;

    public Lutemon(String name, String color, int attack, int defense, int experience, int health, int maxHealth, int image ) {
        this.name = name;
        this.color = color;
        this.attack = attack;
        this.defense = defense;
        this.experience = experience;
        this.health = health;
        this.maxHealth = maxHealth;
        id = Math.random()*1000+100;
        int i = 0;
        idCounter = i++;
        this.image = image;
    }

    public int Attack(double id) {
        Lutemon lutemon = getLutemonById(id);
        int a = lutemon.getAttack();
        int e = lutemon.getExperience();
        int attack = a + e;
        return attack;
    }

    public int Defense(double id) {
        Lutemon lutemon = getLutemonById(id);
        int d = lutemon.getDefense();
        int e = lutemon.getExperience();
        int defence = d + e;
        return defence;
    }

    public Lutemon getLutemonById(double id){
        ArrayList<Lutemon> lutemons = Storage.getInstance().getLutemons();
        Lutemon lutemon = null;
        for (Lutemon l : lutemons) {
            if (l.getId() == id){
                lutemon = l;
                break;
            }
        }
        return lutemon;
    }

    public void trainLutemon(int exp){
        this.experience = experience + exp;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getExperience() {
        return experience;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public double getId() {
        return id;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public int getImage() {
        return image;
    }


}




