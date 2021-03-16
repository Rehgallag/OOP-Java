import java.util.*;

public class ShapeClassTester
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      //System.out.println("5 ^ 2 = " + square(5));
      //System.out.println("10 ^ 2 = " + square(10));
      //System.out.println("3 ^ 2 = " + square(3));
      
      //declare variables
      int[] values; //create the array ref
      
      //call the method - the method returns the address or ref to the array
      values = createArray();
      
      //print the values
      for(int i : values)
      {
         System.out.print(i +" ");
      }
      
      
   }
}