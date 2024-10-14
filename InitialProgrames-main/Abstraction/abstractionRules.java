package Abstraction;

public class abstractionRules {
//Abstraction is a process by which we show only essential part and hides
    // implementation details....
    void nonAnstractMethod(){
        System.out.println("This is non abstract method in non abstract class");
    }
  // abstract void abc();
    //   2) abstract method must be in abstract class
}

//  1) abstract and non abstract method in abstract class
abstract class abstractClass{
     void show(){
         System.out.println("second rule = abstract and non abstract method in abstract class");
     }

    abstract void ruleFirst();
     // 3) We cannot create an object of an abstract class

     public static void main(String[] args){
      // abstractClass r = new abstractClass();    // shows error

     }


}


