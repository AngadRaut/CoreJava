package May5_2024.Polymorphism.OverloadingInterview;

class Abcde {
    void m1(Abcde a){
        System.out.println("m1 method in class A");
    }
}
class Bcdef extends Abcde {
    public void m1(Abcde a){
        System.out.println("m1 method in class B");
    }
}
 class Test1234{

}
public class Problem17QA {
    public static void main(String[] args){
        Abcde a = new Abcde();
        a.m1(a);
        a.m1(new Bcdef());

        Bcdef b = new Bcdef();
        b.m1(null);

        a = b;
        a.m1(null);
        a.m1(new Abcde());
    }
}
