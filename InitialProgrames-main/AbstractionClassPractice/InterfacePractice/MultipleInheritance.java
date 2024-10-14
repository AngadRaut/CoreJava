package AbstractionClassPractice.InterfacePractice;
class Show{
    void show(){
        System.out.println("show 1");
    }
}
class Show2{
    void show(){
        System.out.println("show 2");
    }
}
class Code extends Show{

}

interface Dummy{
    void eat();
}
interface Dummy2{
    void eat();
}
class Dummy3 implements Dummy,Dummy2{
    @Override
    public void eat(){
        System.out.println("overrided eat method");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Dummy3 d = new Dummy3();
        d.eat();
    }
}
