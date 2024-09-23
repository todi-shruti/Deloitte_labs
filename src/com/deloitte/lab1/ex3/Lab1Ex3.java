package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Lab1Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci (Recursive): " + fibonacciRecursive(n));
        System.out.println("Fibonacci (Non-Recursive): " + fibonacciNonRecursive(n));
        scanner.close();
    }

    private static int fibonacciRecursive(int n) {
        if (n <= 2) return 1; 
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    private static int fibonacciNonRecursive(int n) {
        if (n <= 1) return 1;
        int a = 1, b = 1, fib = 1;
        for (int i = 2; i < n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}


