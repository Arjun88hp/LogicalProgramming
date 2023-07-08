package com.info;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//Armstrong number
		int num = 153;
		int temp = num;
		int result = 0;
		while (num!=0) {
			int a = num%10;
			result=result+(a*a*a);
			num/=10;
		}
		if(temp==result) {
			System.out.println(temp + "-The given number is Armstrong Number");
		}
		else {
			System.out.println(temp+ "-The given number is not a Armstrong Number");
		}
	}

}
