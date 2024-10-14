package ConditionalStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCondition {
    public static void main(String[] args){
        double a=20,b=30;
        int ch;
        System.out.println("Enter your choice, 1=Additin,2=Substraction,3=mul,4=div,5=Square root of a," +
                "6=Square root of b,");
        Scanner r = new Scanner(System.in);
        ch = r.nextInt();
        switch (ch){
            case 1:
                System.out.println("a+b = "+(a+b));
            break;
            case 2:
                System.out.println("a-b = "+(a-b));
                break;
                case 3:
            System.out.println("a*b = "+(a*b));
            break;
            case 4:
                System.out.println("a/b = "+(a/b));
                break;
            case 5:
                System.out.println("square root = "+Math.sqrt(a));
                break;
            case 6:
                System.out.println("square root="+Math.sqrt(b));
                default:
                    System.out.println("choice not more than 4");

        }
    }
}
