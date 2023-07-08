package com.info;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListIntoArray {

	public static void main(String[] args) {
		List<Integer> li2 = new ArrayList<>();
		li2.add(1);
		li2.add(2);
		li2.add(3);
		li2.add(1);
		li2.add(5);
		li2.add(1);
		li2.add(2);
		li2.add(3);
		Integer[] d = li2.toArray(new Integer[0]);
		
		for(Integer x : d) {
			System.out.println(x);
		}
		
		Object[] array = li2.toArray();
		
		
		for(Object x : array) {
			System.out.println(x);
		}
		
		//================================================================//
		
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		
		int[] arr = new int[li.size()];
		
		for(int i =0;i<li.size();i++) {
			Integer value = li.get(i);
			arr[i]=value;
		}
		
		for(int i=0;i<arr.length;i++) {
			int j = arr[i];
			System.out.println(j);
		}
	}

}
