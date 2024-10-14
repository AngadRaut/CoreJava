package ForLoop;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        int n, i, sum = 0;
        System.out.println("Enter range");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        if (n % 2 == 0) {
            for (i = 0; i <= n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println("sum of even numbers is=" + sum);

        }
       else {
            for (i = 0; i <= n; i = i + 1) {
                sum = sum + i;
            }
            System.out.println("sum of odd numbers is=" + sum);


        }
}
}