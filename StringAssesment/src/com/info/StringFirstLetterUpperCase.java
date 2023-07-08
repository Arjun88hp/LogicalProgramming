package com.info;

public class StringFirstLetterUpperCase {

	public static void main(String[] args) {
		String s = "java selenium programm";
		String output = "";
		String[] split = s.split(" ");
		for (String ss : split) {
			for(int i=0;i<ss.length();i++) {
				char c = ss.charAt(i);
				if(i==0) {
					output=output+Character.toUpperCase(c);
				}
				else {
					output = output+c;
				}
				
			}
			output=output+" ";
		}
		System.out.println(output);
		
		
		
		int n = 1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
	}

}
