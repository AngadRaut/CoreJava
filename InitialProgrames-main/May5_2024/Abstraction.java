package May5_2024;

class 



class NonAbstract {
    void dummy2(){
        System.out.println("non abstract class method");
    }
    void nana(){
        System.out.println("parent class method");
    }
}
public class Abstraction extends NonAbstract {
    void join(){
        System.out.println("child class method");
    }
    @Override
    void dummy2(){
        System.out.println("child class override method ");
    }
    public static void main(String[ ] args){
        NonAbstract obj = new Abstraction();   // upcasting =>
        // ref type(parent class)  obj type(child class)
        obj.dummy2();
        obj.nana();
       // obj.join();
    }
}
