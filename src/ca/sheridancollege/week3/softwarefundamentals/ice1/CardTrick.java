package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*(13-1))+1);
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
        }
        Scanner input = new Scanner(System.in);
        Card user = new Card();
        System.out.println("Pick a value of your card (1 for Ace to 13 for King)");//insert code to ask the user for Card value and suit, create their card
        int value = input.nextInt();
        user.setValue(value);
        System.out.println("Pick a suit of your card (Heart, Diamond, Spade, Club)");
        String suit = input.next();
        user.setSuit(suit);
        boolean flag = false;
        for (int i=0; i<magicHand.length; i++)
        {
            if ((magicHand[i].getValue()==user.getValue())&&(magicHand[i].getSuit()==user.getSuit())){
                flag = true;
            }
        }
        if (flag){
            System.out.println("Your card is in the magic hand");
        }
        else {
            System.out.println("Your card isn't in the magic hand");
        }// and search magicHand here
        //Then report the result here
    }
}
