package May5_2024.Polymorphism.OverloadingInterview;

class A123
{
    public A123(int i)
    {
        System.out.println(1);
    }

    public A123()
    {
        this(10);

        System.out.println(2);
    }

    void A()
    {
        A(10);

        System.out.println(3);
    }

    void A(int i)
    {
        System.out.println(4);
    }
}
public class IQuestion17 {
    public static void main(String[] args)
    {
        //new A123().A();
        A123 obj=new A123();     // 1,2 ==> default constructor get called first this used in default const.
        obj.A();                 // 3,4 ==>  method with no parameter get called first   this used there

    }
}
