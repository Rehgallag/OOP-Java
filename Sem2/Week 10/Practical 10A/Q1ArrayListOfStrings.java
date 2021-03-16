// Practical 10A - Question 1
// John Gallagher
// 23 March 2020 
// Program to display result on screen

import java.util.*;

public class Q1ArrayListOfStrings {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      ArrayList <String> teams = new ArrayList <String>(5);
      String nameIn = "";
      
      //load values into arraylist
      System.out.println("Enter the names of the five top teams in the premier league: ");
      for(int i=0;i<5;i++) {
         System.out.print("Team " + (i+1) + ": ");
         nameIn = in.nextLine();
         teams.add(nameIn);
      }
      //display the values
      System.out.println("\nPremier League top teams");
      for(int i=0;i<teams.size();i++) {
         System.out.println(teams.get(i));
      }
      //prompt user to add team
      System.out.println("\nInsert a new team into the middle of list");
      System.out.print("Enter team name: ");
      String name = in.nextLine();
      
      System.out.print("What position is this team in? "    );
      int pos = in.nextInt();
      //check that index is valid
      if(pos >=0 && pos < teams.size()) {
         //add String object a to ArrayList TopTeamList
         teams.add(pos, name);
      }
      else {
         System.out.println("index out of range must be between 0  and " + (teams.size() - 1) );
      }
      
      //remove a team
      System.out.print("Enter team name to remove: ");
      name = in.nextLine();
      
      //remove String object from ArrayList topTeamList
      teams.remove(name);
      
      //display names on screen
      System.out.println("\n\nTop teams are: " );
      for(int i = 0; i < teams.size(); i++) {
         //get each objext in list
         name = teams.get(i);
         System.out.println(name);
         
         //System.out.println(topTeamList.get(i) ); //alternatively
      }
      
      System.out.print("what position is the team you want to remove in? "   );
      pos = in.nextInt();
      
      //check that index is valid
      if(pos >=0 && pos < teams.size()) {
         //remove String object a to ArrayList topTeamList
         teams.remove(pos);
      }
      else {
         System.out.println("index out of range must be between 0 and " + (teams.size() -1) );
      }
   }
}