/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 * Modifier: Ravneet Kaur(Raven)
 * Modifier Student ID: 991602063
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        Card aceHearts = new Card("Hearts",13);
        System.out.println(aceHearts.getValue());
        System.out.println(aceHearts.getSuit());
        Card sevenSpades = new Card("Spades", 7);
        
    }
}
