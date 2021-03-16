// Practical 9A - Question1
// John Gallagher
// 17 March 2020

import java.util.*;

public class CarTester {
   public static void main(String [] args) {
      Scanner in = new Scanner(System.in);
     
      
      double kmPerLtr = 12.5; double capacityOfTank = 1000;          

      Car c1 = new Car(kmPerLtr,capacityOfTank);
      
      c1.fill();
      c1.drive(100);
      
      System.out.println(c1.getFuelLevel());

   }

}