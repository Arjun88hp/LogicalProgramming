package com.info;

public class StringClass {

	public static void main(String[] args) {
		String a = "Johny Depp";
		char charAt = a.charAt(2);
		System.out.println(charAt);
		int length = a.length();
		System.out.println(length);
		int indexOf = a.indexOf('n');
		System.out.println(indexOf);
		int lastIndexOf = a.lastIndexOf('p');
		System.out.println(lastIndexOf);
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase);
		boolean contains = a.contains("johny");
		System.out.println(contains);
		boolean empty = a.isEmpty();
		System.out.println(empty);
		boolean startsWith = a.startsWith("Jo");
		System.out.println(startsWith);
		boolean endsWith = a.endsWith("ny");
		System.out.println(endsWith);
		String b = " JoHnY dePP";
		boolean equals = a.equals(b);
		System.out.println(equals);
		boolean equalsIgnoreCase = a.equalsIgnoreCase(b);
		System.out.println(equalsIgnoreCase);
		String replace = b.replace('H', 'h');
		System.out.println(replace);
		String replaceAll = b.replaceAll("dePP", "Depp");
		System.out.println(replaceAll);
		String trim = b.trim();
		System.out.println(trim);
		String subString = a.substring(3);
		System.out.println(subString);
		int compareTo = a.compareTo(b);
		System.out.println(compareTo);

	}

}
