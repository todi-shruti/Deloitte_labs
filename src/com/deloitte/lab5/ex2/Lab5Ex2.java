package com.deloitte.lab5.ex2;

import java.util.Scanner;

public class Lab5Ex2 {

    static class NameException extends Exception {
        public NameException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine().trim();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine().trim();

        try {
            validateName(firstName, lastName);
            System.out.println("Full name is valid: " + firstName + " " + lastName);
        } catch (NameException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void validateName(String firstName, String lastName) throws NameException {
        if (firstName.isEmpty() || lastName.isEmpty()) {
            throw new NameException("Name is not valid");
        }
    }
}
