package com.info;

public class StringWordReverse {

	public static void main(String[] args) {
		String s = "Java Selenium";
		// o/p= avaJ muineleS

		String output = "";
		String[] split = s.split(" ");
		for (String ss : split) {
			for (int i = ss.length() - 1; i >= 0; i--) {
				char c = ss.charAt(i);
				output = output + c;
			}
			output += " ";
		}
		System.out.println(output);
	}

}
