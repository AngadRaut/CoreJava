package NewPackage;

import java.util.Scanner;

public class VowelInString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the string");
       // String name=obj.toString();
        char name=obj.next().charAt(0);
        if(name=='a'||name=='e'||name=='i'||name=='o'||name=='u'){
            System.out.println("vowel");
        }
        System.out.println("cansonant");

    }
}
