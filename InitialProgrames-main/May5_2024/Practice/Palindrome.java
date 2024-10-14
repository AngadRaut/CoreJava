package May5_2024.Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
        System.out.println("enter the string");
        String name=sc.nextLine();
        int length=name.length();
        for(int i=0;i<=length/2;i++){
            if(name.charAt(i)!=name.charAt(-i-1)){
                System.out.println("string is not palidrome");
            }
            else {
                System.out.println("palidrome");
            }
        }
    }
}
