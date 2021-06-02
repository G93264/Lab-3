package com.company;

public class Warrior {
    private int health = 100;
    public void addHealth(int amt){
        health += amt;
    }
    public void subHealth(int amt){
        health -= amt;
    }
    public int getHealth(){
        return health;
    }
}
