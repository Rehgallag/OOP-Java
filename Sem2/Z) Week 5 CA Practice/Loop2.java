 import java.util.*;
   
   public class Loop2 {
      
      public static void function1() {
         System.out.println("\nMenu 1 function");
         return;
      }
      
      public static void function2() {
         System.out.println("\nMenu 2 function");
         return;
      }

      public static void function3() {
         System.out.println("\nMenu 3 function");
         return;
      }
      
      public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         char quit = 'n';
         String input;
         int choice = 0;
         
         while(quit != 'y') {
           try {
            System.out.println("Please choose a function"
                     + "\n1. Menu 1"
                     + "\n2. Menu 2"
                     + "\n3. Menu 3");
         choice = in.nextInt();
         }
         catch(NumberFormatException e){
             System.out.println("Invalid selection. Please try again.");
         }
         switch(choice) {
            case 1:
                  function1();
                  break;
            case 2:
                  function2();
                  break;
            case 3:
                  function3();
                  break;   
            default:
                  System.out.println("That wasn't a choice.");   
         }           
         System.out.print("Would you like to quit y/n? ");
         input = in.next().toLowerCase();
         quit = input.charAt(0);
         }
      }
   }