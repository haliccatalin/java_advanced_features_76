package org.example.abstraction.interfaces.functionalInterface;

public class Teorie {

    /*
    Functional Interface

    - interfetele functionale sunt acele interfete care
    au O SINGURA metoda abstracta, poate avea o infinitate
    de metode default.

    - LAMBDA EXPRESSION
        - se foloseste DOAR de interfete functionale;
        - este o modalitate de a scrie mai putin cod;
        - foloseste interfete anonime, asta inseamna
         ca interfete trebuie sa fie instantiate
        - exemple: Predicate, Consumer
     */
    public static void main(String[] args) {

        // Instantiere Anonima a Interfetei Sum
        Sum suma = new Sum() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        int result = suma.calculate(2, 3);
        System.out.println("Result: " + result);

        // Utilizare Lambda Expression
        Sum sumLambda = (a, b) -> a + b;

        result = sumLambda.calculate(2,3);
        System.out.println("Result with Lambda: " + result);

        // Instantiere Anonima a Interfetei Sum
        Sum sumaPozitive = new Sum() {
            @Override
            public int calculate(int a, int b) {
                return Math.abs(a) + Math.abs(b);
            }
        };
        result = sumaPozitive.calculate(-3,-5);
        System.out.println("Result: " + result);

        // Utilizare Lambda Expression
        Sum sumaPozitivaLambda = (a,b) -> Math.abs(a) + Math.abs(b);
        result = sumaPozitivaLambda.calculate(-3,-5);

        System.out.println("Result with Lambda: " + result);

    }
}
