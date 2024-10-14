package May5_2024.Constructors;

class Test
{
    static int a;

    static
    {
        a = 4;
        System.out.println ("inside static block\\n");
                System.out.println ("a = " + a);
    }
    Test()
    {
        System.out.println ("inside constructor");
                a = 10;
        System.out.println("value of a="+a);
    }
    public static void func()
    {
        a = a + 1;
        System.out.println ("inside func method a = " + a);
    }
    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.func();
    }
}
//Static blocks are called before constructors. Therefore, on object creation of class Test,
// static block is called. So, static variable a = 4. Then constructor Test() is called which assigns a = 10.
// Finally, function func() increments its value.
public class PracticeProblem{

}
