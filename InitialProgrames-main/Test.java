 abstract class A {
    abstract void m1();
    static void m2() {System.out.println("Hello Java!"); }
}
class B extends A {
    void m1(){
        A.m2();

    }

    public static void main(String[] args) {
        B n=new B();
        n.m1();
        n.m2();

    }
}