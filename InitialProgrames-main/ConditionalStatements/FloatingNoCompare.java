package ConditionalStatements;

import java.util.Scanner;

public class FloatingNoCompare {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two floating values");
        double a=obj.nextDouble();
        double b =obj.nextDouble();
        a=Math.round(a*1000);
        b=Math.round(b*1000);
        System.out.println(a + " "+b);
        a=a/1000;
        b=b/1000;
        System.out.println(a+" "+b);
        if(a==b){
            System.out.println("Numbers are equal");
        }else{
            System.out.println("Numbers are not equal");
        }
    }
}
