import java.util.Scanner;
public class Flight
{
   public static void main(String[] args)
   {
      //variable declaration
      int[][] seats = new int[10][5];
      int mC;//Menu choice
      Scanner in = new Scanner(System.in);
      do {
         mC=getMenuChoice(in);
         switch (mC)
         {
            case 1://view all seats
               System.out.println("\nSeat view");
               for(int outer=0; outer<seats.length; outer ++){
                  for(int inner=0; inner<seats[0].length; inner++){
                     System.out.print(seats[outer][inner] + " ");
                     if(inner == 2)
                        System.out.print("\t");//Aisle space
                  }//end inner for loop
                  System.out.println();//skip line after row
               }//end outer for loop
               break;
            case 2://Reset all seat bookings
               break;
            case 3://Fully book plane
               break;
            case 4://Make a booking
               break;
            case 5://Cancel a booking
               break;
            case 6://Flight Statistics
               break;
            default://Exit System        
         }//end switch statement   
      } while (mC!=7);
   }//end main method





   public static int getMenuChoice(Scanner kIn)
   { char choice;
      do{
         System.out.println("\nFlight booking menu\n===================");
         System.out.println("1.    View all seats");
         System.out.println("2.    Reset all seat bookings");
         System.out.println("3.    Fully book plane");
         System.out.println("4.    Make a booking");
         System.out.println("5.    Cancel a booking");
         System.out.println("6.    Flight Statistics");
         System.out.println("7.    Exit System"); 
         System.out.print("\nEnter Choice: ");
         choice = kIn.nextLine().charAt(0);
         if (choice<'1' || choice>'7')
            System.out.println("\nInvalid choice, please choose a nenu option (1-7)");
      } while (choice<'1' || choice>'7'); 
      return Integer.parseInt( String.valueOf(choice) );
   }

}//end class