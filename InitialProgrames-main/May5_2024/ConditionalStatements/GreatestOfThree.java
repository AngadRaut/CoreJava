package May5_2024.ConditionalStatements;
import java.util.Scanner;


public class GreatestOfThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a > b && a > c){
            System.out.println(a+" is greater than "+b+" and "+c);
        } else if (b > a && b > c) {
            System.out.println(b+" is greater than "+a+" and "+c);
        }
        else if (c > a && c>b){
            System.out.println(c+" is greater than "+a+" and "+b);
        }
    }

}
