// Practical 1B- Question 4
// John Gallagher
// 23 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q4WheelsOnTheBus{
   public static void main(String[] args){
      singVerse("wheels", "Round and round");
      singVerse("wipers", "Swish, swish, swish");
      singVerseGoes("driver", "Move on back");
      singVerse("people", "Up and down");
      singVerseGoes("horn", "Beep, beep, beep");
      singVerseGoes("baby", "Whaa, whaa, whaa");
      singVerse("parents", "Shh, shh, shh");//call method
    } //end main method
    public static void singVerse(String thing, String action){
      System.out.println("The " + thing + " on the bus go " + action);
      System.out.println(action);
      System.out.println(action);
      System.out.println("The " + thing + " on the bus go " + action);
      System.out.println("all 'round the town.");
      System.out.println();
   }    
   public static void singVerseGoes(String thing, String action){
      System.out.println("The " + thing + " on the bus goes " + action);
      System.out.println(action);
      System.out.println(action);
      System.out.println("The " + thing + " on the bus goes " + action);
      System.out.println("all 'round the town.");
      System.out.println();
   }  
}