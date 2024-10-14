package May5_2024.Loops;

class A {
    void sum(int y){
        System.out.println("Sum of two numbers: " +(+y));
    }
    void sum(int y, int x){
        System.out.println("Sum of three numbers: " +(x+y));
    }
    public static void main(String[] args){
        A a = new A();
        a.sum(20, 30);
    }
}
class Abc {
    String m1(){
        System.out.println("One");
        return null;
    }
    String m1(String y){
        System.out.println("Two");
        return "PQR";
    }
    public static void main(String[] args){
        Abc a = new Abc();
        a.m1("ABC");
    }
}
public class TwoStrings {
    public static void main(String[] args){
        String a="java";
        String b=" programming";
        String c;
        for(int i=1;i<=10;i++){
            c=a+b;
            System.out.println(c);
        }
    }
}
