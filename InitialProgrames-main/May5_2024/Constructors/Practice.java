package May5_2024.Constructors;
  /** class to know about constructors

 definition ==> constructors are the special type of methods which are used for object initialization
                    and initializes variables of class as default values
           this() => always refers to same class methods/constructors
           super() =>always refers to parent class methods/constructors */
class ConstructorTest{
    //1) same name as that of class name
    //2) no return type
    //3) constructor overloading is possible but constructor overriding is not possible

     ConstructorTest(){               // default constructor
        this(5);
        System.out.println("default constructor in constructorTEst class ");
    }
    ConstructorTest(int a){     // parameterized constructor
        this(4,5);
        System.out.println("parameterized constructor with one parameter in  constructorTest class");
    }
    ConstructorTest(int a,int b){
        System.out.println("parameterized constructor with two parameter constructorTest classg");
    }
}
public class Practice extends ConstructorTest{
//   @Override      => constructor overriding is not possible
//    ConstructorTest(){
//       System.out.println("not possible");
//    }

    Practice(){
        this(5);
        System.out.println("default constructor in practice class ");
    }
    Practice(int a){
        this("java");
        System.out.println("parameterized constructor one parameter");
    }
    Practice(String a){

        System.out.println("parameterized constructor with string parameter");
    }
    // Constructor chaining => calling one constructor to another constructor w.r.t current object

    public static void main(String[] args){
        Practice obj=new Practice();
        // As soon as we create object of class default constructor get called automatically
    }
}
