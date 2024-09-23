package com.deloitte.lab9.ex1;

import java.util.Scanner;

interface MathOperation {
    double operation(int x, int y);
}

public class Lab9Ex1 {

    public static void main(String[] args) {
        MathOperation power = (x, y) -> Math.pow(x, y);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        double result = power.operation(x, y);
        System.out.println("Result: " + result);
    }
}