package May5_2024.Polymorphism.OverloadingInterview;


class QA19Class {
    void m1(Object obj){
        System.out.println("One");
    }
}
class QA extends A {
    void m1(Object obj){
        super.m1(null);
        System.out.println("Two");
    }
    void m2(Object obj){
        System.out.println("Three");
        this.m1(null);
    }
}
 class Test19{

}
public class QA19 {
    public static void main(String[] args){
        QA19Class a = new QA19Class();
        a.m1(new A());

        QA b = new QA();
        b.m2(new B());
    }

}
