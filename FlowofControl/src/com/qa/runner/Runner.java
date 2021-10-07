package com.qa.runner;

import com.qa.dice.DiceRoller;

public class Runner {
	public static void main(String[] args) {
		int a = DiceRoller.fourdsix();
		System.out.println(a);
		int b = DiceRoller.threedsixtwodeight();
		System.out.println(b);
		System.out.println(DiceRoller.properLog(5, 6));
	}
}
