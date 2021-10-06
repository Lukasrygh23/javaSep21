package com.qa.demo;

public class Parameters {
	public static void helloStudent(String name) {
		System.out.println("Hello " + name);
	}

	//Task - Create methods that take in the following method and prints them out w/ context
	// - Int
	// - String
	// - float
	// - boolean, float
	// - float, String
	// - Char, boolean, Int
	
	public static void printStrings(String string) {
		System.out.println ("This is a " + string);
	}
	
	public static void printInt(int integer) {
		System.out.println("Your number is " + integer);
	}
	
	public static void printFloat(float floatyboi) {
		System.out.println("FLoats have decimals, like " + floatyboi);	
	}
	
	public static void printBoolFloat(boolean bool, float engineer) {
		System.out.println("You can mix types! This float " + engineer + " is " + bool);
	}
	
	public static void printFloatString(float engineer, String texticle) {
		System.out.println("I don't know what I'm doing with variable names any more, but " + texticle + " is a good string and I called the float " + engineer + " after a halo reference so I don't care.");
	}
	
	public static void printCharBoolInt(char character, boolean bool, int NUMBERS) {
		System.out.println("I give up. Character: " + character + ". Bool: " + bool + ". Integer: " + NUMBERS);
	}
	
}
