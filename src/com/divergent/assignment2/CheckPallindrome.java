package com.divergent.assignment2;

import java.util.Scanner;

public class CheckPallindrome {
	/**
	 * 
	 * @param str
	 * @return boolean
	 */
	static boolean isPalindrome(String str) {

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters to compare
		while (i <= j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		// If given string is a palindrome
		return true;
	}

	// Main method
	public static void main(String[] args) {
		System.out.println("Enter the String ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();

			if (isPalindrome(str))
				System.out.print("Yes");
			else
				System.out.print("No");
		}
	}
}
