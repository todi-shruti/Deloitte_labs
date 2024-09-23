package com.deloitte.lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab6Ex5 {

    public static int getSecondSmallest(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        Collections.sort(list);
        if (list.size() < 2) {
            throw new RuntimeException("Array must have at least two elements");
        }
        return list.get(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int secondSmallest = getSecondSmallest(array);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}