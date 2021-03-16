
/*
	Written by : Maeve Carr
	Date:
	Desc: A class to implement a playing card
*/

import java.util.*;
/**
   This class implements a playing card.
*/
public class PlayingCard
{
   private int faceValue;
   private int suit;  //easier to store as int
   
   //constructor
   public PlayingCard(int faceValueIn, int suitIn)
   {
      if(faceValueIn >= 1 && faceValueIn <= 13 && suitIn >= 1 && suitIn <= 4)  //as long as values are valid 
      { 
         faceValue = faceValueIn;
         suit = suitIn;
      }
      else
      {  //set to default card Ace of hearts
         faceValue = 1;
         suit = 4;
      }
   }
   
   public PlayingCard()
   {
      //generate two random values in the correct range
      Random noGen = new Random();
      faceValue = noGen.nextInt(13) + 1;//0 --> 1, 1-->2, 12 --> 13
      suit = noGen.nextInt(4) + 1;;
   }

   
   //methods
    /**
      Get the  suit of the card.
      @return the suit of the the card as a string
   */

   public String getSuit()
   {
      String s = "";
      
      switch(suit)
      {
         case 1: s = "Clubs";
            break;
         case 2: s = "Spades";
            break;
         case 3: s = "Diamonds";
            break;
         case 4: s = "Hearts";
            break;
         default: s = "Unknown type"; 
      }
      return s; 
   }
  
  /**
      Get the  faceValue of the card.
      @return the faceValue of the the card as a string
   */
 
   public String getFaceValue()
   {
      switch(faceValue)
      {
         case 1: 
            return "Ace";
         case 2: 
            return "Two";
         case 3: 
            return "Three";
         case 4: 
            return "Four";
         case 5: 
            return "Five";
         case 6: 
            return "Six";
         case 7: 
            return "Seven";
         case 8: 
            return "Eight";
         case 9: 
            return "Nine";
         case 10: 
            return "Ten";
         case 11: 
            return "Jack";
         case 12: 
            return "Queen";
         case 13: 
            return "King";
         default: 
            return "Unknow Type"; 
      }
   
   }
   //determine colour of card
   public String getColour()
   {
      String s = "";
      // Get the type description
      switch(suit)
      {
         case 1:
         case 2:	s = "Black";
            break;
         case 3:
         case 4:	s = "Red";
            break;
         default: s = "Unknown type: ";
      }
      return s;
   }
	
	
   public String toString()
   {
      return getFaceValue() +" of " +getSuit() +": " +getColour();
   }
   
   public boolean equals(PlayingCard otherCard)
   {
      return faceValue == otherCard.faceValue &&
              suit == otherCard.suit;
   }

		
}//end class