/* 
  Practical 20 - Question 5
  Eleanor Birrell
  5 December 2019
  Program to copy arrays
*/

import java.util.Scanner;
public class CopyArray
{
   public static void main(String[] args)
   {
   
      Scanner keyboardIn = new Scanner(System.in);
      
      int[] array1 = new int[10];
      int[] array2 = new int[10];
      int[] array3 = new int[10];
      
      for(int i = 0; i < array1.length; i++)
      {
      System.out.print("Enter a value: ");
      array1[i] = keyboardIn.nextInt();
      array2[i] = array1[i];
      array1[i] += 10;
      }
      
      for(int i = array3.length - 1; i > -1; i--)
      {
      array3[i] = array2[array3.length - i - 1];
      }
      
      for(int i = 0; i < array1.length; i++)
      {
      System.out.println("Value " +(i + 1));
      System.out.print("\t\tArray 1: " +array1[i]);
      System.out.print("\t\tArray 2: " +array2[i]);
      System.out.print("\t\tArray 3 : " +array3[i]);
      System.out.println(" ");
      }
      
      
      
      }
      
      }