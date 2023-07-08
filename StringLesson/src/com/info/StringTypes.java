package com.info;

public class StringTypes {

	public static void main(String[] args) {
		// Literal String (store duplicate value to the same memory address)
		System.out.println("****Literal String:");
		String a = "Jack";
		String b = "Max";
		String c = "Jack";
		System.out.println(a);
		int identityHashCode = System.identityHashCode(a);
		System.out.println(identityHashCode);

		System.out.println(b);
		System.out.println(System.identityHashCode(b));

		System.out.println(c);
		int identityHashCode2 = System.identityHashCode(c);
		System.out.println(identityHashCode2);

		// Non literal String (store duplicate value to the new memory address)
		System.out.println("****Non Literal String:");
		String d = new String("Java");
		String e = new String("Java Maven");
		String f = new String("Java");
		System.out.println(d + "\n" + System.identityHashCode(d));
		int identityHashCode3 = System.identityHashCode(e);
		System.out.println(e + "\n" + identityHashCode3);
		System.out.println(f + "\n" + System.identityHashCode(f));

		// Immutable not-changeable (use concat String method)
		System.out.println("****Immutable non-changeable");
		String x = "Jack";
		String y = "Sparrow";
		System.out.println(x + "\n" + System.identityHashCode(x));
		int identityHashCode4 = System.identityHashCode(y);
		System.out.println(y + "\n" + identityHashCode4);
		String concat = x.concat(y);
		System.out.println(concat + "\n" + System.identityHashCode(concat));

		// Mutable changeable
		System.out.println("*****Mutable Changeable:");
		StringBuffer z = new StringBuffer("Java");
		StringBuffer z1 = new StringBuffer("Maven");
		System.out.println(z + "\n" + System.identityHashCode(z));
		System.out.println(z1 + "\n" + System.identityHashCode(z1));

		StringBuffer append = z.append(z1);
		System.out.println(append + "\n" + System.identityHashCode(z));

	}

}
