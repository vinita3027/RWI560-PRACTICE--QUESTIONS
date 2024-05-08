package com.Exception;

public class e3 {
		   public static void main(String[]args){
		      System.out.println("Begin");
		   try{
		      System.out.println("inside try");
		      System.out.println(10/0);
		      System.out.println("end of try");
		   }catch(Exception e){
		      System.out.println("inside catch");
		   }
		      System.out.println("main end");
		    }
		}