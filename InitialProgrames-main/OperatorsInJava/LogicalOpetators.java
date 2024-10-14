package OperatorsInJava;

import java.util.Scanner;

public class LogicalOpetators {
    public static void main(String[] args){
        int a;
        int b;
        int c;
        System.out.println("Enter three numbers");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        c = r.nextInt();
        if(a>b && a>c ){
            System.out.println(a+ "is largest number");
        }else if(b>a && b>c){
            System.out.println(b+" is largest number");
        }else if(c>a && c>b){
            System.out.println(c+" is the largest number");
        }
    }
}

