package org.example.collections.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Exercise : List Operations
Objective: Perform basic operations on a list.
Task:
Create a list of 10 integers.
Allow the user to add 5 more integers to the list.
Remove any element greater than 50.
Find the maximum and minimum elements.
Reverse the list and print it.

 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(14);
        numberList.add(112);
        numberList.add(16);
        numberList.add(13);
        numberList.add(10);
        numberList.add(90);
        numberList.add(20);
        numberList.add(34);
        numberList.add(49);

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduceti un numar intreg:");
            int number = scanner.nextInt();

            numberList.add(number);
        }

        // varianta 1
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) > 50) {
                numberList.remove(i);
                i--;
            }
        }

        // varianta 2
        int i = 0;
        while (i < numberList.size()) {
            int number = numberList.get(i);

            if (number > 50) {
                numberList.remove(i);
            } else {
                i++;
            }
        }

        for (Integer number : numberList) {
            System.out.print(number + ", ");
        }

        System.out.println();

        // minim si maxim
        int min = numberList.getFirst();
        int max = numberList.getFirst();

        for(i =0; i< numberList.size(); i++) {
            int nr = numberList.get(i);

            if(nr < min) {
                min = nr;
            }

            if(nr > max) {
                max = nr;
            }
        }

        System.out.println("Minim: " + min);
        System.out.println("Maxim: " + max);

        // reversed list
        numberList = numberList.reversed();
        for(Integer number : numberList) {
            System.out.print(number + ", ");
        }
    }
}
