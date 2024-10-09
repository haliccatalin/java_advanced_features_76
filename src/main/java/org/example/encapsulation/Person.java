package org.example.encapsulation;

public class Person {
    private String name;
    private int age;

    // Constructor default
    // aceasta este prestabilit, cat timp nu avem
    // un alt constructor definit
    public Person() {
    }

    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;

        setName(name);
        setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        // this -> keyword
        // this -> ne ajuta sa facem diferenta
        // dintre variabila clasei si parametru,
        // in aceasta situatie

        // exemplu de validare pentru String
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

}
