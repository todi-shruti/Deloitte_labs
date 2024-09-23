package com.deloitte.lab5.ex1;

import java.util.Scanner;

public class Lab5Ex1 {

    static class AgeNotValidException extends Exception {
        public AgeNotValidException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Age is valid.");
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    static void validateAge(int age) throws AgeNotValidException {
        if (age <= 15) {
            throw new AgeNotValidException("Age must be above 15.");
        }
    }
}
