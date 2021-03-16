import java.util.*;
public class TestingTesterClass
{
   public static void main(String[] args)
   {
	
Scanner kb = new Scanner(System.in);
System.out.println("Please input the hours worked ");
int hours = kb.nextInt();
System.out.println("Please input the rate of pay ");
double rate = kb.nextDouble();

calculateAndPrintWages(rate, double);
   }
}