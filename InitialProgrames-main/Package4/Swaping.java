package Package4;

import java.util.Scanner;

class Swap{
    int a=10;
    int b=29;
    int temp;
    void add(){
        temp=a;
        a=b;
        b=temp;
        System.out.println("swap values " +a+" and "+b);
    }
}
class SumOfDigits{
    /**using while loop*/
    void digitSum(){
        int sum=0;
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int no=sc.nextInt();
        while(no>0){
          temp=no%10;
          sum=sum+temp;
          no=no/10;
        }
        System.out.println(sum);
    }

}
class ForDigitSum{
    int sum=0;
    int temp;
   void PrimeNo(){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the no");
       int n=sc.nextInt();
       int temp=0;
       for(int i=2;i<n;i++){
           temp=temp+i;
       }
}
public class Swaping {
}

    public static void main(String[] args) {
        Swap obj = new Swap();
        obj.add();

        SumOfDigits obj2=new SumOfDigits();
        obj2.digitSum();



    }
}
