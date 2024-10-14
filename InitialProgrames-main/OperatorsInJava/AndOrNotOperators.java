package OperatorsInJava;

public class AndOrNotOperators {
    public static void main(String[] args){
        boolean x = true;
        boolean y = false;
        int a=10;
        int b=20;
        System.out.println("!x="+(!x));      //false
        System.out.println("!y="+(!y));       //true
        System.out.println("x&&y="+(x&&y));     //false
        System.out.println("x||y="+(x||y));    //true

    }
}
