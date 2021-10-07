package com.qa.dice;

import java.util.Random;

public class DiceRoller {

	public static int getRandNum(int num) {
		return new Random().nextInt(num);
	}
	
	public static int getRandDice(int dicemax) {
		return (getRandNum(dicemax) + 1);
	}
	
	public static Integer fourdsix() {
		int dice1 = getRandDice(6);
		int dice2 = getRandDice(6);
		int dice3 = getRandDice(6);
		int dice4 = getRandDice(6);
		
		return dice1+dice2+dice3+dice4;
		

	}
	public static Integer threedsix() {
		int dice1 = getRandDice(6);
		int dice2 = getRandDice(6);
		int dice3 = getRandDice(6);
		return dice1+dice2+dice3;
	}
	
	public static Integer twodeight() {
		int dice1 = getRandDice(8);
		int dice2 = getRandDice(8);
		return dice1+dice2;
	}
	
	public static Integer threedsixtwodeight() {
		
		return twototals(threedsix(), twodeight());
	}
	
	public static Integer twototals(int total1, int total2) {
		return total1+total2;
	}
	
	public static Integer twothrueight() {
		int d2 = getRandDice(2);
		int d3 = getRandDice(3);
		int d4 = getRandDice(4);
		int d5 = getRandDice(5);
		int d6 = getRandDice(6);
		int d8 = getRandDice(8);
		
		return d2+d3+d4+d5+d6+d8;
	}
	
	public static int recursiveRoller(int diceNumber, int diceSize) {
		int result = getRandDice(diceSize);
		System.out.println("Rolled a " + result);
		if (diceNumber == 1) return getRandDice(diceSize);
		else {

			return recursiveRoller(diceNumber-1, diceSize)+getRandDice(diceSize); 
		}

	}
	
	public static String properLog(int diceNumber, int diceSize) {
		String dice = "Rolling " + diceNumber + "d" + diceSize;
		System.out.println(dice);
		int result = recursiveRoller(diceNumber, diceSize);
		String answer = "Result of rolling was:" + result;
		return answer;
		
	}
	
	public static int explodingDice(int diceSize) {
		int diceroll = getRandDice(diceSize);
		if (diceroll == 1) return diceroll;
		else if (diceroll == 6) return diceroll+explodingDice(diceSize);
		else return diceroll;
	}
	
}
