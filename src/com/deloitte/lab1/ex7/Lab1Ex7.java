package com.deloitte.lab1.ex7;

public class Lab1Ex7 {

    public static void main(String[] args) {
        int number = 134468; 
        boolean isIncreasing = checkNumber(number);
        System.out.println(number + " is an increasing number: " + isIncreasing);
    }

    public static boolean checkNumber(int number) {
        String numStr = String.valueOf(number); 

        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) < numStr.charAt(i - 1)) {
                return false; 
            }
        }
        return true; 
    }
}

