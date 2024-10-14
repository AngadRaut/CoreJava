package AbstractionClassPractice;
abstract class Animal{
    abstract void animal();

}
class Dog extends Animal{
    @Override
    void animal(){

        System.out.println("Dog is pet animal \n Dog" );
        System.out.println("Dog = Bark's");
    }
}

class Lion extends Animal{
    @Override
    void animal(){
        System.out.println("Lion is an wild animal ");
        System.out.println("Lion = Roar");
    }
}
class Elephant extends Animal{
    @Override
    void animal(){
        System.out.println("Elephant can be pet or wild");
        System.out.println("Elephant =Trumpet, Roar");
    }
}
public class AnimalVoice {
    public static void main(String args[]){
        Dog d = new Dog();
        d.animal();

        Lion L = new Lion();
        L.animal();

        Elephant E = new Elephant();
        E.animal();


    }
}
