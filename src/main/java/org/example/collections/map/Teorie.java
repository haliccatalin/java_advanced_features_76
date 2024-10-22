package org.example.collections.map;

import java.util.*;

public class Teorie {
    /*
       Map

       - este un dictionar format din key - value
       - elementele din dictionar sunt unice, adica key-ul este unic
       - avem mai multe implementari ale interfetei Map
       - MAP NU ESTE COPILUL INTERFETEI COLLECTION
     */
    public static void main(String[] args) {
//        setupHashMap();
//        setupTreeMap();
//        setupLinkedHashMap();
        exercitiuJudete();
    }

    public static void setupHashMap() {
        Map<String, Integer> personMap = new HashMap<>();

        // metoda care ne ajuta sa adaugam elemente in map
        personMap.put("Mihai", 30);
        personMap.put("Ionel", 24);
        personMap.put("Andreea", 28);
        personMap.put("Dana", 30);
        personMap.put("Dana", 30);

        // System.out.println(personMap);

        for(Map.Entry<String, Integer> row : personMap.entrySet()) {
            String key = row.getKey();

            Integer value = row.getValue();

            System.out.println(key + " - " + value);
        }

        Integer value = personMap.get("Ionel");
        System.out.println("Afisare value: " + value);

        if(personMap.putIfAbsent("Dana", 40) == null) {
            System.out.println("Add with success");
        } else {
            System.out.println("It is already present!");
        }

        if(personMap.containsKey("Dana")) {
            System.out.println("It is already present!");
        }

        if(personMap.containsValue(28)) {
            System.out.println("28 it is present!");
        }



    }

    public static void setupTreeMap() {
        // In TreeMap elementele sunt sortate in functie de cheie
        Map<String, Integer> personMap = new TreeMap<>();

        // metoda care ne ajuta sa adaugam elemente in map
        personMap.put("Mihai", 30);
        personMap.put("Ionel", 24);
        personMap.put("Andreea", 28);
        personMap.put("Dana", 30);
        personMap.put("Dana", 30);

        // System.out.println(personMap);

        for(Map.Entry<String, Integer> row : personMap.entrySet()) {
            String key = row.getKey();

            Integer value = row.getValue();

            System.out.println(key + " - " + value);
        }
    }

    public static  void setupLinkedHashMap() {
        Map<String, Integer> personMap = new LinkedHashMap<>();

        // metoda care ne ajuta sa adaugam elemente in map
        personMap.put("Mihai", 30);
        personMap.put("Ionel", 24);
        personMap.put("Andreea", 28);
        personMap.put("Dana", 30);
        personMap.put("Dana", 30);

        // System.out.println(personMap);

        for(Map.Entry<String, Integer> row : personMap.entrySet()) {
            String key = row.getKey();

            Integer value = row.getValue();

            System.out.println(key + " - " + value);
        }
    }

    public static void exercitiuJudete() {
        Map<String, List<String>> countyMap = new HashMap<>();

        List<String> oraseOlt = new ArrayList<>();
        oraseOlt.add("Slatina");
        oraseOlt.add("Bals");
        oraseOlt.add("Caracal");

        // adaugare elemente in map
        countyMap.put("Olt", oraseOlt);

        List<String> oraseArad = new ArrayList<>();
        oraseArad.add("Lipova");
        oraseArad.add("Ineu");
        oraseArad.add("Siria");

        // adaugare elemente in map
        countyMap.put("Arad", oraseArad);

        // update lista orase
        // luam lista din map, folosind key-ul
        List<String> backupOraseArad = countyMap.get("Arad");

        // adaugam/stergem orasul in/din lista
        backupOraseArad.add("Brad");

        // actualizam valoarea in map (put sau replace)
        countyMap.put("Arad", backupOraseArad);
        countyMap.replace("Arad", backupOraseArad);

        // afisare orase din Olt
        List<String> oraseJudetOltList = countyMap.get("Olt");
        for(String oras : oraseJudetOltList) {
            System.out.println(oras);
        }

        // afisare elemente din map
        for(Map.Entry<String, List<String>> entry : countyMap.entrySet()) {
            System.out.println(entry.getKey());

            List<String> oraseList = entry.getValue();
            for(String oras : oraseList) {
                System.out.println("\t - " + oras);

            }
        }

    }
}
