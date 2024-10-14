package May5_2024.Polymorphism.OverloadingInterview;
/**   Covariant return type ==> return type should be same or subtype of return
 *                            type declared in original overridden method in parent class */



class SuperClass
{
    Object superClassMethod()
    {
        System.out.println("covariant return type parent class");
        return new Object();
    }
}
public class Interview12 extends SuperClass{
    @Override
    Object superClassMethod(){
        System.out.println("third rule covariant return type child class");
        return new Interview12();
    }
    public static void main(String[] args){
        Interview12 obj = new Interview12();
        obj.superClassMethod();
    }
}
