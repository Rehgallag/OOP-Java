import java.util.*;

public class Q5ProveRightAngledTriangle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a, b, c;

        System.out.print("Please enter side 1: ");
        a = in.nextDouble();

        System.out.print("Please enter side 2: ");
        b = in.nextDouble();

        System.out.print("Please enter longest side: ");
        c = in.nextDouble();

        proveRightAngled(a, b, c);
    }

    public static void proveRightAngled(double a, double b, double c){
        double proof;
        
        proof = (Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2))));

        if(proof == c){
            System.out.println("Is this right angled: true");
        }
        else{
            System.out.println("Is this right angled: false");
        }

    }
}

/*
Scanner in = new Scanner(System.in);
        double a, b, c;

        System.out.print("Please enter side 1: ");
        a = in.nextDouble();

        System.out.print("Please enter side 2: ");
        b = in.nextDouble();

        System.out.print("Please enter longest side: ");
        c = in.nextDouble();

        proveRightAngled(a, b, c);
    }

    public static void proveRightAngled(double a, double b, double c){
        double proof;
        
        proof = (Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2))));

        if(proof == c){
            System.out.println("Is this right angled: true");
        }
        else{
            System.out.println("Is this right angled: false");
        }*/