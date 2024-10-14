package May5_2024.ConditionalStatements;

import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        System.out.println("enter voter id true and false");
        boolean voterId = sc.nextBoolean();
        if(age>=18){
           if(voterId==true){
               System.out.println("eligible for voting");
            }
           else{
               System.out.println("not eligible for voting");
           }
        }
    }
}



