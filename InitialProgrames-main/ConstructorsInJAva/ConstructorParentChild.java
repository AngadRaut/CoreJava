package ConstructorsInJAva;
class Parent1{
    private Parent1(){
        System.out.println("Parent1 Default Constructor");
    }
    public Parent1(int a){

    }
}
class Parents extends Parent1{
    public Parents(){
        super(2);
        // super();
        System.out.println("Parents Default Constructor");
    }
}
class Child extends Parents{
    Child(){
       // super();
        System.out.println("Child default constructor");
    }

}
public class ConstructorParentChild extends Child {
    private ConstructorParentChild(){
       // super();
        System.out.println("ConstructorParentChild dwfault constructor");

    }
    public static void main(String[] args) {
        ConstructorParentChild b = new ConstructorParentChild();
    }

}
