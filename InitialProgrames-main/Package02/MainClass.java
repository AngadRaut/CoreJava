package Package02;

import Package01.A;

class B extends A
{
    public B()
    {
        super(10);     //calling super class's protected constructor
    }

    public static void main(String[] args) {
        B a = new B();



    }
}

