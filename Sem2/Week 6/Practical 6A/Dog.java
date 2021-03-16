/*******************************
	Written by: John Gallagher
	Date : 		
	Desc :	program to represent a Dog
	Filename:	
*****************************/
/*

*/
public class Dog
{
   //instance variables
   private String breed; 
   private int size;
   
   //methods
   public void setBreed(String str) {
      breed = str;
   }
   public String getBreed() {
      return breed;
   }
   public void setSize(int n) {
      size = n;
   }
   public int getSize() {
      return size;
   }
   public String bark() {
      if(size < 10 && size > 0) {
         return "yap, yap";
      }
      else if(size < 30 && size > 30) {
         return "bow, wow";
      }
      else if(size >= 30) {
         return "ruff, ruff";
      }
      else{
         return "invalid size";
      }
   }
   
}//end