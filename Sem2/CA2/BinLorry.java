// CA2 - Question 1
// BinLorry
// John Gallagher
// Applied Computing

public class BinLorry
{
   private double rubbishTankSize = 1000;
   private double lvlOfRubbish;
   private double fuelTankSize = 1000;
   private double lvlOfFuel;
   private double kmPerLitre=100;
   
   //contructors
   public BinLorry()
   {
      lvlOfRubbish = 0;
      lvlOfFuel = 0;
   }
   
   //methods
   //get rubbish level
   public double getRubbishLvl()
   {
      return lvlOfRubbish;
   }
   
   //get empty space
   public double getEmptySpace()
   {
      return rubbishTankSize - lvlOfRubbish;
   }
   
   //empty completely
   public void empty()
   {
      lvlOfRubbish = 0;
   }
   
   //fill
   public void fill()
   {
      lvlOfFuel = 1000;
   }
   
   //add fuel to tank but make sure it cant add a value over the tank size
   public void addFuel(double amt)
   {
      //check that it is not greater than capacity
      if(lvlOfFuel + amt <= fuelTankSize) 
      {
         lvlOfFuel += amt;
      }
      else 
      {
         System.out.println("ERROR! Tank capacity is 1000 litres");
      }   
   }
   
   //drive a distance
   public void drive(double distance)
   {    
      if(distance <= lvlOfFuel*kmPerLitre) 
      {            
         lvlOfFuel = lvlOfFuel - (distance/kmPerLitre);
      }   
   }
   
   //collect bin
   public void collectBin(double bin)
   {
      if(lvlOfRubbish + bin <= rubbishTankSize)
      {
         lvlOfRubbish += bin;
      }
      else
      {
         System.out.println("ERROR!. Tank is 100 Litres");
      }
   }
   
   public String toString()
   {
      return "\nRubbish Lvl: " + lvlOfRubbish
               +"\nFuel Level: " +lvlOfFuel
               +"\nKM per litre :" +kmPerLitre
               +"\nCapacity of fuel tank: " +fuelTankSize;
   }


}