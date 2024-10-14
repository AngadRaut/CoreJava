package ConstructorsInJAva;
class ConstructorDefault
{
    
    ConstructorDefault()
    {
        System.out.println("This is Default Constructor");
    }

     ConstructorDefault(int a, boolean b)
     {
        System.out.println("This is Parameterized constructor ");
    }
}
public class TypesOfConstructor
{
    public static void main(String[] args)
    {
        ConstructorDefault c = new ConstructorDefault();
        ConstructorDefault b = new ConstructorDefault(2,true);

    }
}
