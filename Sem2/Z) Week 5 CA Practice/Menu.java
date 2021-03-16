import java.util.*;

public class Menu {
   boolean exit;
 
   public static void main(String[] args) {
      Menu menu = new Menu();
      menu.runMenu();
   }
   
   public void runMenu() {
      printHeader();
      while(!exit){
         printMenu();
         int choice = getInput();
         performAction(choice);
      }
   }
 
   public void printHeader() {
      System.out.println("+-------------------------------------+");
      System.out.println("|              Welcome to our         |");
      System.out.println("|             Menu Appilcation        |");
      System.out.println("+-------------------------------------+");
   }
   
   public void printMenu() {
      System.out.println("\nPlease make a selection: ");
      System.out.println("1) Tell me a colour");
      System.out.println("2) Tell me a shape");
      System.out.println("0) Exit");
   }
   
   public int getInput() {
      // create a scanner
      Scanner in = new Scanner(System.in); 
      // set initial choice to -1
      int choice = -1;
      // while choice is invaild ask to choice
      while(choice < 0 || choice > 2) {
         try {
            System.out.print("\nEnter your choice: ");
            choice = Integer.parseInt(in.nextLine());
         }
         catch(NumberFormatException e){
            // if there is a problem reading from input
            System.out.println("Invalid selection. Please try again.");
         }
      }
      return choice;
   }
   
   public void performAction(int choice) {
      switch(choice) {
         case 0:
            exit = true;
            System.out.println("Thank you for using our application.");
         case 1:
            pickColour();
            break;
         case 2:
            pickShape();
            break;
         default:
            System.out.println("An unknown error has occured.");
      }
   }
   
   public void pickColour() {
      int num = (int)(Math.random() * 4);
      switch(num) {
         case 0:
            System.out.println("Green");
            break;
         case 1:
            System.out.println("Red");
            break;
         case 2:
            System.out.println("Blue");
            break;
         case 3:
            System.out.println("White");
            break;
         default:
            System.out.println("Black");
            
      }
   }
   
   public void pickShape() {
      int num = (int)(Math.random() * 4);
      switch(num) {
         case 0:
            System.out.println("Square");
            break;
         case 1:
            System.out.println("Circle");
            break;
         case 2:
            System.out.println("Triangle");
            break;
         case 3:
            System.out.println("Hexagon");
            break;
         default:
            System.out.println("Pyramid");
           
      }
   }

}
