package org.example.collections.list.exercises.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    // Write a Java program to search for an element in an array list.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wordsList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Introduceti un cuvant: ");
            String input = scanner.nextLine();

            wordsList.add(input);
        }

        System.out.println("-----------");

        showList(wordsList);

        System.out.println("Introduceti cuvantul cautat");
        String search = scanner.nextLine();

//        if(wordsList.contains(search)) {
//            int index = wordsList.indexOf(search);
//            System.out.println("Cuvantul este in lista la pozitia: " + index);
//        } else {
//            System.out.println("Cuvantul nu exista!");
//        }

        if (contains(search, wordsList)) {
            int index = wordsList.indexOf(search);
            System.out.println("Cuvantul este in lista la pozitia: " + index);
        } else {
            System.out.println("Cuvantul nu exista!");
        }
    }

    public static void showList(List<String> wordsList) {
//        for(int i =0; i < wordsList.size(); i++) {
//            System.out.println(wordsList.get(i));
//        }

        for (String word : wordsList) {
            System.out.println(word);
        }
    }

    public static boolean contains(String word, List<String> wordsList) {
        for(String item : wordsList) {
            if(item.equals(word)) {
                return true;
            }
        }

        return false;
    }
}
