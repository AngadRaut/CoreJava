package May5_2024.Loops;
// import scanner class for input
import java.util.Scanner;

class For {
    // print natural numbers up-to given limit
    void printNo() {
        // Using scanner class take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        // saving value in Variable limit which is integer type input
        int limit = sc.nextInt();
        // for loop to check condition
        for (int i = 0; i <= limit; i++) {
            System.out.println("numbers up-to " + limit + " are= " + i);
        }
    }

    // add numbers up-to given limit
    void addNo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int lim = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= lim; i++) {
            sum = sum + i;
        }
        System.out.println("sum up-to " + lim + " is = " + sum);
    }

    // program to print and find how many  odd numbers up-to given limit
    void oddNo() {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the limit");
        int lim = SC.nextInt();
        int count = 0;
        for (int i = 1; i <= lim; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total odd Numbers upto " + lim + " = " + count);
    }

    // program to print and find how many even numbers in given limit
    void evenNo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int lim = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= lim; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("even numbers upto " + lim + "are = " + count);
    }

    // Programme to find the factorial of number
    void factorial() {
        int fact = 1;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number");
        int no = obj.nextInt();
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of no is = " + fact);
    }

    // programme to print table of given no
    void table() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to print its table");
        int a = sc.nextInt();
        int table;
        for (int i = 1; i <= 10; i++) {
            table = a * i;
            System.out.println(a + "*" + i + "=" + table);
        }
    }

    // programme to find numbers divisible by any no from given limit
    void div() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int no = sc.nextInt();
        System.out.println("enter thr limit to find numbers divisible by " + no);
        int lim = sc.nextInt();
        for (int i = 0; i <= lim; i++) {
            if (i % no == 0) {
                System.out.println(i);
            }
        }
    }
// Numbers which are divisible by both 3 and 7
    void dummy() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    // programme to print alphabets a to z
    void alphabets() {
        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.println(a);
        }
    }
    // programme to find the power given no
    void power(){
        double power=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find its power");
        int no=sc.nextInt();
        System.out.println("Enter the power you want to calculate for given number");
        int p=sc.nextInt();
        for(int i=1;i<=p;i++){
            power = power*no;
         }
        System.out.println(power);
    }

    // prime numbers
    void primeNo() {
        int temp = 0;
        int no = 7;
        for (int i = 2; i <= no; i++) {
                temp = temp + i;
        }
            if (temp > 0) {
                System.out.println("not prime ");
            } else {
                System.out.println("prime no");
            }
        }
    }
public class ForLoop {
    public static void main(String[] args) {
        For obj = new For();
        obj.power();
    }
}
