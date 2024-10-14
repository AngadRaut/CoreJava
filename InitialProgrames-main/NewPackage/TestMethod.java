package NewPackage;
 abstract class Aaaff{
    abstract void m1();
}
class Baagg extends Aaaff {
    void m1(){
        System.out.println("One");
    }
}
public class TestMethod {
    public static void main(String[] args) {
        Baagg b = new Baagg();
        b.m1();
    }
}
