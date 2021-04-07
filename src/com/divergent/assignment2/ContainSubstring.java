package com.divergent.assignment2;

import java.util.Scanner;

public class ContainSubstring {
	static int isSubstring(String s1, String s2) {
		int A = s1.length();
		int B = s2.length();

		for (int i = 0; i <= B - A; i++) {
			int j;
			for (j = 0; j < A; j++)
				if (s2.charAt(i + j) != s1.charAt(j))
					break;
			if (j == A)
				return i;
		}
		return -1;

	}

	public static void main(String[] args) {
		System.out.println("Enter the substring which you want to find ");
		try (Scanner sc = new Scanner(System.in)) {
			String str1 = sc.nextLine();
			System.out.println("Enter the String");
			String str2 = sc.nextLine();
			int result = isSubstring(str1, str2);
			if (result == -1)
				System.out.println("Not present");
			else {
				System.out.println("Present at Index" + result);
			}

		}
	}
}