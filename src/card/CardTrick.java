/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Philip Soltys
 * Student #: 991739004
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        for(int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(random.nextInt(12) + 1);  // random value between 1 and 12
            c1.setSuit(Card.SUITS[random.nextInt(4)]);  // random suit from 0 to 3
            magicHand[i] = c1;
       
        }
        System.out.println("The magic hand contains the following cards:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
        
        // Hardcoded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(10);
        luckyCard.setSuit("Diamonds");
        
        // Search the magicHand for the lucky card
        boolean luckyCardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                luckyCardFound = true;
                break;
                
    }
    }
        // Report the result
        if (luckyCardFound) {
            System.out.println("The lucky card is in the magic hand!");
        } else {
            System.out.println("The lucky card is not in the magic hand.");
        }
        }
        }
    


    
