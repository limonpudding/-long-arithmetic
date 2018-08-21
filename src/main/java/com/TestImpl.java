package com;

import org.springframework.stereotype.Component;

@Component
public class TestImpl implements TestInterface {
    private int number = 0;
    public int count() {
        return ++number;
    }
}
