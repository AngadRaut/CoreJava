package AbstractionClassPractice.InterfacePractice;
interface A
{
    void a();
    void aa();
}
interface B extends A
{
    void b();
}
interface C extends B
{
    void c();
}
abstract class D implements C
{
    abstract void d();
}
public class InterfaceTest extends D{

    @Override
    public void a()
    {
        System.out.println("Interface A, a method");

    }

    @Override
    public void aa()
    {
        System.out.println("Interface A, aa method");

    }

    @Override
    public void b()
    {
        System.out.println("Interface B");

    }

    @Override
    public void c()
    {
        System.out.println("Interface C");

    }
    @Override
    void d()
    {
        System.out.println("Interface D");

    }

    public static void main(String[] args) {
        InterfaceTest objj = new InterfaceTest();
        objj.a();
        objj.aa();
        objj.b();
        objj.c();
        objj.d();
    }
}
