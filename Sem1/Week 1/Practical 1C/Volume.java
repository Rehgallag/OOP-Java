// Practical 1C- Question 3
// John Gallagher
// 20 September 2019
// Program to display result on screen

public class Volume
{
  public static void main(String[ ] args)
  {
   //declare variable to hold values
   int length;
   int width;
   int depth;
   int result;
   int measurement;
   
   //assign values to length, width and depth
   length = 4;
   width = 2;
   depth = 12;
   result = length * width * depth;
  
   
   //display volume on screen
   System.out.print(result);
   System.out.print(" inches");
   


  }
}