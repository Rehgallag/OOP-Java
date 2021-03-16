import java.util.*;

public class Q4FindHypotenuse{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a, b;

        System.out.print("Please enter side 1: ");
        a = in.nextDouble();

        System.out.print("Please enter side 2: ");
        b = in.nextDouble();

        getHypotenuse(a, b);

    }

    public static void getHypotenuse(double a, double b){
        System.out.println("Hypotenuse " + (Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)))));

    }
}