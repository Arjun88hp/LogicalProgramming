package com.info;

public class SwapingStringValue {

	public static void main(String[] args) {
		//swaping string values
		String a = "abc";
		String b = "def";
		a= a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

}
