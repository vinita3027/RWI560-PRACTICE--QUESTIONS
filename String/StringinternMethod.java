package com.String;

public class StringinternMethod {
	public static void main(String[]args) {
		String s1 = new String("PREETI");
		String s2 = s1.intern();
		String s3 = "PREETI";
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	}
}
