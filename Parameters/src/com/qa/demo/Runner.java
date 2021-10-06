package com.qa.demo;

public class Runner {
	//creating a method where we pass in a name
	public static void main(String[] args) {
		String name = "Dave";
	
		Parameters.helloStudent(name);
		
		Parameters.printStrings("String about farting, pfrrrrt");
		Parameters.printInt(42);
		Parameters.printFloat(25.524f);
		Parameters.printBoolFloat(true, 55.55f);
		Parameters.printFloatString(24.23f, "texticle");
		Parameters.printCharBoolInt('a', false, 525);
		
	}
	

}
