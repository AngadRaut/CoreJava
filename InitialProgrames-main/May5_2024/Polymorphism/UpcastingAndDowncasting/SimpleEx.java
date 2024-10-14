package May5_2024.Polymorphism.UpcastingAndDowncasting;
class B{
    void put(){
        System.out.println("B class method");
    }
    int add(int a,int b){
        int add=a+b;
        System.out.println("add= "+add);
        return add;
    }
    void fffff(){

    }
}
class C extends B {
    @Override
    void put(){
        System.out.println("Child class put method");
    }
    @Override
    int add(int a,int b){
        int sub=a-b;
        System.out.println("child class method sub="+sub);
        return sub;
    }

}
public class SimpleEx {
    public static void main(String [] args){
       // C c= (C) new B();  // down-casting
      //  c.add(2,4);
       // c.put();

        // Down-casting not support in java

        B b=new C();  // Upcasting=> parent class as reference type and child class as object type
        // b.add(3,4);
       // b.put();

        C c = new C();
        c.add(3,5);
        c.put();
        c.fffff();

    }
}
