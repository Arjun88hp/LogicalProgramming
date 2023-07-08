package com.info;

public class Question9 {

	public static void main(String[] args) {
		String a = "welcome to java class";
		boolean startsWith = a.startsWith("welcome");
		System.out.println(startsWith + "\n");

		String b = "Hai i am nisha";
		boolean startsWith1 = b.startsWith("welcome");
		System.out.println(startsWith1 + "\n");

		String c = "welcome to java class";
		boolean endsWith = c.endsWith("class");
		System.out.println(endsWith + "\n");

		String d = "welcome to java class";
		boolean endsWith1 = d.endsWith("java");
		System.out.println(endsWith1 + "\n");

		String e = "welcome to java class";
		boolean empty = e.isEmpty();
		System.out.println(empty + "\n");

		String f = " ";
		boolean empty1 = f.isEmpty();
		System.out.println(empty1);
	}

}
