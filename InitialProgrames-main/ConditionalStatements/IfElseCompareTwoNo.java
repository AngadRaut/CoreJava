package ConditionalStatements;

import java.util.Scanner;

public class IfElseCompareTwoNo {
    public static void main(String[] args){
        int a;
        int b;
        System.out.println("Enter two numbers");
        Scanner t = new Scanner(System.in);
        a = t.nextInt();
        b = t.nextInt();

        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else{
            System.out.println(b+" is greater than "+a);
        }
    }
}
