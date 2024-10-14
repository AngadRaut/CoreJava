package InterfaseExercise;
interface Flyable{
    void fly_obj();
}
class Spacecraft implements Flyable{

    @Override
    public void fly_obj() {
        System.out.println("You are in Spacecraft");
    }
}
class Airoplane implements Flyable {

    @Override
    public void fly_obj() {
        System.out.println("You are in Airoplane");
    }
}
class Helicopter implements Flyable{

    @Override
    public void fly_obj() {
        System.out.println("You are in Helicopter");
    }
}
public class ThirdProblem {
    public static void main(String[] args) {
        Spacecraft s = new Spacecraft();
        s.fly_obj();

        Airoplane a=new Airoplane();
        a.fly_obj();

        Helicopter h =new Helicopter();
        h.fly_obj();


    }
}
