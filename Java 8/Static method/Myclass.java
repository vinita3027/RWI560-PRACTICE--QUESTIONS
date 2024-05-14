package com.edigest.defaultMethods;

interface A{
	default void sayHello() {
		System.out.println("A says Hello");
	}
}

interface B{
	default void sayHello() {
		System.out.println("B says Hello");
	}
	
}

public class Myclass implements A,B  {
	public static void main (String[]args) {
		Myclass myClass = new Myclass();
		myClass.sayHello();
	}
	public void sayHello() {
	// B.super.sayHello();
   A.super.sayHello();
}
}
