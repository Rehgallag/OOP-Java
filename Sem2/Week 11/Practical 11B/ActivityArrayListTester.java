import java.util.*;

public class ActivityArrayListTester
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      boolean found = false;
      
      //1. Create an ArrayList of Activity objects
      ArrayList<Activity> activityList = new ArrayList<Activity>();
      Activity a1 = new Activity("Hurling", 0.08); //create an activity
      activityList.add(a1);   //add the activity to the activityList
      
      //OR - create and add in one step
      activityList.add(new Activity("Golf", 0.038));
      activityList.add(new Activity("Swimming", 0.071));
      activityList.add(new Activity("Sitting", 0.009));
      activityList.add(new Activity("Mowing", 0.051));
      activityList.add(new Activity("Cooking", 0.022));
      activityList.add(new Activity("Walking", 0.037));
      activityList.add(new Activity("Running", 0.06));
      
      //2. Write a piece of code to add 5 activities to your activityList
      for(int i = 0; i < 5; i++)
      {
         System.out.print("Enter activity name: ");
         String name = in.nextLine();
         
         System.out.print("Enter cal burned per minute per pound: ");
         double cals = in.nextDouble();
         in.nextLine(); //clear the buffer
         
         //create an activity
         Activity act = new Activity(name, cals);
         //add to arrayList
         activityList.add(act);
         
         //OR
         //-don't do both - either line 35 and line 37 OR line 41
         //activityList.add(new Activity(name, cals));
       }  
         //3. display all activities on screen
         for(Activity a : activityList)
         {
            System.out.println(a); //this calls the toString()
         }
         
         //4. count activities that burn more than ? per min
         System.out.print("\n\nEnter target cals burned per minute per pound: ");
         double target = in.nextDouble();
         int count = 0;
         for(Activity a : activityList)
         {
            if(a.getCalsBurnedPerMin() > target)
            {
               //display the activity
               System.out.print(a.getActivity() +" ");
               count++;
            }
         }
         System.out.println("\nthe " +count +" activities listed above burn more than " +target);
         
         //5. find calories burned for each activity given weight and duration
         //  Prompt the user to enter body weight in pounds and total minutes of activity
         //  and display the total calories burned for each activity
         
         System.out.print("\nEnter weight: ");
         int wgt = in.nextInt();
         
         System.out.print("Enter minutes of activity: ");
         int mins = in.nextInt();
         
         for(Activity a: activityList)
         {
            System.out.println(a.getActivity() +" for " +mins +" mins will burn " + a.calcCalsBurned(mins, wgt)); 
         }
         
         //6. Prompt the user to enter an Activity name, a weight in pounds and total minutes
         //   of activity and display the calories burned
         
         System.out.print("\nEnter weight in pounds: ");
         wgt = in.nextInt();
         System.out.print("Enter duration in mins: ");
         mins = in.nextInt();
         System.out.print("Enter chosen Activity: ");
         String targetActivity = in.next(); //get chose activity name from user  - target
         found = false; //set found to false - assume not found
         for(Activity a : activityList)
         {
            if(a.getActivity().equalsIgnoreCase(targetActivity) )
            {
               System.out.println(a.getActivity() + " for " +mins
                     +" mins will burn " + a.calcCalsBurned(mins,wgt)+ "calories" );
               found = true; //rem it has benn found - flag variable
               break; //has been found so I break out
            }
         }
         if(!found) //if not found - other words found is still false
            System.out.println(targetActivity +" not present in list");
   }
}