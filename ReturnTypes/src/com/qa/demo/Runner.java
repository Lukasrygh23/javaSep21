package com.qa.demo;

public class Runner {

	public static void main(String[] args) {

		helloWorld();
		System.out.println(returnString());
		System.out.println(returnInt());
		System.out.println(returnBool());
		System.out.println(returnChar());
		System.out.println(returnFloat());
		System.out.println(returnNull());
		System.out.println(luckySeven());
	}
	
	public static void helloWorld() {
		System.out.println("Hello World!");
	}
	
	public static String returnString() {
		return "BLAH";
	}
	
	public static int returnInt() {
		return 25;
	}
	
	public static Boolean returnBool() {
		return true;
	}
	
	public static Character returnChar() {
		return 'a';
	}
	
	public static float returnFloat() {
		return 5.5f;
	}
	
	public static Object returnNull() {
		return null;
	}
	
	public static int luckySeven() {
		String f = "7";
		return Integer.parseInt(f);
	}
}
