package com.pattern;

import java.util.Scanner;


public class p17 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows (odd): ");
	        int rows = sc.nextInt();

	        int midRow = (rows + 1) / 2;

	        for (int i = 1; i <= midRow; i++) {
	            for (int j = 1; j <= midRow - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        for (int i = midRow - 1; i >= 1; i--) {
	            for (int j = 1; j <= midRow - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}
