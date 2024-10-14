package AbstractionClassPractice.InterfacePractice;
interface Method1
{
    void method1();
    void method2();
}
interface Method3
{
    void method3();
}
public class Methods implements Method1,Method3{
    @Override
    public void method1() {
        System.out.println("method 1 is implemented");
    }

    @Override
    public void method2() {
        System.out.println("method 2 is implemented");

    }

    @Override
    public void method3() {
        System.out.println("method 3 is implemented");

    }

    public static void main(String[] args) {
        Methods objj = new Methods();
        objj.method1();
        objj.method2();
        objj.method3();
    }
}
