package AbstractionClassPractice;

abstract class Eat{
    abstract void eat();
}

class IndianWayOfEating extends Eat {

    @Override
    void eat() {
        System.out.println("Indian people eat food using hand's");
        System.out.println("They sit on the ground while eating");
    }
}

class WesternWayOfEating extends Eat {
    @Override
    void eat() {
        System.out.println("Western people use fork's and spoon's while eating");
        System.out.println("They sit on dining table while eating");
    }
}

public class WayOfEating {
    public static void main(String[] args) {
        IndianWayOfEating r = new IndianWayOfEating();
        r.eat();

        WesternWayOfEating w = new WesternWayOfEating();
        w.eat();
    }
}
