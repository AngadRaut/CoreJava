package May5_2024.Polymorphism.RunTimePol;
class Parent1{
    void m1(){
        System.out.println("parent1 class method");
    }
}
class Parent2 extends Parent1{
    @Override
     final void m1(){
        //super.m1();
        System.out.println("parent2 class method");
    }
}
class Parent3 extends Parent1{
    @Override
    void m1(){
        super.m1();
        System.out.println("parent3 class method");
    }
}
public class OveloadingAndOverriding {
    public static void main(String[] args){
        Parent3 obj = new Parent3();
        obj.m1();

        Parent2 obj1 = new Parent2();
        obj1.m1();
    }
}
