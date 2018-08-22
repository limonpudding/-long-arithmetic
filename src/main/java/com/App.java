package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    String someText = "lol";
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);
        TestInterface test = (TestInterface)context.getBean("getTest");
        System.out.println(test.count());
        System.out.println(test.count());
        System.out.println(test.count());
        System.out.println(test.getSomeText());
        TestInterface test2 = (TestInterface)context.getBean("getTest2");
        System.out.println(test2.count());
        System.out.println(test2.count());
        System.out.println(test2.getSomeText());
        NameInterface name = context.getBean(NameInterface.class);
        System.out.println(name.getName());
        System.out.println(name.getName());
        System.out.println(name.getName());
        System.out.println(name.getName());
        //((AnnotationConfigApplicationContext) context).registerShutdownHook();
    }
}
