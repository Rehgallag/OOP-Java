// Practical 10B - Question 0 Disscussion
// John Gallagher
// 26 March 2020 
// Program to display result on screen

import java.util.*;

public class Q0ExampleDiscussion 
{
   public static void main(String[] args)
   {
     /* ArrayList<String> wordList = 
         new ArrayList<String>()
         {
            {
               add("apple"); add("eel");
               add("elephant"); add("eagle");
               add("mountain"); add("donkey");
               add("cat");
               add("dog");
            }
         }; */
        
        ArrayList <String> wordList
                  = new ArrayList<String>(Arrays.asList("ant", "cat", "dog", "giraffe", "elephant")); 
                  
      System.out.print(wordList);
   }
}