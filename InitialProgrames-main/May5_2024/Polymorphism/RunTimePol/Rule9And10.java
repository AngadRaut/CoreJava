package May5_2024.Polymorphism.RunTimePol;

import MethodCreation.ObjectCreationMethodCalling;
/** Rule no 10 => A subclass in different package can only override
             non final methods which are declares public and protected
 Rule no 9 => A subclass within same package can override methods
              which are declared as public,protected,default
              Methods declared private ,final not override
 */
class Rule10 extends ObjectCreationMethodCalling {
    @Override
    public int print(int a){
        System.out.println("different package public method can be override");
        return  0;
    }
    @Override
    protected int give(int a,int b){
        System.out.println("different package protected method can be override ");
        return 0;
    }

    // default method cannot access in different package subclass
//    @Override
//    void name(){
//        System.out.println("default method in parent class cannot override");
//    }

}
public class Rule9And10 extends Dummy123 {
    @Override
    void dummy123(){
        System.out.println("same package superclass method method can be override if it is not private/final");
    }



    public static void main(String[] args){
        Rule9And10 r=new Rule9And10();
        r.dummy123();

        Rule10 rr=new Rule10();
        rr.print(5);
        rr.give(4,5);

}
}
