package com.deloitte.lab3.ex5;

import java.util.Scanner;

public class Lab3Ex5 {
    public void countTextMetrics(String text) {
        String[] lines = text.split("\n");
        int numLines = lines.length;
        int numWords = 0;
        int numChars = 0;
        
        for (String line : lines) {
            String[] words = line.split("\\s+");
            numWords += words.length;
            numChars += line.length() + 1;
        }
        
        System.out.println("Number of characters: " + numChars);
        System.out.println("Number of lines: " + numLines);
        System.out.println("Number of words: " + numWords);
    }

    public static void main(String[] args) {
        Lab3Ex5 lab3Ex5 = new Lab3Ex5();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        lab3Ex5.countTextMetrics(text);
        
        scanner.close();
    }
}