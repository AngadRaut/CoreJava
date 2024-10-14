package May5_2024.ConditionalStatements;
import java.util.Scanner;

class SalaryInterestFind{
    void Salary(){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your salary");
        double salary=obj.nextDouble();
        double tax;
        if(salary<=10000){
            System.out.println("No tax ");
        }
        else if(salary>10000 && salary<=100000){
            tax=salary*0.7;
            System.out.println("with 7% of interest we have to paid rs = "+tax);
        }
        else if(salary>100000 && salary<=1000000){
            tax=salary*0.15;
            System.out.println("with 15 % of interest we have to paid rs = "+tax);
        }
        else if(salary>1000000){
            tax=salary*0.25;
            System.out.println("with 25% of interest we have to paid rs = "+tax);
        }
    }
}
public class SalaryInterest {
    public static void main(String[] args){
        SalaryInterestFind obj = new SalaryInterestFind();
        obj.Salary();
    }
}
