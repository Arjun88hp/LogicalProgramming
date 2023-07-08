package com.info;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateList {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(1);
		li.add(5);
		li.add(1);
		li.add(2);
		li.add(3);
		
		List<Integer> withoutDupliate = new ArrayList<>();
		
		for(Integer value : li) {
			if(!withoutDupliate.contains(value)) {
				withoutDupliate.add(value);
			}
		}
		System.out.println(withoutDupliate);
	}

}
