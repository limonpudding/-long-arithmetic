package com;

public abstract class Animals {
    int number=1;
    protected abstract void doVoice();
    void grow(){
        number++;
    }

    void howOldAreYou() {
        System.out.println("Мне "+number+" лет");
    }
}
