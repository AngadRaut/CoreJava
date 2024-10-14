package ConditionalStatements;

import java.util.Scanner;

public class IfExample2 {
    public static void main(String[] args){
        int i;
        System.out.println("Enter the number");
        Scanner t = new Scanner(System.in);
        i=t.nextInt();
        if(i%2==0){
            System.out.println(i+" is even number");
        }
        System.out.println(i+" is odd number");
    }
}
