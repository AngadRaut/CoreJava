package AbstractionClassPractice.RuleNo0405;
/* rule 4) if one abstract class extends another abstract class,
* then its not mandaory for that child class to provide method implementations
* for abstract method of super class */
abstract class A11{
    abstract void showtest();
}

abstract class B11 extends A11{
    abstract void display();
}

abstract class C11 extends B11{
    abstract void show();
}
/* rule 5) if non abstract class extends abstract class ,
* then its mandetory for that child class to provide method
* implementations for abstract method of super  class
*   */
class D111 extends C11{
    @Override
    void showtest() {
        System.out.println("show test in A11 class");
    }

        @Override
                void display() {
            System.out.println("display in B11 class");
        }

            @Override
                    void show() {
                System.out.println("show in C11 class ");
            }

            }
public class Rule45Test {
    public static void main(String[] args) {
        D111 obj = new D111();
        obj.showtest();
        obj.display();
        obj.show();
    }
}
