package May5_2024.Polymorphism.UpcastingAndDowncasting;

abstract class AbstractClass{
    abstract void abstractClass();
     void classMethod(){
         System.out.println("non abstract method in abstract class");
    }
}
class NonAbstract extends AbstractClass{
    @Override
    public void abstractClass(){
        System.out.println("abstract method by default public  ");
    }
}
public class upcasting {
    public static void main(String[] args){
        AbstractClass obj = new NonAbstract();
        obj.abstractClass();
        obj.classMethod();

      //  NonAbstract oj=(NonAbstract)new AbstractClass();
    }
}
