package com.info;

public class ArrayAscendingDecending {

	public static void main(String[] args) {
		//array ascending and decending order
		int[] a = {2,8,6,4,1,5,7};
		for(int i = 0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {//decending order
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int[] b = {11,13,15,18,19};
		int[] output = new int[b[b.length-1]];
		for(int i=0;i<b.length;i++) {
			output[b[1]]=1;
		}
		for(int i= b[0];i<b[b.length-1]-1;i++) {
			if(output[i]==0) {
				System.out.print(i+" ");
			
			}
		}
		
	}

}
