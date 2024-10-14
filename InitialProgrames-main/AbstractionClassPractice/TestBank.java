package AbstractionClassPractice;
abstract class  Bank
{
    abstract void interestRate();
}
class Sbi extends Bank
{
    @Override
    void interestRate()
    {
        System.out.println(" Rate of interest  SBI is 6%");
    }
}
class Hdfc extends Bank
{
    @Override
    void interestRate()
    {
        System.out.println("Rate of interest of HDFC bank is 7%");
    }
}
class KotakBank extends Bank
{
    void interestRate()
    {
        System.out.println("Rate of interest of Kotak Bank is 7%");
    }
}

public class  TestBank
{
    public static void main(String[] args)
    {
        Sbi s = new Sbi();
        Hdfc h = new Hdfc();
        KotakBank k = new KotakBank();

        s.interestRate();
        h.interestRate();
        k.interestRate();
    }
}
