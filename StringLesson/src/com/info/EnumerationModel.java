package com.info;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationModel {

	public static void main(String[] args) {
		Vector<Integer> li = new Vector<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		System.out.println(li);
		Enumeration<Integer> elements = li.elements();
		while (elements.hasMoreElements()) {
			Integer integer = (Integer) elements.nextElement();
			System.out.println(integer);
		}

	}

}
