package ForLoop;

import java.util.Scanner;

public class FactorialOfNo {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("enter the number,you want to find factorial");
        int no=d.nextInt();
        int fact=1;
        for(int i=1;i<=no;i++){
             fact = fact*i;
        }System.out.println("factorial of "+no+" is="+fact);

    }
}