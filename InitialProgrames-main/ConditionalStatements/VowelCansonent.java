package ConditionalStatements;

import java.util.Scanner;

public class VowelCansonent {
    public static void main(String[] args) {


        Scanner ad = new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        char ch=ad.next().charAt(0);
        boolean b = ch == 'u';
        if (ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
            System.out.println(ch+ " is vowel");
        }
        else{
            System.out.println(ch+"is cansonant");
        }
    }
}