package com.edigest.defaultMethods;

//static Method

interface Drawable{
	static void SayHello() {
		System.out.println("Hello!");
	}
}
public class MyClass2 implements Drawable{
    private static void sayHello() {
    	System.out.println("Hello there !");
    }
}
