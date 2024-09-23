package com.deloitte.lab6.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex6 {

    public List<String> votersList(Map<String, Integer> people) {
        List<String> eligibleVoters = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            if (entry.getValue() > 18) {
                eligibleVoters.add(entry.getKey());
            }
        }
        
        return eligibleVoters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> people = new HashMap<>();

        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter age for " + id + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            people.put(id, age);
        }

        Lab6Ex6 lab = new Lab6Ex6();
        List<String> eligibleVoters = lab.votersList(people);
        
        System.out.println("Eligible Voter IDs: " + eligibleVoters);

        scanner.close();
    }
}
