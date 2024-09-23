package com.deloitte.lab1.ex1;

import java.util.Scanner;

public class Lab1Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n-digit number: ");
        int number = scanner.nextInt();
        
        System.out.println("Sum of the cubes of the digits: " + sumOfCubes(number));
        scanner.close();
    }

    private static int sumOfCubes(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum;
    }
}
