package org.example.exceptions.exempluLogin;

public class AuthServiceImpl implements AuthService {
    private String email;
    private String password;

    public AuthServiceImpl(String email, String password) {
        this.password = password;
        this.email = email;
    }

    @Override
    public boolean login(String email, String password) throws EmailInvalidException, PasswordInvalidException {
        if (email == null || email.isEmpty()) {
            throw new EmailInvalidException("Emailul este null sau nu contine text");
        }

        if (!this.email.equalsIgnoreCase(email)) {
            throw new EmailInvalidException("Emailul nu exista in baza de date");
        }

        if (password == null || password.isEmpty()) {
            throw new PasswordInvalidException("Parola este null sau este un text gol");
        }

        if (!this.password.equals(password)) {
            throw new PasswordInvalidException("Parola este incorecta");
        }

        System.out.println("Esti autentificat cu succes");

        return true;
    }
}
