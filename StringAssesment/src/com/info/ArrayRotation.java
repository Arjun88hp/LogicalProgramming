package com.info;

public class ArrayRotation {

	public static void main(String[] args) {
		//array rotation
		
		int[] a = { 1, 2, 3, 4, 5, 6 };
		
		int noOfRotation = 4;
		
		for(int i=0; i<noOfRotation;i++) {
			int j=0;
			int first = a[0];
			
			for(j=0;j<a.length -1;j++) {
				a[j] =a[j+1];
			}
			a[j] =first;
		}

		for(int i=0 ;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
