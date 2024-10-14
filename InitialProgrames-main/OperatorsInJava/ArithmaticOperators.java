package OperatorsInJava;

import java.util.Scanner;

public class ArithmaticOperators {
    public static void main(String[] args){
        double a;
        double b;
        System.out.println("Enter two numbers");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();

        System.out.println("Addition= "+(a+b));
        System.out.println("Substraction="+(a-b));
        System.out.println("Multiplication ="+(a*b));
        System.out.println("Division a/b ="+(a/b));

    }
}
