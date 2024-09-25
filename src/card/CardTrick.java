/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * modifier Daniel Enriquez 09/24/24
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(2);
            c.setSuit(Card.SUITS["Diamonds"]);
            magicHand[i] = c;
        }
        //Daniel Enriquez 991617573
        Scanner input = new Scanner(System.in);
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter a card value (1-13):");
        int cardValue = input.nextInt();
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades:");
        String suitValue = input.nextLine();
        // and search magicHand here
        for (Card i : magicHand) {
        if (i.getValue() == input.getValue() && i.getSuit() == input.getSuit()) {
            //Then report the result here
        System.out.println("Your card is " + cardValue);
        } else {
        System.out.println("Sorry, your card is not in the magic hand."); }
        }
        // add one luckcard hard code 2,clubs
        luckyCard l = new luckyCard();
        l.setValue(2);
        l.setSuit(Card.SUITS["Clubs"]);
    }
    
    
}
