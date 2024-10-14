package May5_2024.Polymorphism.OverloadingInterview;
class Abcd {
    void m1(String x){
        System.out.println("One");
    }
}
class Bcde extends Abcd {

}
 class Test{

}
public class QA18 {
    public static void main(String[] args){
        Abcd a = new Bcde();
        // a.m1(new Abcd());
        a.m1("sjg");
    }
}


