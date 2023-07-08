package com.info;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// check anagram
		String a = "Race";
		String b = "Care";

		a = a.toLowerCase();
		b = b.toLowerCase();

		if (a.length() == b.length()) {
			char[] ip1 = a.toCharArray();
			char[] ip2 = b.toCharArray();
			Arrays.sort(ip1);
			Arrays.sort(ip2);
			boolean equals = Arrays.equals(ip1, ip2);
			if (equals) {
				System.out.println("Given String are Anagram");
			} else {
				System.out.println("Given String are not Anagram");
			}
		} else {
			System.out.println("Length of the strings are different so we don't check anagram or not");
		}

	}
	

}
