package AbstractionClassPractice;
abstract class A{
    abstract void abc();
    void abcd(){
        System.out.println("This is concrete method in A class");
    }
}
class B extends A{

    @Override
    void abc() {
        System.out.println("child class B gives implementation to class A's method abc ");
    }
}
public class AbstratMethod extends B{
    public static void main(String[] args) {
        B  v = new AbstratMethod();
        v.abcd();
        v.abc();
    }
}
