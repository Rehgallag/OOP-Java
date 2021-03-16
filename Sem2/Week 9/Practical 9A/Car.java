public class Car
{
   //instance fields
   private double efficiency;//km per litre ( I am a european)
   private double fuelLevel;
   private final double MAXCAPACITY;
  
   public Car(double efficiencyIn, double maxCapIn)
   {
   
   }
     
   public double getFuelLevel()
   {
      return fuelLevel;
   }
  
   public void addFuel(double fuelAmt)
   {
      fuelLevel = fuelLevel + fuelAmt;  //is this ok????
      //check that it is not greater than capacity
      if(fuelLevel > MAXCAPACITY)
         fuelLevel = MAXCAPACITY;
   }
  
   public void fillUp()
   {
      fuelLevel = MAXCAPACITY;
   }

   public void drive(double distance)
   {    
      if(distance <= fuelLevel*efficiency)  //check if enough fuel for the journey           
         fuelLevel = fuelLevel - (distance/efficiency);
   }    
   
   public String toString()
   {
      return "Fuel Level: " +fuelLevel
               +"; KM per litre :" +efficiency
               +" Capacity of fuel tank: " +MAXCAPACITY;
   }
}