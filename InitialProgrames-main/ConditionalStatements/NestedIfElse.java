package ConditionalStatements;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args){
        int a;
        System.out.println("Enter the number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();

        if(a%2==0){
            System.out.println(a+" is Even number");
        }else{
            System.out.println(a+" is Odd number");
        }
        if(a>=0){
            System.out.println(a+" is positive integer");
        }else{
            System.out.println(a+" is negative number");
        }
    }
}
