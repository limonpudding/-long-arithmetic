package com;

public class TestImpl2 implements TestInterface {
    public int count() {
        return -1;
    }

    public void initTest() {
        System.out.println("Бин теста2 создан");
    }

    public void destroyTest() {
        System.out.println("Вызван метод destroyTest2");
    }
}
