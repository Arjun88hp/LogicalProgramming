package com.info;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of the n:");
		int n = s.nextInt();
		int i, j, count;
		for (i = 1; i <= n; i++) {
			count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.println(i);

			}
		}

	}
}
