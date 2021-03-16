public class Bottle {
   private double capacity;
   private double liquidLevel;
   
   public Bottle() {
      capacity = 0.75;
      liquidLevel = 0;
   }
   
   public Bottle(double n) {
      liquidLevel = n;
   }
   
   public double getLiquidLevel() {
      return liquidLevel;
   }
   
   public double getEmptySpace() {
      return capacity - liquidLevel;
   }
   
   public void fill() {
      liquidLevel = 0.75;
   }
   
   public void empty() {
      liquidLevel = 0;
   }
   
   public void pour(double amount) {
      liquidLevel = liquidLevel - amount;
   }
   
   public void fill(double n1) {
      liquidLevel = liquidLevel + n1;
   }
}