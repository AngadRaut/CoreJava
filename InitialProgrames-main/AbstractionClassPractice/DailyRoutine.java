package AbstractionClassPractice;

abstract class Routine{
    abstract void routine();

    void aa(){
        System.out.println("Wake up and take bath");
    }
}
class morning extends Routine{
    @Override
    void routine(){
        System.out.println("Do some yoga");
    }
}

public class DailyRoutine {
    public static void main(String[] args) {
        morning obj = new  morning();
        obj.routine();
    }
}
