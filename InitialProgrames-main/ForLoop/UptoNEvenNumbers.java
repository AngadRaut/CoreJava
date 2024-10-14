package ForLoop;

import java.util.Arrays;
import java.util.Scanner;

public class UptoNEvenNumbers {
    public static void main(String[] args) {
        int i,sum=0;
        System.out.println("enter the limit of even number");
        Scanner n = new Scanner(System.in);
        double N = n.nextInt();

        for (i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum=sum+i;

            }

        }
        System.out.println("even = "+sum+"\n");
        Arrays[] A =new Arrays[i];
        System.out.println("numbers = "+A.length);



      //  int sum1 = 0;
//        for(int i=0;i<=N;i++){
//            if(i%2!=0){
//                System.out.println(i);
//                sum1=sum1+i;
//            }
//        }
//        System.out.println("odd = "+sum1);
   }
}
