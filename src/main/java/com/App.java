package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);
        TestInterface test = context.getBean(TestInterface.class);
        System.out.println(test.count());
        System.out.println(test.count());
        System.out.println(test.count());
        System.out.println(test.count());
        System.out.println(test.count());
        NameInterface name = context.getBean(NameInterface.class);
        System.out.println(name.getName());
        System.out.println(name.getName());
        System.out.println(name.getName());
        System.out.println(name.getName());
    }
}