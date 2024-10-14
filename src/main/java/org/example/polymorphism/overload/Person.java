package org.example.polymorphism.overload;

public class Person {
    private String name;
    private String phone;
    private int age;

    public Person(String name, String phone) {

    }

    public Person(String name, String phone, int age) {

    }

    public Person(String name, int age, String phone) {

    }

    public Person(int age, String name, String phone) {

    }

    public Person(String name) {

    }
//    TIPUL Parametrului trebuie sa fie DIFERIT
//    public Person(String phone) {
//
//    }

    public Person() {

    }
}
