package com.company;

/**
 * This class provides a convenient way to test shuffling methods.
 */
import java.util.*;

public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 1;


    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values) {
        int length = values.length;
        int [] deck1;
        int [] deck2 = new int [length / 2];
        if (length % 2 == 0) {
            deck1 = new int [length / 2];
        } else {
            deck1 = new int [length / 2 + 1];
        }
        for (int i = 0; i < deck1.length; i++) {
            deck1[i] = values [2 * i];
        }
        for (int i = 0; i < deck2.length; i++) {
            deck2[i] = values [2 * i + 1];
        }
        for (int i = 0; i < deck1.length; i++) {
            values[i] = deck1[i];
        }
        for (int i = 0; i < deck2.length; i++) {
            values[i + deck1.length] = deck2[i];
        }
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values) {
        for (int i = values.length - 1; i > 0 ; i--){
            int random = (int)(Math.random() * (i + 1));
            swap(values, i, random);
        }
    }

    public static void swap(int[] n, int first, int second) {
        int temp = n[first];
        n[first] = n[second];
        n[second] = temp;
    }
}
