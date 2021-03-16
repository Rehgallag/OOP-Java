import java.util.*;

public class RevisionAPI2
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      //question 2
      int n = 2;
      System.out.println(Math.pow(n, 17) );
      System.out.println(Math.round(27.8987) );
      System.out.println(Math.hypot(3, 4) );
      
      //question 3
      boolean valid;
      do{
         valid = true;
         System.out.print("Enter your full name: ");
         String name = in.nextLine();
         
         if(name.length() < 4)
         {
            System.out.println("Must have at least four letters");
            valid = false;
         }
         
         if(!name.contains(" "))
         {
            System.out.println("Must have at least one space");
            valid = false;
         }
         
         for(int i = 0; i < name.length(); i++)
         {
            //if the charAt(i) is not (a letter or space)
            if(!(Character.isLetter(name.charAt(i)) || Character.isWhitespace(name.charAt(i))))
            {
               System.out.println("Invalid character - Can only contain letters");
               valid = false;
               break;//break out of loop
            }
         }


      }while(!valid);
      System.out.print("Valid name");
      
      //question 4
      System.out.print("\nEnter some text: ");
      String text = in.nextLine();
      //create a string object to contain the reverse of original string
      //initialise to empty string
      String revText = "";
      //use the split() method to return array of strings or words
      String[] words = text.split(" ");
      
      for(int i = words.length - 1; i >= 0; i--)//iterate through array - start at the end
         revText = revText + words[i] +" ";//add each word to revText
         
      System.out.println(revText);
      //doesn't work btw
      
      /*
      Question 5
      public static boolean validatePassword(String str1, String str2)
      {
         return str1.equals(str2);
      }
      
      if(validatePassword("letmein", "LETMEIN"))
         System.out.println("Password valid - welcome!");
      else
         Systme.out.println("Password invalid - try again!");
      */
      
      //question 6
      Random noGen = new Random(); //create an object of random class
      int diceValue = noGen.nextInt(6) + 1; //note the 1
      System.out.println("You threw a : " + diceValue);
      
      //question 7
      diceValue = (int)(Math.random() * 6) + 1;
      System.out.println("You threw a: " + diceValue);
      
      //question 8
      String sentence = "Secret message";
      String secretText = encrypt(sentence, 3);
      
      System.out.println(secretText);
   }
}