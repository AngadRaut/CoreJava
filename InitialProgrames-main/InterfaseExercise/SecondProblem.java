package InterfaseExercise;
interface Animal{
    void bark();
}
class Dog implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}
public class SecondProblem{
    public static void main(String[] args){
        Dog d = new Dog();
        d.bark();
    }
}
