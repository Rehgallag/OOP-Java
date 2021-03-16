import java.util.*;

public class Shapes{
   private int x;

   public static int square(int x){
      return x*x;
   }
   
   public static int cube(int x){
      return x*x*x;
   }
   
   //method will create and return an array of values 1 to 10
   public static int[] createArray()
   {
      int[] myNums = new int[10];
      for(int i = 0;i <myNums.length; i++) //traverse the array
      {
         myNums[i] = i + 1; //not the + 1
      }
      return myNums; //return a ref to the filled array
   }
   
   public static int[] createRandomArray()
   {
      Random noGen = new Random();
      
      int[] myNums = new int[10];
      for(int i = 0;i < myNums.length; i++)
      {
         myNums[i] = noGen.nextInt(10) + 1;
      }
      return myNums;
   }
}