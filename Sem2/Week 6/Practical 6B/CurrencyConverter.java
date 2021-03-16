public class CurrencyConverter {
   private double euro;
   private double pound;
   
   public double getEuro() {
      return euro;
   }
   
   public void setEuro(double euroIn) {
      euro = euroIn;
   }
   
   public double getPound() {
      return pound;
   }
   
    public void setPound(double poundIn) {
      pound = poundIn;
   }
   
   public double convEuroToStr(double euro) {
      euro = euro * 0.77;
      return euro;
   }
   
   public double convStrToEuro(double pound) {
      pound = pound / 0.77;
      return pound;
   }
}