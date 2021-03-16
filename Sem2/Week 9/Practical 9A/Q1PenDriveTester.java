// Practical 9A - Question 1
// John Gallagher
// 16 March 2020

public class Q1PenDriveTester {
   public static void main(String[] args) {
      PenDrive p1 = new PenDrive("Toshiba",128,35.99);
      PenDrive p2 = new PenDrive("Samsung",49.99);
      
      System.out.println(p1.toString());
      System.out.println(p2.toString());
   }
}