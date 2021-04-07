package com.divergent.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {
	/**
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean checkAnagrams(char[] str1, char[] str2) {
		// Get length of both strings
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return false;

		// Sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);

		// Compare sorted strings
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;
		return true;
	}

	/**
	 * 
	 * @param srgs
	 */

	public static void main(String[] srgs) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the string 1st: ");
			String s = sc.nextLine();

			// Creating an array of string length
			char[] str1 = new char[s.length()];
			System.out.println("Enter the string 2st: ");
			String s1 = sc.nextLine();

			// Creating an array of string length
			char[] str2 = new char[s1.length()];

			// Function call
			if (checkAnagrams(str1, str2))
				System.out.println("The two strings are" + " anagram of each other");
			else
				System.out.println("The two strings are not" + " anagram of each other");
		}
	}
}
