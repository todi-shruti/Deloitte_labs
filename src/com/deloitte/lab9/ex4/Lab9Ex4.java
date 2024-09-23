package com.deloitte.lab9.ex4;

import java.util.function.Supplier;

class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Shruti Todi";
        this.age = 22;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Lab9Ex4 {

    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;

        Person person = personSupplier.get();

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
