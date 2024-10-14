package ConstructorsInJAva;
class Vehicle{
    Vehicle(){
        System.out.println("Vehicle 1st::Default constructor");
    }
    public Vehicle(int a,double b){
        System.out.println("Vehicle 2nd::Parameterized Constructor=>two arguments " +a+"\t"+b);
    }
}
class Car extends Vehicle  {

    protected Car(){
       // super();
        System.out.println("Car 1st::(Protected)Default Constructor");
    }
    Car(double c, boolean d){
        super(5,6.5);
        System.out.println("Car 2nd:(Private) Parameterized Constructor");
    }
}
class Bike extends Car{
    Bike(){

        System.out.println("Bike 1st:Default Constructor");
    }
    protected Bike( boolean h, String i){
        super(4.5,true);
        System.out.println("Bike 2nd:(protected) Parameterized constructor");
    }
}
class Bicycle extends Bike{
    Bicycle(){
        super(false,"name");
    }
}
public class ConstructorUseExtends extends Bicycle{
    public static void main(String[] args) {
        ConstructorUseExtends reference = new ConstructorUseExtends();
    }
}
