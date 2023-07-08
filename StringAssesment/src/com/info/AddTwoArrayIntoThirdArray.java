package com.info;

public class AddTwoArrayIntoThirdArray {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6,7};
		int[] c = new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
//		for (int i : c) {
//			System.out.println(i);
//		}
//		System.out.println(c);
		
		for(int i =0 ;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("********************************");
		
		//alternate method
		for(int i=0;i<a.length;i++) {
			int value = a[i];
			c[i]=value;
		}
		
		for(int i=0;i<b.length;i++) {
			int value = b[i];
			c[i+a.length]=value;
		}
		
		for(int value: c) {
			System.out.println(value);
		}
		
	}

}
