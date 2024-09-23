package com.deloitte.lab3.ex4;

import java.util.Scanner;

public class Lab3Ex4 {
    public int modifyNumber(int number1) {
        String numStr = String.valueOf(number1);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numStr.length() - 1; i++) {
            int diff = Math.abs((numStr.charAt(i) - '0') - (numStr.charAt(i + 1) - '0'));
            result.append(diff);
        }

        result.append(numStr.charAt(numStr.length() - 1)); 
        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int inputNumber = scanner.nextInt();

        Lab3Ex4 lab = new Lab3Ex4();
        int modifiedNumber = lab.modifyNumber(inputNumber);
        System.out.println("Modified Number: " + modifiedNumber);

        scanner.close();
    }
}
