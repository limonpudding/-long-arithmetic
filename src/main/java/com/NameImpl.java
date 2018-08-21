package com;

public class NameImpl implements NameInterface{
    //TODO изучить жизненный цикл бинов, изучить scope бинов, изучить, как его настроить (scope)
    private String name="unnamed";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
