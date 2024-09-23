package com.deloitte.lab1.ex5;

import java.util.ArrayList;
import java.util.List;

public class Lab1Ex5 {

    public static void main(String[] args) {
        int n = 10; 
        int sum = calculateSum(n);
        System.out.println("Sum of the first " + n + " natural numbers divisible by 3 or 5 is: " + sum);
    }

    public static int calculateSum(int n) {
        int sum = 0;
        List<Integer> divisibleNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;                
                divisibleNumbers.add(i); 
            }
        }
        
        System.out.println("Numbers divisible by 3 or 5 up to " + n + ": " + divisibleNumbers);
        return sum;
    }
}
