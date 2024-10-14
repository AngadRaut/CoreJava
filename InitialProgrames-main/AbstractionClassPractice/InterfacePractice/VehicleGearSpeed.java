package AbstractionClassPractice.InterfacePractice;
interface Vehicle
{
    void gear(int a);
    void speedup(int a);
    void brake(int a);
}
class Bike implements Vehicle
{
    int speed;
    int gear;

    @Override
    public void gear(int newgear)
    {
        gear = newgear;
        System.out.println("present state of bike");
        System.out.println("Bike is in "+newgear+" gear");
    }

    @Override
    public void speedup(int increment)
    {
        speed = speed+increment;
        System.out.println("speed= "+speed);
    }

    @Override
    public void brake(int decrement)
    {
        speed=speed-decrement;
        System.out.println("after applying break speed  = "+speed);

    }
}
class Car implements Vehicle
{
    int gear;
    int speed;
    @Override
    public void gear(int newgear) {
        gear = newgear;
        System.out.println("present state of bike");
        System.out.println("Bike is in "+newgear+" gear");

    }

    @Override
    public void speedup(int increment) {
        speed = speed+increment;
        System.out.println("speed= "+speed);

    }

    @Override
    public void brake(int decrement)
    {
        speed=speed-decrement;
        System.out.println("after applying break speed  = "+speed);

    }
}
public class VehicleGearSpeed
{
    public static void main(String[] args){
        Bike objj = new Bike();
        objj.gear(1);
        objj.speedup(5);
        objj.brake(2);

        Car obj2 = new Car();
        obj2.gear(1);
        obj2.speedup(4);
        obj2.brake(2);
    }
}
