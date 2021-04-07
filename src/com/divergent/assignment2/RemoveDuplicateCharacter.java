package com.divergent.assignment2;

import java.util.Scanner;
import java.util.*;

public class RemoveDuplicateCharacter {
	/**
	 * 
	 * @param s is an input string
	 * 
	 */
	void removeDuplicate(String s) {
		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++)
			hs.add(s.charAt(i));

		// Printing elements after deleting
		for (Character ch : hs)
			System.out.print(ch);
	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			RemoveDuplicateCharacter rm = new RemoveDuplicateCharacter();
			rm.removeDuplicate(str);

		}
	}
}