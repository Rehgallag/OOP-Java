// Practical 6A - Question 6
// John Gallagher
// 25 February 2020 
// Program to display result on screen

import java.util.*;

public class Q6DogTester {
   public static void main(String[] args) {
      Dog spot = new Dog();
      
      spot.setBreed( "Alsatian" );
      spot.setSize(-1);
      
      System.out.println("Spot says " + spot.bark());
   }
}