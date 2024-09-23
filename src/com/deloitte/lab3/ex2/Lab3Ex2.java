package com.deloitte.lab3.ex2;

import java.util.Scanner;

public class Lab3Ex2 {
    public String getImage(String input) {
        StringBuffer stringBuffer = new StringBuffer(input);
        String mirrorImage = stringBuffer.reverse().toString();
        return input + "|" + mirrorImage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        Lab3Ex2 lab = new Lab3Ex2();
        String result = lab.getImage(input);
        System.out.println(result);
        
        scanner.close();
    }
}
