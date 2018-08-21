package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public TestInterface getTest(){
        return new TestImpl();
    }

    @Bean
    public NameInterface getName(TestInterface test){
        NameInterface name = new NameImpl();
        name.setName(test.count()+" "+name.getName());
        return name;
    }

}
