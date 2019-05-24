/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye, Jade Thoma [991545919]
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(c.getSuits(rand.nextInt(3)));
            magicHand[i] = c;
        }
        
        Boolean found = false;
        
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Spades");
        
        for(int i = 0; i < magicHand.length; i++) {
            if(luckyCard.getSuit() == magicHand[i].getSuit() && luckyCard.getValue() == magicHand[i].getValue()){
                System.out.println("Good Guess!Your card is in the magic hand");
                found = true;
            }
        }
        if(found != true){
            System.out.println("card not found");
        }
    }
    
}
