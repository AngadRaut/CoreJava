package May5_2024.Polymorphism.UpcastingAndDowncasting;

/* java programme to demonstrate
   Upcasting vs Down-casting   */

// parent class
class Parent {
    void parent(){
        System.out.println("parent class method");
    }
   static int dummy(){
        System.out.println("parent class dummy method");
        return 0;
    }
    int dummy(int a){
        System.out.println("dummy method one parameter");
        return 0;
    }
    static void add(){
        System.out.println("static method in parent class");
    }
}
// Child Class
class Child extends Parent{
    /* Overriding the parent class method
     to change its implementation        */
    @Override
    void parent(){
        //super.parent();      // to call parent class method
        System.out.println("child class method");
    }
    @Override
    int dummy(int a){
        System.out.println("dummy method in child class");
        return 0;
    }
    void addg(){
        System.out.println("hjddsh");
    }
    static void sub(){
        System.out.println("static method in child class");
    }
}
/* Demo class to find difference between
   upcasting and down-casting    */
public class Demo {
    // main method
    public static void main(String[]  args){
        //creating object of parent class  => same class as reference type and  object type
        Parent obj=new Parent();
        /* can only access its own method not child class method
        *  because here parent don't know whether child class exist or not */
       // obj.parent();

        // creating object of child class => same class as reference type and object type
      /*  Child obj2=new Child();
        obj2.parent();   // child class method called here
        obj2.dummy();    // parent class dummy method get called
        obj2.dummy(5); // child class dummy method get called     */

        // upcasting => parent class reference type and child class object type
        Parent obj3=new Child();
        obj3.parent();
        obj3.dummy(5);
        obj3.dummy();
        obj3.add();
       // obj3.addq();
       // obj3.sub();


        // Down-casting => child class reference type and parent class object type
        Child obj4=(Child) new Parent();
        obj4.dummy(7);
        // java not support down-casting it will throw ClassCastException exception


    }
}
