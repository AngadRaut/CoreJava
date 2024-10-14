package May5_2024.Polymorphism.OverloadingInterview;

// whatever is Static is not override

class StaticMethodOverriding {
    static void methodOfX()
    {
        System.out.println("Class X");
    }
}

class Ybn extends StaticMethodOverriding
{
    //@Override
    static void methodOfX()
    {
        System.out.println("Class X");
    }
}
public class Interview11 {
    public static void main(String[] args){
        Ybn obj = new Ybn();
//        Ybn.methodOfX();
//        StaticMethodOverriding.methodOfX();

    }
}
