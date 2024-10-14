package May5_2024.Polymorphism.RunTimePol;

/** 5) A method declared Final method can not be overriden
 *  6) A method declared Static cannot be overriden but can be re-declare */


class Dummy123{
     void dummy123(){
        System.out.println("final method");
    }
     static void show1(){
        System.out.println("show method");
    }
}
public class Rule5And6 extends Dummy123 {
    @Override
    final void dummy123(){
        System.out.println("dummy123 method in child class");
    }
   // @Override
    static void show1(){
        System.out.println("show1 method in child class");
    }
}
