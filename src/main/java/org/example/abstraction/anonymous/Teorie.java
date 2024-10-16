package org.example.abstraction.anonymous;

public class Teorie {

    public static void main(String[] args) {
        Person p = new Person("user") {
            @Override
            public void showInfo() {
                System.out.println("showInfo:" + getName());
            }

            @Override
            public String toUpperCaseName() {
                return getName().toUpperCase();
            }
        };

        p.showInfo();
        String result = p.toUpperCaseName();
        System.out.println(result);

        System.out.println("--------");


        Person p2 = new Person("other user") {
            // proprietatea clasei person
            String username = getName().toUpperCase();
            boolean isEmpty = false;

            @Override
            public void showInfo() {
                System.out.println("Aceasta este o noua metoda");
                System.out.println("second instance " + getName());

                if (!isEmpty) {
                    System.out.println(getUsername());
                } else {
                    System.out.println("is empty");
                }

            }

            @Override
            public String toUpperCaseName() {
                return "Este cu upperCase: " + getName().toUpperCase();
            }

            // nou getter pentru usenname
            public String getUsername() {
                return username;
            }
        };
        p2.showInfo();
        result = p2.toUpperCaseName();

        System.out.println(result);
    }


}
