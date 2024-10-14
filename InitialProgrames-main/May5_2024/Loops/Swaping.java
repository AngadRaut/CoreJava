package May5_2024.Loops;
import java.util.Scanner;

// swapping of two numbers
class Swap{
    //swapping of two numbers without using third variable
    void swap(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two numbers a and b respectively");
        int a=obj.nextInt();
        int b=obj.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping values are a = "+a+ "b = "+b);
    }
    // swapping of two numbers using third variables
    void swap1(){

        //take input from user
        Scanner obj=new Scanner(System.in);
        // printing msg on output string
        System.out.println("Enter two numbers a and b respectively");
        // accepting values in a and b variables
        int a=obj.nextInt();
        int b=obj.nextInt();

        // declaring third variable
        int c;
        c=a;   // if a=10 here c=10 assigned
        a=b;    // if b=20 here a becomes a=20
        b=c;    // c=10 then b=10

        System.out.println("after swapping values of a is = "+a+" and b = "+b);
    }
}
public class Swaping {
    public static void main(String[] args) {
        Swap obj = new Swap();
        obj.swap1();
    }
}
