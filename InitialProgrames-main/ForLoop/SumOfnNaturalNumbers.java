package ForLoop;

import java.util.Scanner;

public class SumOfnNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the last no upto which you want to sum");
        Scanner n = new Scanner(System.in);
        int N=n.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++){
            sum = sum+i;
        }
        System.out.println("sum= "+sum);
    }

}
