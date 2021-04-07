package com.divergent.assignment1;

import java.util.Scanner;

public class CheckVowelConsonant {
	/**
	 * 
	 * @param str
	 */
	// Function to print number of vowels and consonant
	static void getCount(String str) {
		int consonant = 0, vowel = 0;
		
		//It will convert string to lower case letter
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowel++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				consonant++;
			}

		}
		System.out.println("Number of vowels " + vowel);
		System.out.println("number of consonant " + consonant);
	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			getCount(str);
		}

	}
}
