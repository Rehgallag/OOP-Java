import java.util.*;

public class SwitchStatementMonth{
   
   public static void main(String[] args){
      
      //creates a scanner object
      Scanner in=new Scanner(System.in);   
          
      //declares variable months
      int month=0;       
      
      //asks user for input
      System.out.print("Enter a month number [1-12]: ");
      month=in.nextInt();
      
      switch(month){
      
         case 1:
         case 2:
         case 12: System.out.print("It is winter");
               break;
         case 3:
         case 4:
         case 5: System.out.print("It is spring");
               break;
         case 6:
         case 7:
         case 8: System.out.print("It is summer");
               break;
         case 9:
         case 10:
         case 11: System.out.print("It is autumn");
               break;
         default: System.out.print("ERROR!INVALID INPUT! PLEASE ENTER A NUMBER BETWEEN 1-12");
      }
   }
}