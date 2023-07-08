package com.info;

public class StringDuplicate {

	public static void main(String[] args) {
		//to remove duplicate 
		String s = "java programm";
		String output="";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(output.indexOf(c)==-1) {
				output=output+c;
			}
		}
		System.out.println(output);
		
	}

}
