package ForLoop;

import java.util.Scanner;

public class PrintNo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the limit");
        int no=obj.nextInt();
        int sum=0;
//        for (int i=0;i<=no;i++){
//            System.out.print(i+" ");
//        }
//        int i=0;
//        while(i<=no){
//            System.out.println(i);
//            i++;
//        }
//        int i=0;
//        do {
//            System.out.println(i);
//            i++;
//        }while(i<=no);


//        int i=0;
//        do{
//            if(i%2==0){
//                System.out.println(i);
//                i++;
//            }
//        }while(i<=no);

        // Even Numbers
//        for(int i=0;i<=no;i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
       // int i=0;
//        while(i<=no){
//            if(i%2==0){
//                System.out.println(i);
//            }
//            i++;
//        }
//        do{
//            if (i%2==0){
//                System.out.println(i);
//            }
//            i++;
//        }while(i<=no);

        /**  Sum of natural numbers  */
        //use for loop
//        for (int i=1;i<=no;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);

//        //Use while loop

//        int i=1;
//        while(i<=no){
//            sum=sum+i;
//            i++;
//        }
//        System.out.println(sum);

        //use do while loop
//        int i=1;
//        do{
//            sum=sum+i;
//            i++;
//        }while (i<=no);
//        System.out.println(sum);

        /**  Table of given number  */

        // use for loop
//        int product=0;
//        for (int i=1;i<=10;i++){
//            product=no*i;
//            System.out.println(no+"*"+i+"="+product);
//        }

        // use while loop
        int i=1;
        int product=0;
//        while(i<=10){
//            product=no*i;
//            System.out.println(no+"*"+i+"="+product);
//            i++;
//        }

          // use do while loop
        do {
            product=no*i;
            System.out.println(no+"*"+i+"="+product);
            i++;
        }while(i<=10);
   }
}
