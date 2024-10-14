package May5_2024.Polymorphism.OverloadingInterview;

class Dummy {
    void m1(Dummy a){
        System.out.println("m1 method in class A");
    }
}
class B extends Dummy {
    public void m1(Dummy a){
        System.out.println("m1 method in class B");
    }
}
public class Q16 {
    public static void main(String[] args){
        Dummy a = new Dummy();
        a.m1(a);
        a.m1(new B());

        B b = new B();
        b.m1(null);

        a = b;
        a.m1(null);
        a.m1(new Dummy());
    }
}
