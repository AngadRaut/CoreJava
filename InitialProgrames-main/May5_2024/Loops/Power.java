package May5_2024.Loops;
import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        int power=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter the power");
        int p=sc.nextInt();
        for(int i=1;i<=p;i++){
            power=power*n;
        }
        System.out.println(power);
    }
}
