package com.deloitte.lab6.ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex4 {

    public HashMap<String, String> getStudents(HashMap<String, Integer> marksMap) {
        HashMap<String, String> medalMap = new HashMap<>();

        for (String regNumber : marksMap.keySet()) {
            int marks = marksMap.get(regNumber);
            if (marks >= 90) {
                medalMap.put(regNumber, "Gold");
            } else if (marks >= 80) {
                medalMap.put(regNumber, "Silver");
            } else if (marks >= 70) {
                medalMap.put(regNumber, "Bronze");
            }
        }
        
        return medalMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> marksMap = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter registration number: ");
            String regNumber = scanner.nextLine();
            System.out.print("Enter marks for " + regNumber + ": ");
            int marks = scanner.nextInt();
            scanner.nextLine(); 
            marksMap.put(regNumber, marks);
        }

        Lab6Ex4 lab = new Lab6Ex4();
        HashMap<String, String> medalMap = lab.getStudents(marksMap);

        System.out.println("Students and their medals:");
        for (Map.Entry<String, String> entry : medalMap.entrySet()) {
            System.out.println("Registration Number: " + entry.getKey() + ", Medal: " + entry.getValue());
        }

        scanner.close();
    }
}
