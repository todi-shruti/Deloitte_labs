package com.deloitte.lab1.ex8;

public class Lab1Ex8 {
	public static void main(String[] args) {
		int[] testNumbers = {1, 2, 3, 4, 5, 8, 16, 20};
        for (int number : testNumbers) {
            System.out.println(number + (checkNumber(number) ? " is a power of 2." : " is not a power of 2."));
        }
    }

    public static boolean checkNumber(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

