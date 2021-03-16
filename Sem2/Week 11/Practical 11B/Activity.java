/////////////////////////////
//       Activity          //
/////////////////////////////
//                         //
// activityName: String    //
// calsBurnedPerMin: double//
//                         //
//////////////////////////////
//                          //
// Activity(String, double) //
// getCalsBurnedMinute(): double//
// getActivity(): String    //
// getCaloriesBurned(int,int): double//
//                            //
///////////////////////////////

public class Activity
{
   //instance variables
   private String activityName;
   private double calsBurnedPerMin; //calories burned per minute of activity per pound weight of person
   
   //constructors
   public Activity(String activityNameIn, double calsBurnedIn)
   {
      activityName = activityNameIn;
      calsBurnedPerMin = calsBurnedIn;
   }
   
   //methods
   //returns calsBurnedPerMin
   public double getCalsBurnedPerMin()
   {
      return calsBurnedPerMin;
   }
   
   //returns activityName
   public String getActivity()
   {
      return activityName;
   }
   
   //take args for mins of activity and weight in pounds  //not getCalsBurned as it makes you think that it is a getter that does nothing more than return a value
   //return total calories burned
   public double calcCalsBurned(int minsOfActivity, int pounds)
   {
      return calsBurnedPerMin * minsOfActivity * pounds;
   }
   
   public String toString()
   {
      return activityName +" burns " +calsBurnedPerMin +" calories per minute per pound weight";
   }
   
   public boolean equals(Activity otherActivity)
   {
      return activityName.equalsIgnoreCase(otherActivity.activityName)
               && calsBurnedPerMin == otherActivity.calsBurnedPerMin;
   }
}