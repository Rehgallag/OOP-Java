public class Q1DateClassTester { 
   public static void main(String[] args) {
      Date xmasDay = new Date(25, 12, 2020);
      
      System.out.println("The day is: " + xmasDay.getDay());
      System.out.println("The month is: " + xmasDay.getMonth());
      System.out.println("The year is: " + xmasDay.getYear());
   }
}