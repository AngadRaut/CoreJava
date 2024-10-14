package Polymorpism.MethodOverloading;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Parent{
    public void method(){
        System.out.println("parent class method");
    }
    public void method(int c,double d){
        System.out.println("fiufnsusi iufrkj");
    }
}
public class MethodOverloadingExtend extends Parent {
    public void method(){
        System.out.println("child class method");
    }

        void primeNo(){
            Scanner obj = new Scanner(System.in);
            System.out.println("enter the no");
            int no=obj.nextInt();
            int temp=0;
            for(int i=2;i<no;i++){
            if (no%i==0){
                temp = temp+1;
            }
            }
            if(temp>0){
                System.out.println(no+" is not prime no");
            }else{
                System.out.println(no+" is  prime no");
            }

    }
    public static void main(String[] args){
        MethodOverloadingExtend obj = new MethodOverloadingExtend();
       // obj.method(2,"rr");
      //  obj.method(4,54543434343434L);
        //obj.method(2,"dd");

        obj.primeNo();
    }
}
