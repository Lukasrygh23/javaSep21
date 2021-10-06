package com.qa.demo;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Yo WTF");
		helloWorld();
		System.out.println(returnString());
	}
	
	public static void helloWorld() {
		System.out.println("Hello World!");
	}
	
	public static String returnString() {
		return "BLAH";
	}
	
}
