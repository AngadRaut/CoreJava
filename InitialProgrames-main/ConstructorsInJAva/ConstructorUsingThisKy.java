package ConstructorsInJAva;
public class ConstructorUsingThisKy {
    ConstructorUsingThisKy(){
        System.out.println("Default Constructor");
    }
    public ConstructorUsingThisKy(int a){
        this(1,3);
        System.out.println("Parameterized Constructor using one-int parameter ");
    }
    protected ConstructorUsingThisKy(int a,int b){
        this("name",true);
        System.out.println("Parameterized constructor using two-int parameter's");
    }
    private ConstructorUsingThisKy(String a,boolean b){
        this();
        System.out.println("Parameterized constructor using two parameter's String and boolean ");
    }

    public static void main(String[] args) {
        ConstructorUsingThisKy c = new ConstructorUsingThisKy(20);          //4,16,12,8
    }
}
