package com.testersconnect.guess;

import java.util.Random;
import java.util.Scanner;

public class GMain {

	static PlayerNames pn = new PlayerNames();
	public static String REGEX = "[^\\s]";
	public static int score = 10;
	public static String playerName;
	public static String userInput;

	public static String getPlayerName() {
		Random rand = new Random();
		int r = rand.nextInt(5);
		playerName = pn.names[r];

		return playerName;
	}

	public static String hidePlayerName(String pName) {
		String hName = pName.replaceAll("[A-Z]", ".");
		return hName;
	}

	public static String getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("Enter a Character:");
		return sc.nextLine().toUpperCase();

	}

	public static String myReplace(String pName, String userInput) {
		String[] arr=REGEX.split("]");
		REGEX=arr[0]+ "^" + userInput + "]";
		String matchingResult = pName.replaceAll(REGEX, ".");

		return matchingResult;
	}

	public static int updatePoints(String playerName, String userInput) {

		boolean r = playerName.contains(userInput);
		if (r == false) {
			score = score - 2;
		}

		return score;
	}

	public static void main(String[] args) {
		
		String mString;
		//Get the Random Player
		String pName=getPlayerName();
		
		//Display the player name in hidden characters
		String hName=hidePlayerName(pName);
		System.out.println("Guess this Player : "+hName);
		
		
		do {
		//Get input from user
		String userInput=getUserInput();
		
		//Replace the user input with matching characters
			//else no change
		mString=myReplace(pName, userInput);
		System.out.println(mString);
		
		//Update the points
		score=updatePoints(pName, userInput);
		System.out.println("Your Score is now: "+score);
		}while(mString.contains("."));

		
		System.out.println("Your Final Score is "+score);
		
	}

}
