import java.util.*;

public class Q1RoundUpDoubleValue{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double num1;
        
        System.out.print("Please enter a double number: ");
        num1 = in.nextDouble();
        
        roundUp(num1);
        
    }

    public static void roundUp(double n1){
        
        System.out.println("Rounded up: " + Math.ceil(n1));
        System.out.println("Rounded down: " + Math.floor(n1));
        System.out.println("Rounded to the nearest whole number: " + Math.rint(n1));
        
    }
    
}
/*
Q2 asks to print the value rounded down to a whole number and rounded to the nearest whole number
Please enter a double value: 12.51
Rounded up: 13.0
Rounded down: 12.0
Rounded to the nearest whole number: 13.0
*/