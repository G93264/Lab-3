package com.company;

public class Fighter extends Warrior implements  IFighter{

    @Override
    public void incHealth() {
        addHealth(1);
    }

    @Override
    public void decHealth() {
        subHealth(1);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }
}
