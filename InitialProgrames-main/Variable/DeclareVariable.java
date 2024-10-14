package Variable;

public class DeclareVariable
{
    static int a = 22;    // static variable
    int b = 44;    //instance variable
    public static void main(String[] args)
    {
       // double f= 44.99758;//local variable
     //   System.out.println("f="+f);
      //  System.out.println("a="+a);
       // DeclareVariable obj = new DeclareVariable();
      //  System.out.println("b="+obj.b);
        DeclareVariable b = new DeclareVariable();
        b.a=10;
        System.out.println(a);
        b.b=20;
        System.out.println(b);

    }
}
