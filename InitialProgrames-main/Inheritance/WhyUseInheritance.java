package Inheritance;
class abcd{
    void test(){
        System.out.println("method is creted");
    }
    int add(int a){
        System.out.println("parameter a given");
        return 0;
    }
}

public class WhyUseInheritance extends abcd {
    public static void main(String[] args){
        WhyUseInheritance r = new WhyUseInheritance();
        r.test();
        r.add(1);
    }

}
