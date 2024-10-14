package May5_2024.Polymorphism.OverloadingInterview;
class Xyz
{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}

class Yz extends Xyz
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
}

class Zz extends Yz
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Z");
    }
}
public class Problem10 {
    public static void main(String[] args)
    {
        Xyz x = new Yz();

        x.calculate(10, 20);    // class y

        Yz y = (Yz) x;

        y.calculate(50, 100);

        Zz z = (Zz) y;

        z.calculate(100, 200);
    }
}
