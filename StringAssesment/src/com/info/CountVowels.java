package com.info;

public class CountVowels {

	public static void main(String[] args) {
		//count vowels
		String s = "java programm";
		int vcount=0;
		String vowels="";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vcount++;
				vowels=vowels+c;
			}
		}
		System.out.println(vcount);
		System.out.println(vowels);
	}

}
