package com.deloitte.lab3.ex3;

import java.util.Scanner;

public class Lab3Ex3 {
    public String alterString(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (isConsonant(ch)) {
                result.append((char) (ch + 1)); // Replace with next character
            } else {
                result.append(ch); // Keep vowels unchanged
            }
        }
        return result.toString();
    }

    private boolean isConsonant(char ch) {
        return Character.isAlphabetic(ch) && "AEIOUaeiou".indexOf(ch) == -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        Lab3Ex3 lab = new Lab3Ex3();
        String result = lab.alterString(input);
        System.out.println(result);

        scanner.close();
    }
}
