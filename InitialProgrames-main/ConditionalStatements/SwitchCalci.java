package ConditionalStatements;

import java.util.Scanner;

public class SwitchCalci {
    public static void main(String[] args) {
        double a;
        double b;
        double result;
        Scanner ar = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=ar.nextDouble();
        b=ar.nextDouble();
        System.out.println("Enter the operation you want to perform" +
                "\n 1-Addition, 2-Subtraction, 3-Multiplication, 4-Division ,5-Reminder," +
                "6-maximum value among two,7-MIN value among two,\n8-factorial of a,9-factorial of b");
        int n=ar.nextInt();
        switch (n){
            case 1:
                result=a+b;
                System.out.println("Addition = "+result);
                break;
            case 2:
                result=a-b;
                System.out.println("Subtraction = "+result);
                break;
            case 3:
                result=a*b;
                System.out.println("Multiplication = "+result);
                break;
            case 4:
                result=a/b;
                System.out.println("Division = "+result);
                break;
            case 5:
                result =a%b;
                System.out.println("Reminder = "+result);
                break;
            case 6:
                System.out.println(Math.max(a,b));
                break;
            case 7:
                System.out.println(Math.min(a,b));
                break;
            case 8:
                int fact=1;
                for (int i=1;i<=a;i++){
                    fact=fact*i;
                }
                System.out.println("factorial of a is= "+fact);
                break;
            case 9:
                int fact1=1;
                for (int j=1;j<=b;j++){
                    fact1=fact1*j;
                }
                System.out.println("facorial of b is = "+fact1);
            default:
                System.out.println("Invalid Choice");
        }
    }
}