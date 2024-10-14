package AccessModifier;
class Test {
     void test() {
        System.out.println("Test method");
    }

    void display() {
        System.out.println(" Display Method");
    }
}
public class PrivateAccessModifier extends Test {
    public static void main(String[] args) {
        PrivateAccessModifier f = new PrivateAccessModifier();
        f.display();
        f.test();

    }
}
