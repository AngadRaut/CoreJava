package Package01;

public class Package1Class {
    private void privateMethod(){
        System.out.println("This is private method");
    }
    protected void protectedMethod(){
        System.out.println("This is protected method");
    }
    public void publicMethod(){
        System.out.println("This is public method");
    }
    void defaultMethod(){
        System.out.println("This is Default method");
    }

    public static void main(String[] args) {
        Package1Class v = new Package1Class();
        v.defaultMethod();
        v.privateMethod();
        v.protectedMethod();
        v.publicMethod();
    }
}
class Package1Class3{
    public static void main(String[] args) {
        Package1Class d = new Package1Class();
        d.publicMethod();
        d.protectedMethod();
        d.defaultMethod();
    }
}