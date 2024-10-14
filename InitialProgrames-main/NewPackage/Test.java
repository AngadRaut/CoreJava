package NewPackage;
 abstract class Ann {
    abstract void m1();
}
 class Bnn extends Ann {
    void m1() {
        System.out.println("One");
    }
}
class Cnn extends Ann{
    void m1() {
        System.out.println("Two");
    }
}
public class Test {
    public static void main(String[] args) {
        Cnn h = new Cnn();
        h.m1();
        Bnn n = new Bnn();
        n.m1();


    }
}

