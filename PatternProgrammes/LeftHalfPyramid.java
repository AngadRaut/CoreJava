package PatternProgrammes;

import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows");
        int rows=sc.nextInt();
        System.out. print("Enter no of coulmns");
        int columns=sc.nextInt();

        for (int i=1;i<=rows;){
            i++;//printing rows
            for (int j=1;j<=i;j++){
                //printing colums
                System.out.print("* ");

            }
            System.out.println("");  //spacing in between rows
        }
    }
}
