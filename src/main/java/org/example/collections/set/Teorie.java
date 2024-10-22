package org.example.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Teorie {
    /*
    Set
    - nu permite elemente duplicate
    - permite o singura valoare de NULL
    - ordinea adaugarii elementelor depinde de implementarea clasei pe care o folosim
    - este obligatoriu sa suprascriem metodele hashCode() si equals() in clase pe care noi adaugam in Set
     */
    public static void main(String[] args) {
//        setupHashSet();
//        setupTreeSet();
        setupLinkedHashSet();
    }

    public static void setupHashSet() {
        Set<Integer> numbersSet = new HashSet<>();

        // HashSet => sorteaza elementele pe baza unui hashcode

        numbersSet.add(1);
        numbersSet.add(17);
        numbersSet.add(3);
        numbersSet.add(2);
        numbersSet.add(10);
        numbersSet.add(1);

        for (Integer integer : numbersSet) {
            System.out.println(integer);
        }

    }

    public static void setupTreeSet() {
        Set<Integer> numbersSet = new TreeSet<>();

        numbersSet.add(1);
        numbersSet.add(17);
        numbersSet.add(3);
        numbersSet.add(2);
        numbersSet.add(10);
        numbersSet.add(1);

        for (Integer integer : numbersSet) {
            System.out.println(integer);
        }
    }

    public static void setupLinkedHashSet() {
        Set<Integer> numbersSet = new LinkedHashSet<>();

        numbersSet.add(1);
        numbersSet.add(17);
        numbersSet.add(3);
        numbersSet.add(2);
        numbersSet.add(10);
        numbersSet.add(1);

        for (Integer integer : numbersSet) {
            System.out.println(integer);
        }
    }
}
