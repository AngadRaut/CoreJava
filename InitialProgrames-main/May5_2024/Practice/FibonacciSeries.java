package May5_2024.Practice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        int no = 10;
        System.out.print(a + " " + b);
        for (int i = 1; i <= no; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}

