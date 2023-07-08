package com.info;

import java.util.HashSet;

public class DuplicateInArray {

	public static void main(String[] args) {
		//find duplicate in array
		int [] a = {1,2,3,5,1,2,6};
		boolean flag =false;
		for(int i =0 ;i<a.length;i++) {
			for(int j=i+1 ; j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate Element founds :"+a[i]);
					flag = true;
					break;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("No duplicate Element found");
		}
		
		HashSet<Integer> in = new HashSet<>();
		boolean flag1=false;
		for(int aa:a) {
			if(in.add(aa)==false) {
				System.out.println("Found Duplicate Elements :"+aa);
				flag1=true;
				break;
			}
		}
		
		if(flag1==false) {
			System.out.println("No Duplicate");
		}
	}

}
