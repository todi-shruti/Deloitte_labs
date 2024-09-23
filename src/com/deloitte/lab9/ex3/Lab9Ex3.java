package com.deloitte.lab9.ex3;

import java.util.Scanner;

public class Lab9Ex3 {

    public static void main(String[] args) {
        Authenticator authenticator = (username, password) -> {
            String expectedUsername = "admin";
            String expectedPassword = "password";
            return username.equals(expectedUsername) && password.equals(expectedPassword);
        };
        System.out.print("Enter username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        boolean isAuthenticated = authenticator.authenticate(username, password);
        System.out.println("Is authenticated: " + isAuthenticated);
    }
}

interface Authenticator {
    boolean authenticate(String username, String password);
}