package AbstractionClassPractice;
abstract class Car{
    abstract void function();

}
class Start extends Car{
    @Override
    void function(){
        System.out.println("Step 1 =Plug the keys to start the car,start a car in neutral");
        System.out.println("Step 2 =Adjust the driver seat and side mirrors");
    }
}
class Motion extends Car{
    @Override
    void function(){
        System.out.println("Step 3 =Shift into first gear");
        System.out.println("Step 4 =Take the car into motion");
    }
}
class Drive extends Car{
    @Override
    void function(){
        System.out.println("Step 5 =Upshifts into higher gears");
        System.out.println("Step 6 =Drive Safely");
    }
}

public class CarTest {
    public static void main(String[] args){
        Start s = new Start();
        Motion m = new Motion();
        Drive d = new Drive();

        s.function();
        m.function();
        d.function();
    }
}
