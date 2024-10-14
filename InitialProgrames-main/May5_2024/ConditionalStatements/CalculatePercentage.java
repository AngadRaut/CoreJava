package May5_2024.ConditionalStatements;
import java.util.Scanner;
public class CalculatePercentage {
    void percentage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your 10th marks u have got in subjects Marathi,Hindi,\nEnglish,Science and Tech," +
                "Mathematics,Social science respectively");
        int M = sc.nextInt();
        int H = sc.nextInt();
        int E = sc.nextInt();
        int ST = sc.nextInt();
        int Math = sc.nextInt();
        int SS = sc.nextInt();

        float totalmarks=M+H+E+ST+Math+SS;
        System.out.println("your total marks are "+totalmarks);
        float percentage=(totalmarks/600)*100;
        System.out.println("your 10th percentage is = "+percentage);
    }
        public static void main (String[] args){
        CalculatePercentage obj=new CalculatePercentage();
        obj.percentage();
        }
}

