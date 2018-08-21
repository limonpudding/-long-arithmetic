package com;

import org.springframework.stereotype.Component;

@Component("testImpl2")
public class TestImpl2 implements TestInterface {
    public int count() {
        return -1;
    }

    public void initTest() {

    }

    public void destroyTest() {

    }
}
