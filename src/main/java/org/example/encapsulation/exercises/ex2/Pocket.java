package org.example.encapsulation.exercises.ex2;
//Create class Pocket.
//a) Add field "money", create constructor, getter and setter.
//b) Add verification for both getter and setter. Getter should result in returning as much
//money, as the user asked for. It should return 0 if money <= 10.
//c) Setter should not accept values below 0 and greater than 3000. It may print a message
//like „I don't have enough space in my pocket for as much money!"

public class Pocket {
    private int money;

    public Pocket(int money) {
        this.money = money;

    }

    public int getMoney() {
        if (this.money <= 10) {
            return 0;
        } else {
            return this.money;
        }
    }

    public void setMoney(int money) {
        if (money > 0 && money < 3000) {
            this.money = money;
        } else {
            System.out.println("I don't have enough space in my pocket for as much money!");
        }
    }

    public void withdraw(int amount) {
        if (amount <= money) {
            this.money = money - amount;
        } else {
            System.out.println("Sold insuficient");
        }
    }
}