package com;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestImpl implements TestInterface {
    private int number = 0;

    private String someText;

    @Autowired
    public TestImpl(String someText, int number) {
        this.someText = someText;
        this.number = number;
    }
    //TODO придумать пример с Autowired. Объяснить, как оно работает

    public int count() {
        return ++number;
    }

    public void initTest() {
        System.out.println("Бин теста создан");
    }

    public void destroyTest() {
        System.out.println("Вызван метод destroyTest");
    }

    public String getSomeText() {
        return someText;
    }
}
