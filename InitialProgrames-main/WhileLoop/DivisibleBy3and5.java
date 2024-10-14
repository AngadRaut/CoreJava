package WhileLoop;

import java.util.Scanner;

public class DivisibleBy3and5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the limit");
        int n=obj.nextInt();
        for(int i=0;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
