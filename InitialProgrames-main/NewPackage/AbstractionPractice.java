package NewPackage;

import AbstractionClassPractice.InterfacePractice.BankDetails;

 abstract class A
{
    abstract void add ();
}
 abstract class B extends A{
   abstract void mul();
}
public class AbstractionPractice extends B {
    public static void main(String[] args) {
        AbstractionPractice n = new AbstractionPractice();
    }

    @Override
    void add() {

    }

    @Override
    void mul() {

    }
}
