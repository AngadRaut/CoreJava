package May5_2024.Polymorphism.OverloadingInterview;

class Dum {
    void m1(String x){
        System.out.println("One");
    }
}
class DumChild extends Dum {
    public void m1(String x){
        System.out.println("Two");
        super.m1(null);
    }
}
 class Test2{
    public static void main(String[] args){
        Dum a = new Dum();
        a.m1(null);
    }
}
public class QA17 {
}
