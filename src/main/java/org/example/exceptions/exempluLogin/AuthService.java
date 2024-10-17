package org.example.exceptions.exempluLogin;

public interface AuthService {
    boolean login(String email, String password) throws EmailInvalidException, PasswordInvalidException;
}
