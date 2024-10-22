package org.example.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teorie {
    /*
    Collection
     - remove(), add(), get() etc

     List
     */

    public static void main(String[] args) {
        // colectie de timbre
        // colectie formata de mai multe obiecte de acelasi tip

        List<String> nameList = new ArrayList<>();
        nameList.add("Mihai"); // adauga elementul la finalul listei
        nameList.add("Mihai"); // adauga elementul la finalul listei

        nameList.add(0, "Mihai"); // adauga elementul pe pozitia 0 din lista

        nameList.remove("Mihai"); // !!! remove(object) functioneaza doar pentru obiectele
                                   // care suprascriu metoda equals() din clasa Object

        nameList.remove(0); // sterge elementul de pe pozitia i (index)

        int size = nameList.size(); // returneaza dimensiunea listei

        nameList.clear(); // sterge toate elementele din lista

        // nameList.get(0); // returneaza obiectul de pe pozitia i (index) din lista

        boolean isEmpty = nameList.isEmpty(); // returneaza un boolean true daca dimensiunea listei este 0
                                              // altfel returneaza false

        nameList.contains("Mihai"); // verifica daca un element este prezent in lista
                                    // !!! TREBUIE suprascrisa metoda equals() in clasele create de noi

        nameList.indexOf("Mihai"); // returneaza pozitia unui element din lista
                                    // !!! TREBUIE SUPRASCRISA METODA EQUALS()

        //nameList.set(0, "Andrei"); // ne ajuta sa facem UPDATE pentru un element din lista

        nameList.stream(); // transforma lista intr-un stream de date

        setupLinkedList();
    }

    public static void setupLinkedList() {
        List<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Orange");

        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
