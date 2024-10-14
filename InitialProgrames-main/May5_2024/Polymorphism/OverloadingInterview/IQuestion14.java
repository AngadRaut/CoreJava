package May5_2024.Polymorphism.OverloadingInterview;

class SuperClass1
{
    void superClassMethod(Number n)
    {
        System.out.println("From Super Class");
    }
}

class SubClass extends SuperClass1
{
    void superClassMethod(Double d)
    {
        System.out.println("From Sub Class");
    }
}

public class IQuestion14 {
    public static void main(String[] args){
        SuperClass1 sub = new SubClass();

        sub.superClassMethod(123321);

    }
}
