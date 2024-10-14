package NewPackage;
 abstract class Ssd{
     abstract void m1();
}
class Baba extends Ssd{
    @Override
    void m1(){
        System.out.println("Method m1 ");
    }
}
public class AbstractClassQ28 {
    public static void main(String[] args) {
        Baba d = new Baba();
        d.m1();
    }
}
