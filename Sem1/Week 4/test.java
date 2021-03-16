import java.util.Scanner;

public class test
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
int age;
	 System.out.print("enter age: ");
       age = in.nextInt();
 

if(age < 12)
{

  System.out.println("Half price");
}
System.out.println("Enjoy the show");
else
{
  System.out.println("Full price");
}
 

   }
}