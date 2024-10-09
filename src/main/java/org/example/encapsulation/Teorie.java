package org.example.encapsulation;

public class Teorie {
    public static void main(String[] args) {
        Person ionel = new Person();
        ionel.setName("Ionel");
        ionel.setAge(30);

        System.out.println("Nume: " + ionel.getName() + ", varsta: " + ionel.getAge());

        ionel.setAge(-100);
        System.out.println("Varsta ionel: "  + ionel.getAge());

        // ASA NU!!!
//        ionel.age = -950;
//        System.out.println("Varsta ionel: "  + ionel.getAge());

    }
}
