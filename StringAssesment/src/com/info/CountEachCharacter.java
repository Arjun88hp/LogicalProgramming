package com.info;

public class CountEachCharacter {

	public static void main(String[] args) {
		String s = "Ja3v@a4 Pro3g!a8ra6m Tr3a^ni5ng";
		String upper ="";
		int ucount=0;
		String lower="";
		int lcount=0;
		int number=0;
		int result=0;
		int special=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				ucount++;
				upper=upper+c;
			}
			else if(Character.isLowerCase(c)) {
				lcount++;
				lower=lower+c;
			}
			else if(Character.isDigit(c)) {
				int numericValue = Character.getNumericValue(c);
				result=result+numericValue;
				number++;
			}
			else{
				special++;
			}
		}
		System.out.println(ucount);
		System.out.println(upper);
		System.out.println(lcount);
		System.out.println(lower);
		System.out.println(number);
		System.out.println(result);
		System.out.println(special);
	}

}
