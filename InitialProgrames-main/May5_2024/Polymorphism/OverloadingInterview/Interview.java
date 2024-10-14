package May5_2024.Polymorphism.OverloadingInterview;
class X
{
    int method(int i, int d)
    {
        return i+d;
    }

    static int method(int i, double d)
    {
        return (int)(i+d);
    }

    double method(double i, int d)
    {
        return i+d;
    }

    static double method(double i, double d)
    {
        return i+d;
    }
}
 class MainClass
{
    double overloadedMethod(double d)
    {
        return d *= d;
    }

    int overloadedMethod(int i)
    {
        return overloadedMethod(i);
    }

    float overloadedMethod(float f)
    {
        return overloadedMethod(f *= f);
    }
}
class Z
{
    void method(int a)
    {
        System.out.println("ONE");
    }

    void method(double d)
    {
        System.out.println("TWO");
    }
}

class Y extends Z
{
    @Override
    void method(double d)
    {
        System.out.println("THREE");
    }
}
public class Interview {
    public static void main(String[] args){
            MainClass main = new MainClass();

            System.out.println(main.overloadedMethod(100));

           // new Y().method(100);
    }
}
