package com.company;

import java.util.*;

public class Deck {

    public Deck (String [] ranks, String [] suits, int [] pointValues) {
        ArrayList<Card> list = new ArrayList();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                Card temp = new Card (ranks[j], suits[i], pointValues[j]);
                deck.add(temp);
            }
        }
        //shuffle(cards); FOR ACTIVITY 4
        deck = list;
        deckSize = deck.size();
    }

    private ArrayList<Card> deck;
    private int deckSize;

    public boolean isEmpty () {
        if (deck.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size () {
        return 52 - deckSize;
    }

    public Card deal () {
        deckSize--;
        return deck.get(deckSize);
    }

    public void shuffle () {
        for (int i = deck.size() - 1; i > 0; i--) {
            int pos = (int)(Math.random() * (i + 1));
            Card temp = deck.get(pos);
            deck.set(pos, deck.get(i));
            deck.set(i, temp);
        }
    }
}
