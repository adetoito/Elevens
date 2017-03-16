/**
 * This is a class that tests the Deck class.
 */
package com.company;

public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String [] ranks1 = {"A", "4", "4"};
		String [] suits1 = {"Clubs", "Diamonds", "Hearts"};
		int [] points1 = {11, 4, 4};

		String [] ranks3 = {"9", "5", "2", "7"};
		String [] suits3 = {"Spades", "Hearts", "Clubs"};
		int [] points3 = {9, 5, 2, 7};

		Deck deck1 = new Deck (ranks1, suits1, points1);
		Deck deck2 = new Deck (ranks1, suits1, points1);
		Deck deck3 = new Deck (ranks3, suits3, points3);
	}
}
