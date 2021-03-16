//The notes for the Java CA #2
// CA #2
// John Gallagher
// 6 December 2019
// Program to display result on screen

import java.util.*;

public class CA_Number_2
{
   public static void main(String[] args)
   {
      //create a scanner
      Scanner in=new Scanner(System.in);
      
      //declaring variables
      int num=0;
      double num2=0;
      final double PI=3.14259; //final double variable name must be in CAPS
      
      //declaring arrays
      int[] marks = new int[6]; 
      double[] temps = new double[7];
      String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
      String[] day = new String[1];
      
      //**IF STATEMENT**
      // declare variable
      double examMark = 0;
      
      // assign value to variable
      System.out.print("Please enter your exam mark: ");
      examMark = keyboardIn.nextDouble();
      
      if(examMark >= 40)
      {
               System.out.print("You have passed this exam");
      }
      
      if(examMark < 40)
      {
               System.out.print("You have failed this exam");
      }
      
      //**IF ELSE STATEMENT**
      //read in variables
      double num1, num2;
      
      //prompt input from user
      System.out.print("Enter the first number: ");
      num1 = keyboardIn.nextDouble();
      
      System.out.print("Enter the second number: ");
      num2 = keyboardIn.nextDouble();
      
      //determine if a number is smaller 
      if(num1 > num2)
      {
            System.out.println(num2 + " is the smaller number");
      }
      else
      {
            System.out.println(num1 + " is the smaller number");
      }
      
      //**ELSE IF STATEMENT**
      Scanner keyboardIn = new Scanner(System.in);
   
      int mark;
   
      System.out.print("Please enter your grade: ");
      mark = keyboardIn.nextInt();
   
      if ( mark <= 39 )
      {
            System.out.print("Fail.");
      }
      else if ( mark >= 40 && mark <= 54 )
      {
               System.out.print("Pass.");
      }
      else if ( mark >= 55 && mark <= 69)
      {
            System.out.print("Merit.");
      }  
      else if ( mark >= 70 && mark <= 100)
      {
            System.out.print("Distinction.");
      }
      
      //**SWITCH STATEMENT**
      //declare variable
      Scanner in = new Scanner(System.in);
      int day;
      
      System.out.print("Enter a day [1 to 7] : ");
      day = in.nextInt();
      
      switch(day)
      {
         case 1: 
               System.out.print("The day is Monday");
               break;
         case 2: 
               System.out.print("The day is Tuesday");
               break;
         case 3: 
               System.out.print("The day is Wednesday");
               break;
         case 4: 
               System.out.print("The day is Thursday");
               break;
         case 5: case 6: case 7:
               System.out.print("The weekend is here!");
               break;
         default: System.out.print("Incorrect Day");
         
      }//end the switch statement
      
      //**NESTESTED IFS**
      if(age < 28) //outer if 
	   {      
         if(gender == 'm')  //nested if 
		   {
			   premium = premium + 150;
		   }
	   }
      //can also be written logical AND &&
      if(age < 28 && gender == 'm')
      {          
         premium = premium + 150; 
      }
      //LEAP YEAR QUESTION
      /*Get year
      
      IF year has 4 as factor
               IF 100 is a factor
                  IF 400 is a factor
                     DISPLAY is a leap year
                  ELSE
                     DISPLAY is NOT a leap year
               ELSE
                  DISPLAY a leap year
      Else
        DISPLAY NOT a leap year
      */
      if (year % 4==0)
      {
         if(year % 100==0)
         {
            if(year % 400==0)
            {
               System.out.println("A leap year");
            }
            else
            {
               System.out.println("Not a leap year);
            }
         }
         else
         {
            System.out.println("A leap year"):
         }
      }
      else
      {
         System.out.println("Not a leap year");
      }  
      
      //**WHILE STATEMENT**(CONTROL STRUCTURE)
      //loop counter initialisation
		int i=1;

		//print statement
		System.out.println("Output is : ");

		//loop to print 1 to 10.
		while(i<10)	
		{
			System.out.print(i);
			i++;
      }
      //*IN REVERSE ORDER*
      //loop counter initialisation
		int i=10;

		//print statement
		System.out.println("Output is : ");

		//loop to print 10 to 1.
		while(i>=0)	
		{
		   System.out.println(i);
         i=i-1;
         if (i == 0)
         {
            System.out.print("BlASTOFF!!!!");
            break;
         }
		}
      //*MORE QUESTIONS
      //loop counter initialisation
		int i=0, sum=0, n=0;
      
      //declare scanner
      Scanner in = new Scanner(System.in);
      
		//print statement
		System.out.print("Enter the n amount you want: ");
      n = in.nextInt();
      
      
		//loop to print sum of 1 to 10
		while(i<n)	
		{
         sum+=i;
         i++;
      }
      
      System.out.println("The sum is = "+sum);
    }
     //SUM OF ALL N0S FROM 10 TO 100
     //loop counter initialisation
		int i=10, sum=0;

		//print statement
		System.out.println("Output is : ");

		//loop to print sum of 1 to 10
		while(i<100)	
		{
		   sum = sum + i;
         i++;
      }
      
      System.out.println(sum);
      //*MORE*
      //loop counter initialisation
		int i=-9;

		//print statement
		System.out.println("Output is : ");

		//loop to print -9 to 5.
		while(i>=-9 && i<=5)	
		{
		   System.out.println(i);
			i++;
         
		}
      
      //** DO WHILE STATEMENT **
      //declare Scanner
      Scanner in = new Scanner(System.in);
      int num, total=0;
      
      System.out.print("Enter a number: ");
      num = in.nextInt();
      
      do{
         if(num !=0) total = total + num;
         System.out.print("Enter a number: ");
         num = in.nextInt();
      }
      while(num !=0);
      
      System.out.println(total);
      //** MENU DO WHILE **
      int option;
      do{
         //display menu
         System.out.println("\nMain Menu\n");
         System.out.println("1. Option 1\n2. Option 2\n3. Quit\n");
         //get user option
         System.out.print("Please enter option: ");
         option = keyIn.nextInt();
         switch(option)
         {
         case 1: System.out.println("Option 1 chosen...");
                  break;
         case 2: System.out.println("Option 2 chosen...");
                  break;
         case 3: System.out.println("You have chosen quit...");
                  break;
         default: System.out.println("Invalid option – please”+“enter 1, 2 or 3...");
         } //end switch
         }while(option != 3);
         //**sTRING DO WHILE**
         String response;
         int num;
         do 
         {
            System.out.print("Enter number: " );
            num = keyIn.nextInt();
            System.out.print("Do you want to change number?");
            response = keyIn.next ();
         }while(response.equalsIgnoreCase("yes")); //while yes
         System.out.println("final number " +num );
         
         //** FOR STATEMENT **
         // print 1 to 10 in reverse order
         for(int i=10; i>=1; i--)
         {
            System.out.println(i);
         }
         
         // create a scanner
         Scanner in = new Scanner(System.in);
      
         int n=0,age=0, num=0;
         double avg;
      
         System.out.print("Enter the amount of students in the class: ");
         n = in.nextInt();
      
         // print age on screen
         for(int i=1; i<=n; i++)
         {
            System.out.print("Enter your age: ");
            age = in.nextInt();
            num = num + age;
         }
         // calc average
         avg = (double)num/n;
         // display average
         System.out.print("Average age is " +avg);

         int sum=0;
      
         // print sum of all even no
         for(int i=1; i<=100; i++)
         {
            if(i % 2 == 0)
            {
             sum = sum + i;
            }
         }
         System.out.print(sum);
         
         //** NESTED LOOPS **
         for(int i=1;i<=1;i++)
         {
            for(int o=1;o<=3;o++)
            {
               System.out.println("0 1 2 3 4");
            }
         }
         
         //create a scanner
         Scanner in=new Scanner(System.in);
      
         int n,sum=0;
      
         do{
         System.out.print("How many stars do you wish to see? ");
         n=in.nextInt();
      
         for(int i=1; i<=n; i++)
         {
            System.out.print("*");
         }
         System.out.println();
         } while (n!=0);    
         
         //** ARRAYS **
         //create a scanner
         Scanner in=new Scanner(System.in);
         double[] temps = new double[7];
         double sum=0;
         double avg=0;
      
         //get the daily temperature for the week
         System.out.println("Enter the temperature:  ");
         for(int i=0;i<temps.length;i++)
         {
            System.out.print("Day "+(i+1)+": ");
            temps[i]=in.nextDouble();
         }
         //display the daily temperatures for the week
         System.out.println("Daily temperatures");
         for(int i=0;i<temps.length;i++)
         {
            System.out.println("Day "+(i+1)+": "+temps[i]);
         }
         //get and display the average
         for(int i=0;i<temps.length;i++)
         {
            sum = sum + temps[i];
         }
         avg = sum/temps.length;
         System.out.print("The avg temperature of the week is: ");
         System.out.printf("%.2f", avg);
         
         String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
      
         //print out the days in order
         for(int i=0; i<days.length;i++)
         {
            System.out.print(days[i] + " ");
         } 
         //print a black space
         System.out.print("\n");
     
         //print out the days in reverse order
         for(int i=days.length-1;i>=0;i--)
         {
            System.out.print(days[i] + " ");
         } 
         
         


   }
}