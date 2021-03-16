import java.util.*;
public class PlayingCardTester
{
   public static void main(String[] args)
   {
      ArrayList<PlayingCard> deck =new ArrayList<PlayingCard>(); // Question 1
      
      deck.add(new PlayingCard());// Question 2
      deck.add(new PlayingCard());
      deck.add(new PlayingCard());
      deck.add(new PlayingCard());
      deck.add(new PlayingCard());
      deck.add(new PlayingCard()); 
      
      for(PlayingCard c: deck) // Question 3
      {
         System.out.println(c);
      }
      
      System.out.println("\n");
      
      for(PlayingCard c: deck) // Question 4
      {
         if(c.getColour() == "Red")
         {
            System.out.println(c);
         }
      }
      
      System.out.println("\n");
      
      ArrayList<PlayingCard> fullDeck =new ArrayList<PlayingCard>(); // Question 5
      for(PlayingCard c: fullDeck){
         fullDeck.add(new PlayingCard());
         System.out.println(c);
      }
      
       // Question 6
      for(PlayingCard c: fullDeck){
         fullDeck.add(new PlayingCard());
         if(
         System.out.println(c);
      }
  }   
}