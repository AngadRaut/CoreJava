package ConditionalStatements;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args){
        double a;
        double b;
        char op;
        System.out.println("Enter the two numbers");
        Scanner r = new Scanner(System.in);
        a=r.nextDouble();
        b=r.nextDouble();

        System.out.println("Enter the operation you want to achive '+','-','*','/'" );
        op =r.next().charAt(0);
        double result=0;

        if(op == '+'){
            result = a + b;
            System.out.println("Addition is "+result);
        }else if(op=='-') {
            result=a-b;
            System.out.println("Substraction is "+result);
        }else if(op=='*'){
            result=a*b;
            System.out.println("Multiplication is "+result);
        }else if(op=='/'){
            result=a/b;
            System.out.println("Division is "+result);
        }

    }
}
