package com.deloitte.lab1.ex6;

public class Lab1Ex6 {

    public static void main(String[] args) {
        int n = 10; 
        int difference = calculateDifference(n);
        System.out.println("The difference for n = " + n + " is: " + difference);
    }

    public static int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i; 
            sum += i;              
        }

        int squareOfSum = sum * sum; 
        return sumOfSquares - squareOfSum; 
    }
}

