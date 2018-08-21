package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public TestInterface getTest(){
        System.out.println("Создание Test");
        return new TestImpl();
    }

    @Bean
    //TODO Есть несколько реализаций TestInterface. Как сделать так, чтобы подтянулась нужная нам реализация?
    public NameInterface getName(TestInterface test){
        NameInterface name = new NameImpl();
        System.out.println("Создание Name");
        name.setName(test.count()+" "+name.getName());
        return name;
    }

}
