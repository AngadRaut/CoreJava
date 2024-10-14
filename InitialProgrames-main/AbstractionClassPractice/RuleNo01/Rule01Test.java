package AbstractionClassPractice.RuleNo01;
//
abstract class About{
    abstract void show();    //abstract method

    abstract void take();

   //  rule no 1) non abstract method and abstract method in abstract class
    void nonAbstractMethod(){
        System.out.println("Abstract and non abstract method in abstract class");
    }
}

public class Rule01Test {
    public static void main(String[] args) {

    }
}
