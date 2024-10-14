package AbstractionClassPractice.InterfacePractice;
interface Api{
    abstract void dummy();
}
interface Dpi{
    abstract void display();
}
interface Cpi{
    abstract void show();
}
public class MultipleInheritanceUsingInterface implements Api,Dpi,Cpi{

    @Override
    public void dummy() {
        System.out.println("dummy");
    }

    @Override
    public void display() {
        System.out.println("display");

    }

    @Override
    public void show() {
        System.out.println("show");

    }

    public static void main(String[] args) {
        MultipleInheritanceUsingInterface reference = new MultipleInheritanceUsingInterface();
        reference.dummy();
        reference.display();
        reference.show();
    }
}
