package com.info;

public class StringReverseOccurence {

	public static void main(String[] args) {
		String s = "i love India";
		//o/p="a idnI evoli"
		
		char[] ip = s.toCharArray();
		char [] op = new char[ip.length];
		
		for (int i = 0; i < ip.length; i++) {
			
			if(ip[i]==' ') {
				op[i]=' ';
			}	
		}
		int j = ip.length-1;
		for (int i = 0; i < ip.length; i++) {
			if(ip[i]!=' ') {
				if(op[j]==' ') {
					j--;
				}
				op[j]=ip[i];
				j--;
			}
		}
		String result = String.valueOf(op);
		System.out.println(result);
	}

}
