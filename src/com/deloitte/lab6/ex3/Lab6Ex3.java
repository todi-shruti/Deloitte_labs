package com.deloitte.lab6.ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex3 {

    public Map<Integer, Integer> getSquares(int[] numbers) {
        Map<Integer, Integer> squaresMap = new HashMap<>();
        for (int number : numbers) {
            squaresMap.put(number, number * number);
        }
        return squaresMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Lab6Ex3 lab = new Lab6Ex3();
        Map<Integer, Integer> squaresMap = lab.getSquares(numbers);

        System.out.println("Number and their squares:");
        for (Map.Entry<Integer, Integer> entry : squaresMap.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Square: " + entry.getValue());
        }

        scanner.close();
    }
}
