// Practical 10A - Question 5
// John Gallagher
// 23 March 2020 
// Program to display result on screen

import java.util.*;

public class Q5ArrayListOfStrings {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      ArrayList<String> teams = new ArrayList<String>();
      int option = 0;
      
      do{
         System.out.println("League Menu");
         System.out.println("1. View all teams");
         System.out.println("2. View one team (based on position)");
         System.out.println("3. Add a team (to the end of the list)");
         System.out.println("4. Insert a team in list");
         System.out.println("5. Remove a team");
         System.out.println("6. Remove a team (based on position)");
         System.out.println("0. Exit");
         System.out.println("Enter your choice: ");
         option = in.nextInt();
         switch(option) {
            case 1:     System.out.println("\n\nThe teams are : " );
               for(int i = 0; i<teams.size(); i++) {
                  //get each object in list
                  System.out.print(teams.get(i) );
               }
               break;
            case 2:     System.out.println("Enter position of team you wish to view : " );
               int pos = in.nextInt(); //rem values are 0 to n-1
               //check that index is valid
               if(pos >=0 && pos < teams.size()) {
                  System.out.println(teams.get(pos) );
               } 
               else {
                  System.out.println("index out of range must be between 0  and " + (teams.size() - 1) );
               }
               break;
            case 3:
                     //get rid of extra carriage return
               in.nextLine();
                
               System.out.print("Enter team name you wish to add to the end of the list: ");
               String name = in.nextLine();
               teams.add(name);
                
               break;
            case 4:
                     //get rid of extra carriage return
               in.nextLine();
                
               System.out.println("Enter team name: "   );
               name  = in.nextLine();
                
               System.out.print("what position is this team in? ");
               pos = in.nextInt();
                        //check that index is valid
               if(pos >=0 && pos < teams.size()) {
                     //add String object a to ArrayList topTeamList
                  teams.add(pos, name);
               }
               else {
                  System.out.println("index out of range must be between 0  and " + (teams.size() - 1) );  
               }
                
               System.out.println("\n\nThe teams are : " );
               for(int i = 0; i < teams.size(); i++) {
                  //get each object in list
                  System.out.println(teams.get(i));    
               }
               break;
            case 5:
               in.nextLine();
               System.out.print("Enter team name to remove: " );
               name = in.nextLine();
                     
                        //remove String object from ArrayList topTeamList
               teams.remove(name);
               break;
            case 6:
               in.nextLine();
               System.out.print("what position is the team you want to remove in? "    );
               pos = in.nextInt();
               
                     //check that index is valid
               if(pos >=0 && pos < teams.size()) {
                     //remove String object a to ArrayList topTeamList
                  teams.remove(pos);
               }
               else {
                  System.out.println("index out of range must be between 0  and " + (teams.size() - 1) );
               }
               break;
               
            case 0:   System.out.println("You have chosen to exit...");
               break;
            default: System.out.println("Invalid option chosen...");
         }//end switch
      }while(option != 0);
   }
}