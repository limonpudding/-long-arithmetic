package com;

public class Dog extends Animals {
    public Dog(int years){
        super.number=years;
    }

    protected void doVoice() {
        System.out.println("Гав");
    }
}
