package com.deloitte.lab3.ex1;

import java.util.StringTokenizer;
import java.util.Scanner;

public class Lab3Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of integers:");
        String inputLine = scanner.nextLine();
        
        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        int sum = 0;

        while (tokenizer.hasMoreTokens()) {
            int number = Integer.parseInt(tokenizer.nextToken());
            System.out.println("Integer: " + number);
            sum += number;
        }

        System.out.println("Sum of all integers: " + sum);
        scanner.close();
    }
}
