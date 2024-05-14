package org.example;

//use lambda expression in jdk8

public class Main {
	public static void main(String[]args) {
		Employee se = () -> "Software Engineer";
		System.out.println(se.getName());
		Employee editor = () -> "Editor";
		System.out.println(editor.getName());
		}
	}
