package com.divergent.assignment1;

import java.util.Scanner;

public class CheckDigitInString {

	// Function to check if a string
	// contains only digits
	/**
	 * 
	 * @param str
	 * @return boolean
	 */
	static boolean onlyDigit(String str) {
		int count = 0;

		// Check the string from start to end
		for (int i = 0; i < str.length(); i++) {

			// Check if characters is
			// digits from 0 to 9 then
			// returns true else false
			if (str.charAt(i) < '0' || str.charAt(i) > '9')
				return false;
			count++;
		}
		System.out.println("total number of digits : " + count);
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			System.out.println("Entered String is : " + str);
			System.out.println(onlyDigit(str));
		}
	}
}
