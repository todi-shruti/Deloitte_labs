package com.deloitte.lab2.ex4;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Lab2Ex4 {

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 5, 2, 3, 10}; 
        int[] modifiedArray = modifyArray(array);
        System.out.println("Resulting array: " + Arrays.toString(modifiedArray));
    }

    public static int[] modifyArray(int[] array) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num); 
        }
        
        int[] uniqueArray = set.stream().mapToInt(Integer::intValue).toArray(); 
        Arrays.sort(uniqueArray); 
        
        for (int i = 0; i < uniqueArray.length / 2; i++) {
            int temp = uniqueArray[i];
            uniqueArray[i] = uniqueArray[uniqueArray.length - 1 - i];
            uniqueArray[uniqueArray.length - 1 - i] = temp;
        }
        
        return uniqueArray;
    }
}

