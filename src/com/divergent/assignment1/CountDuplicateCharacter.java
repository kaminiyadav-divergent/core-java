package com.divergent.assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author Dell
 *
 */
public class CountDuplicateCharacter {
	/**
	 * 
	 * @param str is an an input string
	 */
	public static void countDuplicateCharacter(String str) {
		// create a HashMap containing char as a key and
		// count as a value
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		// Converting these string into new character array
		char[] charArrayMap = str.toCharArray();

		// checking each character of charArrayMap
		for (char c : charArrayMap) {
			if (map.containsKey(c)) {
				// if character is present in map
				// increment it's count by 1
				map.put(c, map.get(c) + 1);
			} else {

				// If character is not present
				// in a map putting this into
				// map with 1 as it's value
				map.put(c, 1);
			}
		}

		// traverse the Hashmap, check if count
		// of character is greater than 1
		// then print the character and its frequency

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			countDuplicateCharacter(str);
		}
	}
}
