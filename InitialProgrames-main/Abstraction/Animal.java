package Abstraction;


class TypesOfAnimal{
    void petAnimals(){
        System.out.println("Dog,Cow");
    }
    void wildAnimals(){
        System.out.println("Lion,Tiger");
    }
   // abstract void animalSound();      //not possible abstract method in non abstract class...

}
 abstract class UseOfAnimals{
    void agri(){
        System.out.println("Pet animals are use in agricalture activity");
    }
    abstract void sound();
    //abstract and non abstract methods in abstract class...
 }
 public class Animal {
     public static void main(String[] args) {
         Animal r = new Animal();
         TypesOfAnimal t = new TypesOfAnimal();
         t.petAnimals();
         t.wildAnimals();

       //  UseOfAnimals d =new UseOfAnimals();  //UseOfAnimal is abstract class not possible


     }
 }
