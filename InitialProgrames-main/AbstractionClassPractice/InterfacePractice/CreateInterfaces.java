package AbstractionClassPractice.InterfacePractice;

interface Test1
{
    void test1();
}
interface Test2
{
    void test2();

}
interface Test3
{
    void test3();
}
abstract class Test implements Test1
{
    void re()
    {
        System.out.println("Test");
    }

}
public class CreateInterfaces extends Test implements Test1,Test2,Test3
{
    @Override
    void re()
    {
        System.out.println("abstract class method re");
    }

    @Override
    public void test2()
    {
        System.out.println("test2");

    }

    @Override
    public void test1()
    {
        System.out.println("test1");

    }

    @Override
    public void test3()
    {
        System.out.println("test3");

    }

    public static void main(String[] args) {
        CreateInterfaces obj = new CreateInterfaces();
        obj.test1();
        obj.test2();
        obj.test3();
        obj.re();
    }
}
