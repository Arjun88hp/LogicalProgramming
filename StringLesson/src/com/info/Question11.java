package com.info;

public class Question11 {

	public static void main(String[] args) {
		System.out.println("****Literal String:");
		String a = "Nisha";
		String b = "Nisha";
		System.out.println(a + "\n" + System.identityHashCode(a));
		System.out.println(b + "\n" + System.identityHashCode(b));

		System.out.println("****Non Literal String:");
		String c = new String("Nisha");
		String d = new String("Nisha");
		System.out.println(c + "\n" + System.identityHashCode(c));
		System.out.println(d + "\n" + System.identityHashCode(d));

		System.out.println("****Three Non Literal String:");
		String e = new String("Nisha");
		String f = new String("Rengan");
		String g = new String("NishaRengan");
		System.out.println(e + "\n" + System.identityHashCode(e));
		System.out.println(f + "\n" + System.identityHashCode(f));
		System.out.println(g + "\n" + System.identityHashCode(g));

		System.out.println("****Three Literal String:");

		String x = "Nisha";
		String y = "Rengan";
		String z = "NishaRengan";
		System.out.println(x + "\n" + System.identityHashCode(x));
		System.out.println(y + "\n" + System.identityHashCode(y));
		System.out.println(z + "\n" + System.identityHashCode(z));

	}

}
