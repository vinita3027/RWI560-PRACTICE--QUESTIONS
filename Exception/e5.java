package com.Exception;

public class e5 {

		public static void main(String[] args) {
			try {
				int a=100 ,b=0,c;
				c=a/b;
				System.out.println(c);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("finally block");
			}
		}
}
