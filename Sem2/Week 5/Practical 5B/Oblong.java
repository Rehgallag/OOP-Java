/**
	An Oblong has a width and a height
*/
public class Oblong
{
    // the attributes are declared first
   private double width;
   private double height;

    // then the methods
	
	
    // the next method allows us to get the width attribute
	 /**
		Gets the width of the oblong
		@return  the width
	*/
   public double getWidth()
   {
      return width;
   }

    // the next method allows us to get the height attribute
	 /**
		Gets the height of the oblong
		@return  the height
	*/
   public double getHeight()
   {
      return height;
   }

    // the next method allows us to set to the width attribute
	 /**
		Sets the width of the oblong.
		@param widthIn the length
	*/
   public void setWidth(double widthIn)
   {
      width = widthIn;
   } 

    // the next method allows us to set to the height attribute
	  /**
		Sets the height of the oblong.
		@param heightIn the height
	*/

   public void setHeight(double heightIn)
   {
      height = heightIn;
   }

    // this method returns the area of the oblong
	  /**
		Calculates the area of the oblong
		@return  the area of the oblong
	*/

   public double calculateArea()
   {
      return width * height;
   }
    
   // this method returns the perimeter of the oblong
	  /**
		Calculates the perimeter of the oblong
		@return  the perimeter of the oblong
	*/
 
   public double calculatePerimeter(){
      return ((width*2)+(height*2));
   }
   
   public boolean isSquare(){
      if(height == width){
         return true;
      }
      else{
         return false;
      }
   }
   
   public void growOb(double change1, double change2){
      height = height + change1;
      width = width + change2;
   }
   
   public double getDiag(){
      return Math.round(Math.sqrt(Math.pow(height,2)+Math.pow(width,2)));
   }
}