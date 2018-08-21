package com;

import org.springframework.stereotype.Component;

public class TestImpl implements TestInterface {
    //TODO придумать пример с Autowired. Объяснить, как оно работает
    private int number = 0;
    public int count() {
        return ++number;
    }

    public void initTest() {
        System.out.println("Бин теста создан");
    }

    public void destroyTest() {
        System.out.println("Вызван метод destroyTest");
    }
}
