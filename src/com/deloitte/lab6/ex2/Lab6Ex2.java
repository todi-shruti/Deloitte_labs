package com.deloitte.lab6.ex2;

import java.util.*;

public class Lab6Ex2 {
    public static Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : arr) {
            if (charCountMap.containsKey(c)) {
                int count = charCountMap.get(c) + 1;
                charCountMap.put(c, count);
            } 
            else {
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'a', 'b', 'b', 'c', 'd', 'e'};
        Map<Character, Integer> charCountMap = countChars(arr);

        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}