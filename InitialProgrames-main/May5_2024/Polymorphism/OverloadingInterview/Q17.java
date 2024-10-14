package May5_2024.Polymorphism.OverloadingInterview;
class Abc {
    void m1(String x){
        System.out.println("One");
    }
}
class Bcd extends Abc {
    public void m1(String x){
        super.m1("ggfg");
        System.out.println("Two");
        super.m1(null);
    }
}
public class Q17 {
    public static void main(String[] args) {
        Bcd a = new Bcd();
        a.m1("gg");
    }
}