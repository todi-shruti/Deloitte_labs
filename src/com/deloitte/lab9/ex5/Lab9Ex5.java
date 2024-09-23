package com.deloitte.lab9.ex5;

public class Lab9Ex5 {

    public static void main(String[] args) {
        FactorialCalculator calculator = Lab9Ex5::calculateFactorial;

        int number = 5;
        int result = calculator.calculate(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

    public static int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    interface FactorialCalculator {
        int calculate(int number);
    }
}