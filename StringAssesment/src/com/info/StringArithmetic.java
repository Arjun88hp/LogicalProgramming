package com.info;

public class StringArithmetic {

	public static void main(String[] args) {
		// arithmetic calculations
		String s = "6+5-2*5/3";
		char[] charArray = s.toCharArray();
		char c = charArray[0];
		int numericValue = Character.getNumericValue(c);
		for (int i = 0; i < charArray.length; i++) {
			char d = charArray[i];
			switch (d) {
			case '+':
				int sum = Character.getNumericValue(charArray[i + 1]);
				numericValue = numericValue + sum;
				break;
			case '-':
				int dif = Character.getNumericValue(charArray[i + 1]);
				numericValue = numericValue - dif;
				break;
			case '*':
				int mul = Character.getNumericValue(charArray[i + 1]);
				numericValue = numericValue * mul;
				break;
			case '/':
				int div = Character.getNumericValue(charArray[i + 1]);
				numericValue = numericValue / div;
				break;

			default:
				break;
			}
		}
		System.out.println(numericValue);
	}

}
