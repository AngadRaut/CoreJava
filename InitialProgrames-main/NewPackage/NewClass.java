package NewPackage;

public class NewClass
{
   final int d=33;
    static int a=339;
    double b = 0.6537;
    void dummy()
    {
        int c =33;
        ++c;
        ++b;
        ++a;

        System.out.println("c=="+c);
        System.out.println("b==" +b);
        System.out.println("c=="+a);
        System.out.println("d=="+d);


    }

    public static void main(String[] args) {
        NewClass n = new NewClass();
        n.dummy();
    }

}

