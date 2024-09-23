package com.deloitte.lab9.ex2;
import java.util.Scanner;

public class Lab9Ex2 {

    public static void main(String[] args) {
        StringFormatter formatter = (str) -> {
            StringBuilder formattedStr = new StringBuilder();
            for (char c : str.toCharArray()) {
                formattedStr.append(c).append(" ");
            }
            return formattedStr.toString().trim();
        };
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String formattedString = formatter.format(input);
        System.out.println("Formatted string: " + formattedString);
    }
}

interface StringFormatter {
    String format(String str);
}