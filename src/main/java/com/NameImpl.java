package com;

public class NameImpl implements NameInterface{
    private String name="unnamed";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
