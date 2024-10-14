package May5_2024.Practice;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        double amount;

        double principal;

        double rate;

        System.out.println("Please Enter The Principal");
        principal = input1.nextDouble();

        System.out.println("Please Enter The Rate Of Interest In Decimal Form");
        rate = input1.nextDouble();

        System.out.println("Please Enter The Number Of Investment Years");
        Scanner input2 = new Scanner (System.in);
        int g = input2.nextInt();

        for(int year = 1; year <= g; year++){
            amount = principal * Math.pow(1 + rate, year);
            System.out.println(year + "  " + amount);

        }

    }
}
