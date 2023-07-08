package com.info;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Java Selenium";
		String output = "";
		System.out.println(s.length());
		for (int i = s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			output = output + c;
		}
		System.out.println(output);
	}

}
