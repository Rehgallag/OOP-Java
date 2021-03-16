public class Converter {
   private double rate;
   private double amount;
   
   public void setRate(double rateIn) {
      rate = rateIn;
   }
   
   public double getRate() {
      return rate;
   }
   
    public void setAmount(double amountIn) {
      amount = amountIn;
   }
   
   public double getAmount() {
      return amount;
   }
   
   public double convertToSterling(double amount) {
      amount = amount * rate;
      return amount;
   }
   
   public double convertToEuro(double amount) {
      amount = amount / rate;
      return amount;
   }
}