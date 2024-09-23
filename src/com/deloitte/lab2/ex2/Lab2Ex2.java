package com.deloitte.lab2.ex2;

import java.util.Arrays;

public class Lab2Ex2 {

    public static String[] sortStrings(String[] arr) {
        Arrays.sort(arr);
        
        int n = arr.length;
        int mid = (n + 1) / 2; 
        
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            if (i < mid) {
                result[i] = arr[i].toUpperCase(); 
            } else {
                result[i] = arr[i].toLowerCase(); 
            }
        } 
        return result;
    }

    public static void main(String[] args) {
        String[] input = {"sonu", "monu", "tonu", "ponu", "soni", "moni"};
        String[] output = sortStrings(input);
        
        System.out.println(Arrays.toString(output));
    }
}
