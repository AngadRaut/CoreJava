package Package01;

public class Package1Class2 extends Package1Class  {
    public static void main(String[] args) {
        Package1Class2 a = new Package1Class2();
        a.defaultMethod();
        a.protectedMethod();
        a.publicMethod();
       // a.privateMethod();    //Private method has private access cannot access in sub class of same package
    }
}
