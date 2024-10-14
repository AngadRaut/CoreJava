package May5_2024.Polymorphism.RunTimePol;

class Dummy{
    Dummy returnDummy(){
        System.out.println("Parent class method");
        return this;
    }
    Dummy dummy(){
        Dummy d= new Dummy();
       return d;
    }
}
class Show extends Dummy{
    @Override
    Show returnDummy(){
        //Show d= new Show();
       // Dummy d=new Dummy();
        return (new Show());
    }
}
public class CovariantReturnType {
    public static void main(String[] args){
    }
}
