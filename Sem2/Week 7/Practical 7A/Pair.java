// Practical 7A - Question 1
// John Gallagher
// 03 March 2020
// Program to display result on screen

public class Pair {
   private double num1;
   private double num2;
   private double sum;
   private double difference;
   private double product;
   private double average;
   
   public void setNum1(double n1) {
      num1 = n1;
   }
   
   public double getNum1() {
      return num1;
   }
   
   public void setNum2(double n2) {
      num2 = n2;
   }
   
   public double getNum2() {
      return num2;
   }
   
   public double getSum() {
      return sum = num1 + num2;
   }
   
   public double getDifference() {
      return difference = num1 - num2;
   }
   
   public double getProduct() {
      return product = num1 * num2;
   }
   
   public double getAverage() {
      return average = (num1 + num2)/2;
   }
}