package com.info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give n : ");
        int n = Integer.parseInt(scan.nextLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(scan.nextLine()));
        }

        findEvenNumberAndSort(list);
    }

    public static void findEvenNumberAndSort(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : list) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        Collections.sort(evenNumbers);

        for (Integer number : evenNumbers) {
            System.out.print(number + " ");
        }
    	}
    }
