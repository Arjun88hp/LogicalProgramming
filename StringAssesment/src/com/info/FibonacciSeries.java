package com.info;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Fibonacci series
		int a = 0;
		int b = 1;
		int count = 10;
		for(int i=0;i<count;i++) {
			int c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
