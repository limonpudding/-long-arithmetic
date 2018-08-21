package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    //@Autowired TestInterface getTest

    @Bean(initMethod = "initTest", destroyMethod = "destroyTest")
    @Scope("prototype")
    public TestInterface getTest(){
        System.out.println("Создание Test");
        return new TestImpl();
    }

    @Autowired
    @Bean(initMethod = "initTest", destroyMethod = "destroyTest")
    public TestInterface getTest2(){
        System.out.println("Создание Test");
        return new TestImpl2();
    }

    @Bean
    //TODO Есть несколько реализаций TestInterface. Как сделать так, чтобы подтянулась нужная нам реализация?
    @Autowired
    public NameInterface getName(@Qualifier("getTest") TestInterface test){

        NameInterface name = new NameImpl();
        System.out.println("Создание Name");
        name.setName(test.count()+" "+name.getName());
        return name;
    }

}
