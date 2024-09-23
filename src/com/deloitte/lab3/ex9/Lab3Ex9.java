package com.deloitte.lab3.ex9;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Lab3Ex9 {
    public void printDuration(int year, int month, int day) {
        LocalDate givenDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(givenDate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Duration:");
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }

    public static void main(String[] args) {
        Lab3Ex9 lab3Ex9 = new Lab3Ex9();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        lab3Ex9.printDuration(year, month, day);
        
        scanner.close();
    }
}