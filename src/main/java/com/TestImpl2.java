package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestImpl2 implements TestInterface {

    private String someText;

    public int count() {
        return -1;
    }

    @Autowired
    public void setSomeText(@Value("kakoito text") String someText) {
        this.someText = someText;
    }

    public void initTest() {
        System.out.println("Бин теста2 создан");
    }

    public void destroyTest() {
        System.out.println("Вызван метод destroyTest2");
    }

    public String getSomeText() {
        return someText;
    }
}
