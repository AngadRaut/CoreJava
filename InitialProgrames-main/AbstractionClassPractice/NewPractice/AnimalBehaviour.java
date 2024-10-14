package AbstractionClassPractice.NewPractice;

 abstract class Animal
 {
     abstract void eat();       // We can not use public to abstract method when we are using multilevel inheritance
     abstract void sound();

}
abstract class Animal02 extends Animal
{
     abstract void sleep();
}


class Lion extends Animal02
{
     @Override
    void eat()
     {
         System.out.println("Lion is an Carnivorous animal,eat's other animal's ");
     }
     @Override
    void sound()
     {
         System.out.println("lion = Roar's");
     }
     @Override
    void sleep()
     {
         System.out.println("Lion's sleep in hide places generally in cave's \n Lion is the King of forest");
     }
}
class Tiger extends Animal02{

    @Override
    void eat() {
        System.out.println("Meat");
    }

    @Override
    void sound() {
        System.out.println("Roar");
    }

    @Override
    void sleep() {
        System.out.println("Ground");
    }
}

public class AnimalBehaviour
{
    public static void main(String[] args)
    {
        Lion obj = new Lion();

        obj.eat();
        obj.sound();
        obj.sleep();
    }
}
