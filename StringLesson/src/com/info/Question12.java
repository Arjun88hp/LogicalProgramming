package com.info;

public class Question12 {

	public static void main(String[] args) {
		String a = "Welcome to java class";
		String[] split = a.split(" ");
		System.out.println(split);
		for (String b : split) {
			System.out.println(b);
		}
		String[] split1 = a.split("l");
		System.out.println(split1);
		for (String c : split1) {
			System.out.println(c);
		}
	}

}
