package com.info;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String name1 = s.nextLine();
		System.out.println(name1);
		System.out.println("Enter the second name:");
		String name2 = s.nextLine();
		System.out.println(name2);
		String a = name1;
		String b = name2;
		int compareTo = a.compareTo(b);
		System.out.println(compareTo);
		
		System.out.println("***************");
		
		System.out.println("Enter the first name:");
		String name3 = s.nextLine();
		System.out.println(name3);
		System.out.println("Enter the second name:");
		String name4 = s.nextLine();
		System.out.println(name4);
		String c = name3;
		String d = name4;
		int compareTo1 = c.compareTo(d);
		System.out.println(compareTo1);

	}

}
