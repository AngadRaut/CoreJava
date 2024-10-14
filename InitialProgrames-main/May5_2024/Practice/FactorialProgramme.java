package May5_2024.Practice;
import java.util.Scanner;
class Factorial{
    public void factorial(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int no=sc.nextInt();
        int fact=1;
        for(int i = 1; i<=no; i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
public class FactorialProgramme {
    public static void main(String[] args){
        Factorial fact=new Factorial();
        fact.factorial();

    }
}
