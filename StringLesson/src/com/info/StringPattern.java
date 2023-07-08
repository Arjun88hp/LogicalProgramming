package com.info;

public class StringPattern {

	public static void main(String[] args) {
		String a = "Java";
		int i, j, l;
		l = a.length();
		for (i = 1; i <= l; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(a.charAt(j) + " ");

			}
			System.out.println();
		}

	}

}
