// Practical 1C- Question 1
// John Gallagher
// 24 January 2020 Semester 2
// Program to display result on screen

import java.util.*;

public class Q1IfYoureHappyAndYouKnowIt {
   public static void main(String[] args){
      singVerse("Clap your hands", "Clap");
      singVerse("Stomp your feet", "Stomp");
      singVerse("Pat your head", "Pat");
      singVerse("Turn around!", "Turn around");
      singVerse("Say hello!", "Hello!");
   }
   
   public static void singVerse(String thing, String action){
      System.out.println("If your happy and you know it, " + thing + ".");
      System.out.println(action + ", " + action);
      System.out.println("If your happy and you know it, and your face will surely show it ");
      System.out.println("If your happy and you know it " + action + " " + action);
      System.out.println();
   }
}

/*
If your happy and you know it, [action]
[sound], [sound]
If your happy and you know it [action]
[sound], [sound]
If your happy and you know it, then your face will surely show it
If your happy and you know it, [action]
[sound], [sound]
*/ 