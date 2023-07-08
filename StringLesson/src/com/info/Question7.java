package com.info;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		String a = "Welcome to Java Class";
		String replace = a.replace("Java", "SQL");
		System.out.println(replace);

		String b = "Greens Adayar";
		String replace1 = b.replace("Adayar", "OMR");
		System.out.println(replace1);

		String c = "Welcome to java class";
		String replace2 = c.replace(" ", "#");
		System.out.println(replace2);

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the email id:");
		String email = s.nextLine();
		System.out.println(email);
		boolean contains = email.contains("gmail");
		System.out.println(contains);
		if (contains = true) {
			String replace3 = email.replace("gmail", "yahoo");
			System.out.println(replace3);
		} else {
			System.out.println(contains);
		}

		System.out.println("Enter the address:");
		String address = s.nextLine();
		System.out.println(address);
		boolean contains1 = address.contains("pincode-626101");
		System.out.println(contains1);
		if (contains1 = true) {
			String replace4 = address.replace("pincode-626101", " ");
			System.out.println(replace4);
		} else {
			System.out.println(contains1);
		}
	}

}
