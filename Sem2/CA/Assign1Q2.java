// Question 1
// CA 
// John Gallagher
// 21 February 2020
// Program to display result on screen

import java.util.*;
import java.util.regex.*;

public class Assign1Q2 {
   public static final int PASSWORD_LENGTH = 8;
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String str = new String();
      String password = new String();
      String confirmPass = new String();
      
      System.out.print("Enter your user name (email or mobile number): ");
      str = in.nextLine();
      
      
      if(isValid(str) == true){
         System.out.println("Your email address is: " + str);
         System.out.println("Email provider: " + str.substring(str.indexOf("@") + 1));
      }
      if(isValid(str) == false){
         System.out.println(str + " is not a valid email Address");
         System.exit(0);
         
      }
         
      if (isValid2(str)){ 
         System.out.println("Your are on the " +str.substring(0, 3) + " network");  
      }         
      else{
         System.out.println(str + " is an invalid Number");
         System.exit(0);
      }
        
      System.out.print("Enter your password: ");
      password = in.nextLine();
      String replacing = password.replaceAll(password, "*");
      
      
      
      if (isValidPassword(password)) {
         System.out.println("Your password is " + replacing);
      } else {
         System.out.println("Not a valid password: " + password);
      }
        
      
   }
   
   public static boolean isValid(String str) {
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return str.matches(regex);
   }
   
   public static boolean isValidPassword(String password) {
      if (password.length() < PASSWORD_LENGTH) 
         return false;
      else
         return true;
   }
    
   public static boolean isValid2(String str) { 
        // 1) Begins with 08 
        // 2) Then contains 7 or 8 or 9. 
        // 3) Then contains 9 digits 
      Pattern p = Pattern.compile("(0)?[3-9][0-9]{8}"); 
   
      Matcher m = p.matcher(str); 
      return (m.find() && m.group().equals(str)); 
   } 
}
/*
if (isValid(s)==true)  
            System.out.println("Valid Number");         
        else 
            System.out.println("Invalid Number");
*/