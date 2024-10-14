package May5_2024.Practice;

import java.util.Scanner;

public class IfElse {
    public static void main(String [] args){
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age=dc.nextInt();
        if(age>18) {
            System.out.println("Type true if you have voter id otherwise type false");
            boolean voterId=dc.nextBoolean();
            if(voterId==true){
                System.out.println("Eligible for voting");
            }else {
                System.out.println("not eligible for voting");
            }
        }else {
            System.out.println("not eligible for voting");
        }


    }
}
