package May5_2024.Polymorphism.RunTimePol;

/** 7) constructor cannot be override
 *  8) If a method cannot be inherited then it cannot be override  => private methods */

class ConstructorAndPrivate{
    {
        System.out.println("Default constructor in parent class");
    }
    private int show(){
        System.out.println("private show method");
        return 0;
    }
}
public class Rule7And8 extends ConstructorAndPrivate {
   // @Override
    {
        System.out.println("ffytfygy");
    }
   // @Override
    private int show(){
        System.out.println("geryfuh");
        return 0;
    }
    public static void main(String[] args){
    }
}
abstract class ADH{
    ADH(int a){
        System.out.println("fhsduf");
    }


}
