package com.info;

import java.util.Arrays;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		// remove duplicates from array
		int[] arr = { 1,2,2,4,3,6,5,5,6,7};
		int[] arr2 = new int[arr.length];
		int j=0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				arr2[j++]=arr[i];
			}	  
		}
		arr2[j++]=arr[arr.length-1];
		for (int k = 0; k < arr2.length; k++) {
			if(arr2[k]==0) {
				break;
			}
			System.out.print(arr2[k]+ " ");
		}
		
	} 
}
