package com.info;

public class SwapingTwoIntValue {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
//		 int c = a;
//		 a=b;
//		 b=c;
		 a=a+b;
		 b=a-b;
		 a=a-b;
		
		 System.out.println(a);
		 System.out.println(b);
	}

}
