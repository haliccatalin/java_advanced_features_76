package org.example.exceptions.exempluLogin;

import java.util.Scanner;

public class Application {
    public void start() {
        AuthService authService = new AuthServiceImpl("admin@gmail.com", "Admin");

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        do {
            System.out.println("Introduceti un email");
            String email = scanner.nextLine();
            System.out.println("Introduceti parola");
            String password = scanner.nextLine();

            try {
                authService.login(email, password);

                isRunning = false;
            } catch (EmailInvalidException emailInvalidException) {
                System.out.println("Exceptie email: ");
                System.out.println(emailInvalidException.getMessage());
            } catch (PasswordInvalidException passwordInvalidException) {
                System.out.println("Exceptie password");
                System.out.println(passwordInvalidException.getMessage());

            } catch (Exception exception) {
                System.out.println("Exceptie generala");
                System.out.println(exception.getMessage());
            }


        } while (isRunning);


        scanner.close();
    }
}
