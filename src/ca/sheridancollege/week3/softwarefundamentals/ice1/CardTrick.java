/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

import javax.smartcardio.Card;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	int pickVal,PickSuit;
    	boolean WinResult = 0;
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(Math.random()*13);//(insert call to random number generator here)
            c.setSuit(Math.random()*3);//(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        System.out.println("Pick your nose");
        pickVal = in.getInt();
        System.out.println("Wipe on suit");
        pickSuit = in.getInt();
        
        for (int x=0; x<magicHand.length; x++) {
        	if (c[x].getValue == pickVal && c[x].getSuit == pickSuit) {
        		WinResult = 1;
        		break;
        	}
        }
        if (WinResult) {
        	System.out.println("YOU ARE WINRAR!");
        }
        else {
        	System.out.println("YOU ARE FAILURE!");
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
