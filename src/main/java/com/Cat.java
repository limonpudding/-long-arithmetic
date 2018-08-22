package com;

public class Cat extends Animals {

    public Cat(int years){
        super.number=years;
    }

    protected void doVoice() {
        System.out.println("Мяу");
    }
}
