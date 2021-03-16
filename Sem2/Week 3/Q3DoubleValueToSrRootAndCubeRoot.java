import java.util.*;

public class Q3DoubleValueToSrRootAndCubeRoot{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double num1;
        
        System.out.print("Please enter a double value: ");
        num1 = in.nextDouble();

        getSqRoot(num1);

        getCubeRoot(num1);
    }

    public static void getSqRoot(double n1){

        System.out.println("Square root: " + Math.sqrt(n1));
    }

    public static void getCubeRoot(double n1){

        System.out.println("Cube root: " + Math.cbrt(n1));
    }

}