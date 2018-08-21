package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {



    @Bean(initMethod = "initTest", destroyMethod = "destroyTest")
    @Scope("prototype")
    @Qualifier("testImpl")
    public TestInterface getTest(){
        System.out.println("Создание Test");
        return new TestImpl();
    }

    @Bean
    @Autowired
    //TODO Есть несколько реализаций TestInterface. Как сделать так, чтобы подтянулась нужная нам реализация?
    public NameInterface getName(TestInterface test){

        NameInterface name = new NameImpl();
        System.out.println("Создание Name");
        name.setName(test.count()+" "+name.getName());
        return name;
    }

}
