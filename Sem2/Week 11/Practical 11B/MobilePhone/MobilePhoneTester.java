import java.util.*;

public class MobilePhoneTester
{
   public static void main(String[] args)
   {
      Scanner in  = new Scanner(System.in);
      
      //construct an object
      MobilePhone phone1 = new MobilePhone();
      MobilePhone phone2 = new MobilePhone(0.15, 0.05);
      MobilePhone phone3 = new MobilePhone(-1, -0.05);
      
      /*System.out.print("Phone 1 balance: " +phone1.getBalance());
      System.out.println("  call cost: " +phone1.getCallCost() +"   text Cost: " +phone1.getTextCost());
      System.out.print("Phone 2 balance: " +phone2.getBalance());
      System.out.println("  call cost: " +phone2.getCallCost() +"   text Cost: " +phone2.getTextCost());
      System.out.print("Phone 3 balance: " +phone3.getBalance());
      System.out.println("  call cost: " +phone3.getCallCost() +"   text Cost: " +phone3.getTextCost()); */
      
      /*//test toString
      System.out.println("Phone 1: " +phone1);
      System.out.println("Phone 2: " +phone2);
      System.out.println("Phone 3: " +phone3); */
      
      /* //test topUp
      phone1.topUp(10);
      System.out.println("After topping up by 10 euro Phone 1: " +phone1);
      //test other methods
      phone1.makeCall();
      phone1.sendText();
      System.out.println("\nAfter making call and sending text Phone 1: " +phone1); */
      
      for(int i = 0; i < 200; i++)
      {
         phone1.makeCall();
      }
      System.out.println("After trying to make a lot of calls Phone 1: " +phone1);
   }
}