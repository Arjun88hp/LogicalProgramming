package com.info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		// Using String Buffer method
		String a = "Java Selenium";
		StringBuffer buffer = new StringBuffer();
		buffer.append(a);
		StringBuffer reverse = buffer.reverse();
		System.out.println(reverse);

		System.out.println("****************************");

		// using String Builder:
		String input = "Welcome";
		StringBuilder builder = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			char output = input.charAt(i);
			builder.append(output);
		}
		System.out.println(builder);

		System.out.println("****************************");

		// using String CharacterArray
		String b = "JavaScript";
		String reversed = "";
		char[] charArray = b.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			reversed = reversed + b.charAt(i);
		}
		System.out.println(reversed);

		System.out.println("****************************");

		// using collection listIterator

		String c = "Java Maven";
		char[] charArray2 = c.toCharArray();
		List<Character> li = new ArrayList<Character>();
		for (Character character : charArray2) {
			li.add(character);
		}
		Collections.reverse(li);
		ListIterator iterator = li.listIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
	}

}
