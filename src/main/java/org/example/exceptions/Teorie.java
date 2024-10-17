package org.example.exceptions;

import java.util.Scanner;

public class Teorie {
    /*
    Exceptii

    - opresc executia programului atunci cand apar;
    - sunt obiecte, care au ca si clasa parinte clasa
    Throwable
    - putem arunca/prinde exceptii
    - exista exceptii numite Error care tin de platforma
    si nu tine de codul scris de noi
    - Exemple de Exceptii: NullPointerException, InputMismatchException,
    IOException, ArithmeticalException
   - Throwable
        - Error
        - Exception


    - atunci cand definim o clasa pentru exceptii, folosim cuvant Exception in denumire

    - sunt 2 categorii de Exceptii

    1. Checked Exception
       - sunt exceptii de compilare (compile time)
       IOException -> la citirea datelor din fisiere
       SQLException -> "SELECT * FROM users;  => aceasta sintaxa (query) o scriem manual!!!

       - aceste exceptii de tip "checked" trebuie sa fie TRATATE/GESTIONATE pentru a putea rula aplicatia

    2. Unchecked Exception
       - sunt exceptii de rulare (run-time)
       NullPointerException, IndexOutOfBounds, InputMismatchException, ArithmeticalException

    Aruncarea exceptiilor (throw) si Pasarea exceptiilor dintr-o metoda in alta (throws)
    - throw si throws

    1. throw - arunca exceptia ex: throw new Exception("Aceasta este o exceptie");
             - atunci cand aruncam o exceptie, codul de dupa nu se mai executa, si iese din metoda
             functioneaza ca un return

    2. throws -> se scrie in semnatura metodei, marcheaza acea metoda cum ca poate arunca, candva, o exceptie
    public void divNumbers(int a, int b) throws ArithmeticalException {

    }

     */

    public static void main(String[] args) {
//        handleInputMismatchException();

        startCalculator();
    }

    public static void handleInputMismatchException() {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        try {
            System.out.println("Introduceti un numar intreg: ");

            // incercam citirea numarului de la tastatura
            number = scanner.nextInt();
        } catch (Throwable t) {
            // prindem exceptia in cazul in care utilizatorul a introdus
            // altceva in locul unui numar

            // afisarea mesajului de eroare
            System.out.println("Eroare:");
            System.out.println(t.getMessage());
        } finally {
            // Blocul de cod finally este OPTIONAL
            // finally se executa tot timpul, daca avem sau nu vreo exceptie

            // DAR!!! -> folosim finally atunci cand: citim dintr-un fisier, executam query catre baza de date
            // pentru ca dorim sa inchidem procesul de citire din fisier sau conexiunea cu baza de date,
            // indiferent daca avem SAU nu avem vreo exceptie pe parcurs
//

            // in final afisam numarul
            System.out.println("Numarul citit este: " + number);
        }


    }

    public static void startCalculator() {
        try {
            divideNumbers(20,1);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Eroare");
            System.out.println(arithmeticException.getMessage());
        } catch (NullPointerException nullPointerException) {
            System.out.println("S-a aruncat o exceptie pentru null");
        } catch (Exception exception) {

        } catch (Throwable throwable) {
            System.out.println("Prindem orice!");
        }

    }

    public static int divideNumbers(int a, int b) throws ArithmeticException, NullPointerException {
        if(a == 0 || b == 0) {
            throw new ArithmeticException("Unul din numerele a si b este egal 0");
        }

        if(a == 20 && b == 1) {
            throw new NullPointerException("Null pointer exception");
        }

        int result = a / b;

        System.out.println("Rezultatul: " + result);

        return result;
    }
}
