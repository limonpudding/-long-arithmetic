package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource({"classpath:spring.xml"})
public class BeanConfig {

    private TestInterface testInterface;

//    @Bean(name = "getTest", initMethod = "initTest", destroyMethod = "destroyTest")
//    @Scope("prototype")
//    public TestInterface getTest(@Value("SomeString") String str, @Value("50") int number) {
//        System.out.println("Создание Test");
//        return new TestImpl(str, number);
//    }

    @Bean(name = "getTest2", initMethod = "initTest", destroyMethod = "destroyTest")
    public TestInterface getTest2() {
        System.out.println("Создание Test2");
        return new TestImpl2();
    }

    @Bean
    //TODO Есть несколько реализаций TestInterface. Как сделать так, чтобы подтянулась нужная нам реализация?
    public NameInterface getName(@Qualifier("getTest2") TestInterface test) {
        NameInterface name = new NameImpl();
        System.out.println("Создание Name");
        name.setName(test.count() + " " + name.getName());
        return name;
    }
}
