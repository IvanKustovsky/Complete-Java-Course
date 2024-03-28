package com.example.learnspringframework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {}

record Address(String firstLine, String city) {}
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "LeBron";
    }

    @Bean
    public int age() {
        return 39;
    }

    @Bean
    public Person person() {
        return new Person("Steph", 35, new Address("Main Street", "Manchester"));
    }

    @Bean(name = "person2")
    public Person person2MethodCall() {
        return new Person(name(), age(), address()); // name, age, address
    }

    @Bean(name = "person3")
    public Person person3Parameters(String name, int age, Address address3) { // name, age, address2
        return new Person(name, age, address3);
    }

    @Bean(name = "person4")
    @Primary
    public Person person4Parameters(String name, int age, Address address) { // name, age, address2
        return new Person(name, age, address);
    }

    @Bean(name = "person5")
    public Person person4Qualifier(String name, int age, @Qualifier("address2qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Qualifier("address2qualifier")
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean(name = "address3")
    @Primary
    public Address address2() {
        return new Address("Chief Street", "Paris");
    }
}
