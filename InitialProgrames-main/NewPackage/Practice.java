package NewPackage;

class Animal{
    // 1) method overloading happens within same class
    // 2) method signature must be same
    static void eat(){
        System.out.println("Animal class eat method");
    }
    void eat(int a){
        System.out.println("one parameter");
    }
    float eat(int a,int b){
        System.out.println("two parameters");
        return 0;
    }
    private int value;
    private String name;
    public void setValue(int a){
        this.value=a;
    }
    public int getValue(){
        return value;
    }
    public void setName(String b){
        this.name=b;
    }
    public String getName(){
        return name;
    }

}
interface Abcd{
    abstract void abcd();

}
abstract class Abstraction implements Abcd{
    abstract void eat();
    abstract void eat(int a,int b);
    float eat(int a){
        System.out.println("non abstract method in abstract class ");
        return 0;
    }
}
class NonAbstract extends Abstraction{
    @Override
    public void eat(){
        System.out.println("eating");
    }
    @Override
    public void abcd(){
        System.out.println("interface method");
    }
    @Override
    public void eat(int a,int b){
        System.out.println("eating parameter method");
    }
    
}
class Dog extends Animal{
    void run(){
        System.out.println("Dog class run method ");
    }
}
public class Practice extends Dog{
    public static void main(String []args){
        Practice obj = new Practice();
        eat();
        obj.run();

        obj.setValue(1);
        obj.setName("Java Programming");
        System.out.println("Value = "+obj.getValue()+"Name = "+obj.getName());

        NonAbstract obj2 = new NonAbstract();
        obj2.abcd();
        obj2.eat();
        obj.eat(1,2);
    }
}
