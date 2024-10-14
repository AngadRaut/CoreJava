package May5_2024.Loops;
import java.util.Scanner;

class While{
    void naturalNo(){
        int lim=0;
        while(lim<=100){
            if(lim%2==0){
                System.out.println(lim);
            }
            lim++;
        }
    }
    // programme to print alphabets from a to z
    void aToZ(){
        char a='A';
        while(a<='Z'){
            System.out.println(a);
            a++;
        }
    }
    // program to find digits in given number
//    void findDigit(){
//        int count=0;
//        Scanner obj = new Scanner(System.in);
//        System.out.println("enter the number");
//        double no=obj.nextDouble();
//        while(no>0){
//         no=no/10;
//         count++;
//        }
//        System.out.println(count);
//    }
    // sum of digits in given number
    void sumDigit(){
        int r;
        int sum=0;
        int no=5555;
        while(no>0){
            r=no%10;
            sum=sum+r;
            no=no/10;
        }
        System.out.println();
    }
}
public class WhileLoop {
    public static void main(String[] args){
        While obj = new While();

    }
}

