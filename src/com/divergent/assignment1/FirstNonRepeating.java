package com.divergent.assignment1;

import java.util.*;
import java.util.Scanner;

public class FirstNonRepeating {
	/**
	 * 
	 * @param str
	 */
	public static void firstNonRepeating(String str) {

		// Length of a string
		int len = str.length();

		// Using HashMap
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Character ch;

		// Traverse a string using Hash table for character and it's count.
		// If there is no value store to a character then it set to 1/
		// else we increment the value by 1

		for (int i = 0; i < len; i++) {
			ch = str.charAt(i);

			// If character is already exists then increment is count by 1
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {

				// If no value is stored for a character then it set to 1
				map.put(ch, 1);
			}
		}
		boolean flag = false;
		char c = ' ';
		for (int j = 0; j < len; j++) {
			ch = str.charAt(j);

			if (map.get(ch) == 1) {
				c = ch;
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("First Non Reapeated Character is : " + c);
		} else {
			System.out.println(" Reapeated Character not found : ");
		}

	}

	/**
	 * 
	 * @param args the command line argument
	 */
	public static void main(String[] args) {
		System.out.println("Enter the string : ");

		// Take a input
		try (Scanner sc = new Scanner(System.in)) {

			// Assign the value into str
			String str = sc.nextLine();

			firstNonRepeating(str);

		}
	}
}
