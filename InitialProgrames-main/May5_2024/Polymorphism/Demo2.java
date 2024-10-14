package May5_2024.Polymorphism;

import java.util.Scanner;

public class Demo2 {
         void stringAddition(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first string");
            String name= sc.nextLine();
            System.out.println("Enter second string");
            String name2=sc.nextLine();

            String add=name+name2;
             System.out.println("New String = "+add);
    }

    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        obj.stringAddition();
    }
}
