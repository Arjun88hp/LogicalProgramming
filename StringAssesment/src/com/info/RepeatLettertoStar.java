package com.info;

public class RepeatLettertoStar {

	public static void main(String[] args) {
		String s ="Seleneum";
		//S*l**n***um
		String output="";
		int count=0;
		for(int i = 0; i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='e') {
				count++;
				for(int j=0;j<count;j++) {
					output=output+'*';
				}
			}
			else {
				output=output+c;
			}
		}
		System.out.println(output);
	}
}