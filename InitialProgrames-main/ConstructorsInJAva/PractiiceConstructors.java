package ConstructorsInJAva;
class Constructors
{
    int a=11;
    double d = 228475.66565;
    float c = 444.45f;
    boolean b = true;
    String name;
    Constructors()
    {
        System.out.println("This is default constructor");

    }
    Constructors(int i,String name)
    {
        System.out.println("This is Parameterized Constructor");
    }

}
public class PractiiceConstructors {
    public static void main(String[] args) {
        Constructors obj = new Constructors();

        System.out.println("Parameter a ="+obj.a +"\n"+ "Parameter d = "+obj.d+"\n"+"Parameter c ="+obj.c+"\n" +
                "Parameter b = "+obj.b);

        Constructors obj2= new Constructors(2,"java");
    }
}
