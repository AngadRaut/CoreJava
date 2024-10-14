package AbstractionClassPractice.InterfacePractice;
abstract class DDD
{
   abstract  int add();
}
abstract class AA
{
    abstract double product();
}
class Child extends DDD
{

    @Override
    int add()
    {
        System.out.println("ADD");
        return 0;
    }
}
class Child2 extends DDD
{

    @Override
    int add()
    {
        return 0;
    }
}
public class Practice  {
    public static void main(String[] args) {
        Practice objj = new Practice();

    }
}
