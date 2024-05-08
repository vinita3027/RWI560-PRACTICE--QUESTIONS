package com.String;

public class equalIgnoranceMethod {
	 public static void main(String[]args) {
	        String a = new String("PREETI");
	        String b = new String("PREETI");
	        String c = new String ("preeti");
	        
	        System.out.println(a.equalsIgnoreCase(b));
	        System.out.println(a.equalsIgnoreCase(c));
	}
	}

