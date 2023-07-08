package com.info;

public class Question4 {

	public static void main(String[] args) {
		String a = "Java";
		String b = "Java";
		boolean equals = a.equals(b);
		System.out.println(equals);

		String c = "Java";
		String d = "java";
		boolean equals1 = c.equals(d);
		System.out.println(equals1);

		String e = "Green Technology";
		String f = "GreenTechnology";
		boolean equals2 = e.equals(f);
		System.out.println(equals2);

		String g = "Java";
		String h = "java";
		boolean equalsIgnoreCase = g.equalsIgnoreCase(h);
		System.out.println(equalsIgnoreCase);

		String i = "Nisha";
		String j = "nisha";
		boolean equalsIgnoreCase1 = i.equalsIgnoreCase(j);
		System.out.println(equalsIgnoreCase1);

	}

}
