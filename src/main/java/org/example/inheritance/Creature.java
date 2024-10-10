package org.example.inheritance;

public class Creature {
    private int age;

    // constructor default
    public Creature() {
        System.out.println("Constructor CLASA CREATURE");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}
