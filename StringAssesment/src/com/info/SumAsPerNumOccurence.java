package com.info;

public class SumAsPerNumOccurence {

	public static void main(String[] args) {
		//sum as per number occurence
		String s = "jav3kmx67dsn39jdn9nd2";
		//3+67+39+9+2=120
		String temp="0";
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isDigit(c)) {
				temp= temp+c;
			}
			else {
				int parseInt = Integer.parseInt(temp);
				sum=sum+parseInt;
				temp="0";
			}
		}
		int parseInt = Integer.parseInt(temp);
		sum=sum+parseInt;
		System.out.println(sum);
	}

}
