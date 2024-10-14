package ConstructorsInJAva;

class  Substraction{
    Substraction(){
        System.out.println("No argument constructor or default");
    }
    Substraction(String name,boolean b){
        String a = "Java";
    }

    public Substraction(int a, boolean b) {

    }
}
public class ClassA {
    public static void main(String[] args) {
        Substraction s = new Substraction();
        Substraction ss = new Substraction(5,true);
    }
}
