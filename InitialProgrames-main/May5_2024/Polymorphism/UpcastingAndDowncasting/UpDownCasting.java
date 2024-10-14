package May5_2024.Polymorphism.UpcastingAndDowncasting;

class Animal{
    public void eat(){
        System.out.println("eating");
    }
    public void eat(int a){
        System.out.println("eat(parent class) method with one parameter");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("eat in dog(child) class");
    }
    void sleep(){
        System.out.println("sleep in dog(child) class");
    }
}
public class UpDownCasting {
    public static void main(String[] args){
      /*  Animal obj = new Animal();
        // can only access all methods in animal class

        Dog obj2 = new Dog();
        obj2.eat();
        obj2.eat(5);
        obj2.sleep();
        // overridden methods and both parent as well as child class methods get called  */

        Animal obj = new Dog();  // upcasting
        obj.eat();
        obj.eat(5);
       // obj.sleep();
        // child class methods which are not overridden from parent class are not access
        // all parent class methods can access


    }
}
