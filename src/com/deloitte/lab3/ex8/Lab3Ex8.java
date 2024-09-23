package com.deloitte.lab3.ex8;

import java.util.Scanner;

public class Lab3Ex8 {
    public boolean isPositiveString(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Lab3Ex8 lab3Ex8 = new Lab3Ex8();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        boolean result = lab3Ex8.isPositiveString(str);
        System.out.println("Is the string positive? " + result);
        
        scanner.close();
    }
}