package org.example.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ModFunctionareList {
    public static void main(String[] args) {
        // lungimea este 3
        // este o lungime statica
        // stocheaza doar String-uri

        System.out.println("Exemplu array");
        String[] names = new String[3];

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Exemplu List");
        List<String> namesList = new ArrayList<>();

        namesList.add("Mihai");
        namesList.add("Andrei");
        namesList.add("Ion");
        namesList.add("Daniel");

        for(int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }



    }

    public static void add(String name) {
        String[] currentNames = new String[3];

        String[] newArray = new String[currentNames.length * 2];
        newArray[0] = name;
    }
}
