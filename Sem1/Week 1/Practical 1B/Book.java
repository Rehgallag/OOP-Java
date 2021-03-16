// Practical 1B- Question 5
// John Gallagher
// 19 September 2019
// Program to display result on screen

public class Book
{
  public static void main(String[ ] args)
  {
   //declare variable to hold price and stock
   double price;
   int stock;
   
   //assign value to price and stock
    price = 10.99;
    stock = 120;
    
    //display current price and stock on screen
    System.out.print("Price of Book:\t\t\t");
    System.out.print(price);
    System.out.print("\nQuantity in Stock:\t");
    System.out.print(stock);
  }
}