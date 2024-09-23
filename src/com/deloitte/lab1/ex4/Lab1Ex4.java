package com.deloitte.lab1.ex4;

import java.util.Scanner;

public class Lab1Ex4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer upto which prime numbers are needed: ");
        int number = scanner.nextInt();
        
        System.out.println("Prime numbers up to " + number + ":");
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
    
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
