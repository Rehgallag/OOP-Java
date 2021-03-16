
/**
   This class is used to keep track of a students print quota
 
*/
public class PrintQuota
{
 //instance variables  
	private double amount;
	final private double PRICEPERPAGE = 0.05;
	
//methods

  
	public double getAmount()
   {
      return amount ;
   }


   public void topUp(double topUpAmt)
   {
   	amount =amount+topUpAmt;
   }

	/**
      Prints pages and decreases amount accordingly.
       noOfPages the no of pages to print
   */
	public void printPages(int noOfPages)
   {
  		if(noOfPages <= noOfPagesLeft())    //check if enough left to print the pages
			amount = amount - (noOfPages * 0.05);
			
		//don't put an else in here - check in main
   }
	
	 /**
      Returns no of pages left to print as an integer.
  		@return  noOfPages left 
   */

	public int noOfPagesLeft()
	{
		return (int)(amount / PRICEPERPAGE);  //note use of cast
	}
  

  
}
