package Inheritance;

public class InheritanceExtendBasics {
    void add(){
        System.out.println("this is class A's method ");
    }
}

//children class name extends parent class name
class A extends InheritanceExtendBasics{
    public static void main(String[] args){
        A r= new A();
        r.add();
        System.out.println("Accesing variable of class A");
    }
}
