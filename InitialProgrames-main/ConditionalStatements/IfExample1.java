package ConditionalStatements;

import java.util.Scanner;

public class IfExample1 {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number");
        Scanner r = new Scanner(System.in);
        a=r.nextInt();
        if(a>=0){
            System.out.println(a+" is positive integer");
        }
        System.out.println(a+" is negative number");
    }
}
