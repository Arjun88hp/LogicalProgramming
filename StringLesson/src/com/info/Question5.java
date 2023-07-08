package com.info;

public class Question5 {

	public static void main(String[] args) {
		String a = "velmurugank451@gmail.com";
		boolean contains = a.contains("@");
		if (contains == true) {
			System.out.println("Valid Email Id");
		} else {
			System.out.println("Invalid Email Id");
		}
		System.out.println("***********************");

		String b = "5-35-2a,venkatesh nivas,Aruppukottai";
		boolean contains1 = b.contains("Pincode-615006");
		if (contains1 == true) {
			System.out.println("Valid address");
		} else {
			System.out.println("Invalid address");
		}
		System.out.println("***********************");

		String c = "Nishakerala24@gmail.com";
		boolean contains2 = c.contains("@");
		System.out.println(contains2);

		System.out.println("***********************");

		String d = "9874561230";
		boolean contains3 = d.contains("a");
		System.out.println(contains3);

	}

}
