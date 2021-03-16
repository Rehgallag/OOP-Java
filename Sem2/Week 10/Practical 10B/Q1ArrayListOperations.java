// Practical 10B - Question 1
// John Gallagher
// 26 March 2020 
// Program to display result on screen

import java.util.*;

public class Q1ArrayListOperations
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      int option;
      int pos;
      int wordCount;
      char letter;
      String longestWord;
      String shortestWord;
      String word;
      ArrayList <String> wordList
                  = new ArrayList<String>(Arrays.asList("ant", "cat", "dog", "giraffe", "elephant"));
      
      do{
         //display menu
         System.out.println("\n\nWordList Menu\n1. View all words\n2. View one word " );
         System.out.println("3. Add a word (append)\n4. Remove\n5. Insert a word in list" );
         System.out.println("6. Remove a word (based on positon)\n7. length of words" );
         System.out.println("8. view all words beginning with...\n9. longest words" );
         System.out.println("10. shortest words\n11. Add unique words " );
         System.out.println("0. Exit" );
         
         System.out.print("\nEnter your choice: " );
         option = in.nextInt();
         
         switch(option)
         {
            case 1:  //view all
            //for each String s in wordList
               for(String s : wordList)
               {
                  System.out.print(s + " " );
               }
               break;
            case 2:  //view one word based on position or index
               System.out.print("\nEnter position of word to view: [ 1 to  " + wordList.size() + "]:   " );
               pos = in.nextInt();
               
               if(pos <= 0 || pos > wordList.size())
                  System.out.print("\nERROR - position must be in range 1 to " +wordList.size() );
               else
               {
                  word = wordList.get(pos-1);   //note -1 adjustment
                  System.out.println(word + " is at position   " +pos );
               }
               
               break;
            case 3:  //add a word to the end of the list
               //get the word from user
               System.out.print("\nEnter word to add: " );
               in.nextLine();
               word = in.nextLine();
               
               //add it to the arraylist
               wordList.add(word);
               break;
            case 4:  //remove a word
               
               System.out.print("\nEnter a word to remove " );//get the word to remove
               word = in.next();
               if(wordList.remove(word))  //if this returns true
                  System.out.print(word +" has been deleted " );
               else
                  System.out.print(word + " NOT found in list " );
               break;
            case 5: //insert a word in list
               //get the word from user
               System.out.print("]nEnter a word: " );
               //in.nextLine(); //clears the buffer - stops code skipping..
               word = in.next(); //in this case this would fix it too as wea re only reading in single words
               
               //get the position ot insert the word
               System.out.print("\nEnter the position to inset word:[ 1 to  " + wordList.size() +"] :"  );
               pos = in.nextInt();
               
               //see if valid pos entered
               if(pos >= 1 && pos <= wordList.size())
                  wordList.add((pos-1) ,word); //add the word to that position of list
               else
                  System.out.print("\n ERROR - position must be btw 1 and  " +wordList.size());
               break;
            case 6:  //remove a word based on position
               //enter the position
               System.out.print("\nEnter the position of the word to remove:[ 1 to  " + wordList.size() + "]: ");
               pos = in.nextInt();
               
               //see if valid pos entered
               if(pos >=1 && pos <= wordList.size())
                  wordList.remove(pos-1); //ntoe -1 adjustment
               else
                  System.out.print("ERROR - position must be btw 1 and " +wordList.size() + "[: " );
               break;
            case 7:  //view all word and thier lengths
               for(String s: wordList) //for eachs string in wordlist
                  System.out.println(s + " has "+s.length() + " letters"   );
                  
               break;
            case 8:  //view all beginning with particular letter
               wordCount = 0; //REMEMBER to reset the counter
               System.out.print("\nEnter a letter: " );//get the word to remove
               letter = in.next().charAt(0);//get the letter
               for(String s: wordList)//for each string in wordList
               {
                  if(letter ==s.charAt(0))   //if letter matches the first letter of any word in list
                  {
                     System.out.println(s );
                     wordCount++;
                  }
               }
               System.out.print(wordCount + " words begin with    "+letter);
               break;
            case 9: //find longest word
                  longestWord = wordList.get(0); //set first word in list
                  wordCount = 0;
                  for(String s: wordList)
                  {
                     if(s.length() > longestWord.length())
                        longestWord = s;
                  }
                  //count no of words of longest length
                  for(String s: wordList)
                  {
                     if(s.length() == longestWord.length())
                     {
                        wordCount++;
                        System.out.print(s +" ");
                     }
                  }
                  
                  System.out.print(wordCount +" word have      "+longestWord.length() + "letters" );
                  break;
            case 10: //find shortest word
                  shortestWord = wordList.get(0); //set first word in list
                  wordCount = 0;
                  for(String s: wordList)
                  {
                     if(s.length() < shortestWord.length())
                        shortestWord = s;
                  }
                  //count no of words of shortest length
                  for(String s: wordList)
                  {
                     if(s.length() == shortestWord.length())
                     {
                        wordCount++;
                        System.out.print(s +" ");
                     }
                  }
                  
                  System.out.print(wordCount +" word have      "+shortestWord.length() + "letters" );
                  break;
            case 11: //add only unique words
               //get the word from user
               System.out.print("\nEnter word to add: " );
               in.nextLine(); //clear the buffer
               word = in.nextLine();
               
               //check if the word is already in the list
               if(wordList.contains(word))
                  System.out.print(word +" is already in the list " );
               else
                  //add it to the arraylist
                  wordList.add(word);
               break;
            case 0:
               break;
            default: //handles error entry for option
               System.out.print("\n ERROR - You must enter a value in range  " );   
         }
      
      }while(option !=0);  //runs until user enters 0 to quit
   }
}