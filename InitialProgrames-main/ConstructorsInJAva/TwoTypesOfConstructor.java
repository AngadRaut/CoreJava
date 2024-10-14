package ConstructorsInJAva;

class FirstType{
    FirstType(){
        System.out.println("FirstType Default Constructoer");
    }
    public FirstType(boolean a,long b){
        System.out.println("FirstType Parameterized Constructor");
    }
}
class ChildClass extends FirstType {
    public ChildClass(int a,int b){
      super(true,4567);
        System.out.println("Parameterized constructor in ChildClass");
    }
    ChildClass(){
        System.out.println("Default constructor in Childclass");

    }
}
class A extends ChildClass {
    A(){
      super(3,5);
    }
}

public class TwoTypesOfConstructor extends ChildClass{

    public static  void main(String[] args){
        TwoTypesOfConstructor t = new TwoTypesOfConstructor();
       // FirstType f = new FirstType(true,666);

    }
}
