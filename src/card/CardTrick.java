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
            c1.setValue(random.nextInt(13) + 1);  // random value between 1 and 13
            c1.setSuit(Card.SUITS[random.nextInt(4)]);  // random suit from 0 to 3
            magicHand[i] = c1;
       
        }
        System.out.println("The magic hand contains the following cards:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
            // Ask the user for their card
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a card value (1 to 13): ");
        int userValue = scanner.nextInt();
        
        System.out.println("Enter a card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.next();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        // Search the magicHand for the user's card
        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                cardFound = true;
                break;
    }
    }
        //Then report the result here
         if (cardFound) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
        }
    }


    
