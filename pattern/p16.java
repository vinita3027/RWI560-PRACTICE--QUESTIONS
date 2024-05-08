package com.pattern;

import java.util.Scanner;

public class p16 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int rows = sc.nextInt();

	        int number = 1;
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(number + " ");
	                number++;
	            }
	            System.out.println();
	        }
	    }
	}
