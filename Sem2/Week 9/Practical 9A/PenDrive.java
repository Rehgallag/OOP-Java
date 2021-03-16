// Practical 9A - Question1
// John Gallagher
// 16 March 2020

public class PenDrive {

   private String brand;
   private double storageCapacity;
   private double price;
   
   public PenDrive(String brandIn, double priceIn) {
      brand = brandIn;
      price = priceIn;
      storageCapacity = 16;
   }
   
   public PenDrive(String brandIn, double storageCapacityIn, double priceIn) {
      brand = brandIn;
      price = priceIn;
      storageCapacity = storageCapacityIn;
   }
   
   public String toString() {
      String str = new String();
      
      str = str + brand + "_";
      str = str + storageCapacity + "GB"+"_";
      str = str + price;
      return str;
   }
   
}