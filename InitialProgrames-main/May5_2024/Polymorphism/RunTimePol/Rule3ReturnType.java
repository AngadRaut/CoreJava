package May5_2024.Polymorphism.RunTimePol;
class A{
    A show(){
        System.out.println("show A class");
        return this;
    }
}
class B extends A{
    @Override
   A  show(){
       super.show();
        System.out.println("show in B class");
        //return this;
        //return new B();
        B b=new B();
        return b;
    }
}
public class Rule3ReturnType {
    public static void main(String[] args){
        A b= new A();     /** 3) The return type must be the same or a sub type of the return type
                                  declared in the original overridden method in the super class */
       // B b = new B();
        b.show();
    }
}
