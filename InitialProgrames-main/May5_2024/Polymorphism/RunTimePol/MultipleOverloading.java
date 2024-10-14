package May5_2024.Polymorphism.RunTimePol;

class Animal{
   public  void eat(){
        System.out.println("eat");
    }
    public void sound(){
        System.out.println("sound");
    }
    void type(){
        System.out.println("type");
    }
    int add(int a,String b){
       String add=a+b;
        System.out.println("add="+add);
        return 0;
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
    @Override
    public void sound(){
        System.out.println("dog sound");
    }
    @Override
    void type(){
        System.out.println(" dog type pet");
    }
}
class Cat extends Dog{
    @Override
    public void eat(){
        System.out.println("cat eat");
    }
    @Override
    public void sound(){
        System.out.println("cat eat");
    }
    @Override
    void type(){
        System.out.println("cat type pet");
    }
}
class Lion extends Cat {
    @Override
    public void eat(){
        System.out.println("lion eat");
    }
    @Override
    public void sound(){
        System.out.println("lion eat");
    }
    @Override
    void type(){
        System.out.println("lion type wild");
    }
}
public class MultipleOverloading {
    public static void main(String[] args){
        Animal l=new Dog();
        l.eat();
        l.sound();
        l.type();
        l.add(2,"string");
    }
}
