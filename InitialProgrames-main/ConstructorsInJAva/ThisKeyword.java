package ConstructorsInJAva;

public class ThisKeyword {
    ThisKeyword(int b){
        this("kaka");
        System.out.println("Parameterized(public) constructor having one parameter int");
    }
    private ThisKeyword(String b){
        this(2,3);
        System.out.println("Parameterized(private)constructor having string parameter ");
    }
    protected ThisKeyword(){
        this(345);
        System.out.println("Default(protected) constructor");
    }
    public ThisKeyword(int a ,int b){
        System.out.println("Parameterized(public) constructor having two int parameter's");
    }
    public static void main(String[] args) {
        ThisKeyword t = new ThisKeyword();
    }
}
