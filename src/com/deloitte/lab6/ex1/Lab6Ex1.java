package com.deloitte.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab6Ex1 {

    public static List<Object> getValues(HashMap<?, ?> map) {
        List<Object> values = new ArrayList<>(map.values());
        Collections.sort((List) values);
        return values;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("Sonu", 30);
        sampleMap.put("Monu", 25);
        sampleMap.put("Tomu", 35);

        List<Object> sortedValues = getValues(sampleMap);
        System.out.println("Sorted values: " + sortedValues);
    }
}
