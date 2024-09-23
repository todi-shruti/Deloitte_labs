package com.deloitte.lab1.ex2;

import java.util.Scanner;

public class Lab1Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a traffic light:\n1. Red\n2. Yellow\n3. Green");
        System.out.print("Enter your choice (1-3): ");
        
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: System.out.println("Red light: Stop"); 
            		break;
            case 2: System.out.println("Yellow light: Ready"); 
            		break;
            case 3: System.out.println("Green light: Go"); 
            		break;
            default: System.out.println("Invalid choice. Select 1, 2, or 3.");
        }
        
        scanner.close();
    }
}

