package ConstructorsInJAva;

import java.sql.SQLOutput;

class DummyClass{
    int a=200;
    int b=300;
    DummyClass(){
        System.out.println("This is default constructor");
    }
    DummyClass(int a,int b){
    }
}
public class ValuesXandY {
    public static void main(String[] args) {
        DummyClass obj1 = new DummyClass();
        DummyClass obj2 = new DummyClass(200,300);

        System.out.println("obj1 = "+obj1.a+"\n"+"obj2 = "+obj2.b);
    }
}
