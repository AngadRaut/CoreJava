package WhileLoop;

import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {
        int i=0;
        Scanner a = new Scanner(System.in);
        System.out.println("enter the limit");
        int n =a.nextInt();
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
