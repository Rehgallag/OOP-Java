import java.util.*;

public class ActivityTester
{
   public static void main(String[] args)
   {
      //This tester should test all methods not just toString() and equal()
      Scanner in = new Scanner(System.in);
      //create an activity object
      Activity swim  = new Activity("Swimming", 0.071);
      Activity run = new Activity("Running", 0.095);
      Activity cycle = new Activity("Cycling", 0.045);
      
      System.out.println(swim); //test toString()
      System.out.println(run);
      System.out.println(cycle);
      //test calcCalsBurned()
      System.out.print("30 minutes of " +swim.getActivity() +" will burn " +swim.calcCalsBurned(30, 140) +" calories");
      
      //test equals
      if(swim.equals(run))
      {
         System.out.println("the same");
      }
      else
         System.out.println(" different ");
   }//end main
}//end class