package com.info;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringOccurenceOfWord {

	public static void main(String[] args) {
		// occurence of each character
		String s = "java programm";
		Map<Character, Integer> m = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (m.containsKey(c)) {
				Integer value = m.get(c);
				m.put(c, value + 1);
			} else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		String output="";
		int maxValue=0;
		char key1=' ';
		for (Entry<Character, Integer> entry : entrySet) {
			Integer value = entry.getValue();
			if(value>1) {
				Character key = entry.getKey();
				output=output+key;
			}
			if(maxValue<value) {
				maxValue=value;
				key1=entry.getKey();
			}
		}
		System.out.println(output);
		System.out.println(key1+" "+maxValue);
	}

}
