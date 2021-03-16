// Practical 6B - Question 2
// John Gallagher
// 27 February 2020 
// Program to display result on screen

public class CircleCalc {
   private final double PI = 3.14159;
   private double radius;
   private double area;
   private double circumference;
   private double diameter;
   
   public void circle(double r, double a, double c, double d) {
      radius = r;
      area = a;
      circumference = c;
      diameter = d;
   }
   
   public void setRadius(double r){
      radius = r;
   }
   
   public double getRadius() {
      return radius;
   }
   
   public double getArea(){
      return area = PI * radius * radius;
   }
   
   public double getCircumference(){
      return circumference = 2 * PI * radius;
   }

   public double getDiameter(){
      return diameter = radius * 2;
   }

   public double getPI(){
      return PI;
   }

}