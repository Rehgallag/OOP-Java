import java.util.Scanner;
/**
   This is a simple tester class for PrintQuota class.
*/
public class PrintQuotaTester
{
   public static void main (String[] args)
   {
      Scanner keyIn = new Scanner(System.in);
      
		//create PrintQuota object quota
		PrintQuota quota = new PrintQuota();
		
		System.out.println("Initial Quota: "  +quota.getAmount());
	
		//set rate
		quota.topUp(10);
		
		//print some pages
		quota.printPages(100);
		System.out.println("after printing 100: € " +quota.getAmount());  //should be 5

		
		System.out.println("No of pages left to print: "+quota.noOfPagesLeft());  //should be 100
		
		//what happens if I try to print more than 100
		//print some pages
		quota.printPages(200);
		System.out.println("after printing 200: € " +quota.getAmount());  //oh dear -5

		
		System.out.print("No of pages left to print: "+quota.noOfPagesLeft());  //oh dear -100
		 //deal with these issues 
           
	}
}
