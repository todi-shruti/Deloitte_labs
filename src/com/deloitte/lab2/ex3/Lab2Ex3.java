package com.deloitte.lab2.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex3 {

    public static int[] getSorted(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            String reversedString = new StringBuilder(String.valueOf(inputArray[i])).reverse().toString();
            inputArray[i] = Integer.parseInt(reversedString);
        }

        Arrays.sort(inputArray);
        return inputArray; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] sortedArray = getSorted(numbers);
        System.out.println("Sorted array after reversing the numbers: " + Arrays.toString(sortedArray));

        scanner.close();
    }
}

