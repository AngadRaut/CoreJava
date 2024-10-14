package Package3;
public class A{
    void Add(){
        System.out.println("Default method in Package3");

    }
    private int Sub(){
        System.out.println("Private method in package3");
        return 0;
    }
    protected float mult(){
        System.out.println("Protected method in package3");
        return 0;
    }
    public boolean div(){
        System.out.println("Public method in package3");
        return true;
    }

  /*  public static void main(String[] args) {
        A a = new A();
        a.Add();
        a.div();               // All access on same class
        a.mult();
        a.Sub();
    }   */

}
class Package3Class  {
}
