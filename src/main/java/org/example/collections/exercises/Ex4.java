package org.example.collections.exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
Exercise: Word Frequency Counter using Map
Objective: Use a map to count occurrences of words.
Task:
Write a program that takes a sentence as input.
Split the sentence into words and store them in a Map (or HashMap).
Count the number of times each word appears.
Print each word and its corresponding frequency.
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> wordMap = new TreeMap<>();

        System.out.println("Introduceti o propozitie");
        String sentence = scanner.nextLine();

        String[] wordsArray = sentence.split(" ");

        for (int i = 0; i < wordsArray.length; i++) {
            String key = wordsArray[i];

            if (wordMap.containsKey(key)) {
                int value = wordMap.get(key);

                value++;

                wordMap.put(key, value);
            } else {
                wordMap.put(wordsArray[i], 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
