package org.example.collections.exercises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Exercise 3: Unique Elements in a Set
Objective: Practice working with sets to eliminate duplicates.

Task:
Take an array of strings as input.
Convert the array to a Set to eliminate duplicate values.
Display the unique strings in the set.

 */
public class Ex1 {
    public static void main(String[] args) {
        String[] inputArray = {"Lapte", "Oua", "Paine", "Lapte", "Paine"};

        Set<String> stringSet = new HashSet<>();

//        stringSet.addAll(List.of(inputArray));

        for(String element : inputArray) {
            stringSet.add(element);
        }

        // display values from set
        for(String element: stringSet) {
            System.out.println(element);
        }
    }
}
