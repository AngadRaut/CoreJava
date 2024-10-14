package May5_2024.Polymorphism.OverloadingInterview;

public class vehicle {
    void run(){
        System.out.println("vehicle class run method");
    }
}

class Car extends  vehicle{
    @Override
    void run(){
        System.out.println("car class run method");
    }
    void add(){
    }
}
class Test1 {
    public static void main(String[] args) {
        //upcasting
        vehicle v = new Car();
        v.run();
      //  v.add();

        //downcasting

        Car c = (Car) new vehicle();
        c.run();

    }
}
