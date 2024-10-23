package org.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teorie {
    /*
    Strems

    - ne ajuta sa manipulam colectiile
    - filter () -> ne ajuta sa face o cautare intr-o singura linie de cod, folosin metoda filter()
    - map() -> ne ajuta sa transformam o colectie de tip String intr-o colectie de orice alt tip
    - cu metoda map, putem tranforma o lista de obiecte de tip Person cu proprietatea email,
    intr-o lista de elemente de tip String cu toate acele adrese de mail.
    - toList() -> transforma stream-ul inapoi in lista
    - toSet()
    - toMap()
    - foreach() este o metoda terminala, care ne ajuta sa parcurgem lista
     */
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();

        nameList.add("Ionel");
        nameList.add("Andrei");
        nameList.add("Mihai");
        nameList.add("Miruna");
        nameList.add("Andreea");
        nameList.add("Ana");
        nameList.add("Alina");

        System.out.println("Varianta FOR");
        for (String name : nameList) {
            System.out.print(name + ", ");
        }

//        nameList.forEach(System.out::println);

        nameList.forEach((name) -> System.out.println(name));

        System.out.println();
        System.out.println("Varianta Stream");
        nameList.stream()
                .forEach((name) -> System.out.print(name + ", "));

        System.out.println();
        System.out.println("Afisare persoane cu litara A");
        System.out.println("Varianta cu For");
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).startsWith("A")) {
                System.out.print(nameList.get(i) + ", ");
            }
        }

        System.out.println();
        System.out.println("Varianta cu Stream");

        nameList.stream()
                .forEach((name) -> {
                    if (name.startsWith("A")) {
                        System.out.print(name + ", ");
                    }
                });

        System.out.println();
        System.out.println("Extragem din lista numele care incepe cu litera M, sa-l savam intr-o alta lista");

        List<String> nameWithM = new ArrayList<>();
        for (String name : nameList) {
            if (name.startsWith("M")) {
                nameWithM.add(name);
            }
        }
        showList("Lista creata cu FOR", nameWithM);

        List<String> nameWithMStream = nameList.stream()
                .filter((name) -> name.startsWith("M"))
                .toList();

        showList("Lista creata cu Stream si Filter", nameWithMStream);

        System.out.println("Sa gaseasca numele care incep cu litera A si sa se returneze o lista de tipul Integer care va contine numarul de caractere pentru fiecare string");

        List<Integer> counterCharsList = new ArrayList<>();
        for (String name : nameList) {
            if (name.startsWith("A")) {
                int size = name.length();

                counterCharsList.add(size);
            }
        }

        showListNumber("Varianta FOR", counterCharsList);

        List<Integer> counterCharsListStream = nameList.stream()
                .filter((name) -> name.startsWith("A"))
                .map((name) -> name.length())
//                .filter((value) -> value > 3)
                .toList();

        showListNumber("Varianta Stream", counterCharsListStream);

    }


    public static void showList(String message, List<String> nameList) {
        System.out.println();
        System.out.println(message);

        for (String name : nameList) {
            System.out.print(name + ", ");
        }
        System.out.println();
    }

    public static void showListNumber(String message, List<Integer> numberList) {
        System.out.println();
        System.out.println(message);

        for (Integer number : numberList) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }
}
