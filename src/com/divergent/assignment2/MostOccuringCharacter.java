package com.divergent.assignment2;

import java.util.Scanner;

public class MostOccuringCharacter {

	static final int ASCII_SIZE = 256;

	static char maxOccuringChar(String str) {
		// Create array to keep the count of individual
		
		
		int count[] = new int[ASCII_SIZE];

		// Construct character count array from the input
		// string.
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		int max = -1; // Initialize max count
		char result = ' '; // Initialize result

		// Traversing through the string
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			System.out.println("Maximum occuring character is : " +maxOccuringChar(str));
		}
	}
}
