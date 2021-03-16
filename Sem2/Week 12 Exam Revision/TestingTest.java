public class TestingTest
{
   public static void calculateAndPrintWages(int h, double r)
{
   double wages = 0.0;
   if (h > 38)
   {
      wages = (38 * r) + ((h-38) * r * 1.5);
   }
        else 
   {
      wages = h * r;
   }
   
   System.out.println("Wages are " + wages);
}
}