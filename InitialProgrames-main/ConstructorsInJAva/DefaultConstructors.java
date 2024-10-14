package ConstructorsInJAva;
class Value{
    Value(){
        System.out.println("Default Constriuctor =  Value ");
    }
}
class Dummy{
    Dummy(){
        System.out.println("Another default constructor = Dummy");
    }
}
public class DefaultConstructors {
    public static void main(String[] args) {
        Value v = new Value();
        Dummy d = new Dummy();
    }
}
