package PatternProgrammes;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any no : ");
        int no=obj.nextInt();
        int temp=0;
        for(int i=2;i<no;i++){
            if(no%i==0){
                temp=temp+i;
            }
        }
        if (temp>0) {
            System.out.println(no+" is not prime");
       } else {
            System.out.println(no+"is prime");
        }
    }
}