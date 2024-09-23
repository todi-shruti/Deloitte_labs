package com.deloitte.lab6.ex7;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6Ex7 {

    public int[] getSorted(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = reverseNumber(numbers[numbers.length - 1 - i]);
            numbers[numbers.length - 1 - i] = reverseNumber(temp);
        }

        Arrays.sort(numbers);
        return numbers;
    }

    private int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Lab6Ex7 lab = new Lab6Ex7();
        int[] sortedArray = lab.getSorted(numbers);

        System.out.println("Sorted array after reversing the numbers:");
        System.out.println(Arrays.toString(sortedArray));

        scanner.close();
    }
}
