package com.info;

public class StringClass2 {

	public static void main(String[] args) {
		String a = "Tom Cruise";
		char charAt = a.charAt(2);
		System.out.println(charAt);
		int length = a.length();
		System.out.println(length);
		int indexOf = a.indexOf('r');
		System.out.println(indexOf);
		int lastIndexOf = a.lastIndexOf('e');
		System.out.println(lastIndexOf);
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase);
		boolean contains = a.contains("tom");
		System.out.println(contains);
		boolean empty = a.isEmpty();
		System.out.println(empty);
		boolean startsWith = a.startsWith("to");
		System.out.println(startsWith);
		boolean endsWith = a.endsWith("se");
		System.out.println(endsWith);
		String b = " EthAn huNt";
		boolean equals = a.equals(b);
		System.out.println(equals);
		boolean equalsIgnoreCase = a.equalsIgnoreCase(b);
		System.out.println(equalsIgnoreCase);
		String replace = b.replace('A', 'a');
		System.out.println(replace);
		String replaceAll = b.replaceAll("huNt", "Hunt");
		System.out.println(replaceAll);
		String trim = b.trim();
		System.out.println(trim);
		String subString = a.substring(3);
		System.out.println(subString);
		int compareTo = a.compareTo(b);
		System.out.println(compareTo);

	}

}
