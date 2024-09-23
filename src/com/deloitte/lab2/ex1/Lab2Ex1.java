package com.deloitte.lab2.ex1;

import java.util.Arrays;

public class Lab2Ex1 {
    public int getSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        Arrays.sort(arr);
        return arr[1];
    }

    public static void main(String[] args) {
        Lab2Ex1 lab = new Lab2Ex1();
        int[] numbers = {7, 2, 5, 1, 9};
        System.out.println("Second smallest: " + lab.getSecondSmallest(numbers));
    }
}
