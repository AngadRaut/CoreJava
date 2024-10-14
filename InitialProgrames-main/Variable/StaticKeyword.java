package Variable;

public class StaticKeyword {
    int nonStaticVariable ;
    static int staticVariable;
    static String name="Java";
    String name1="Java1";

    void nonStaticMethod(){
        staticMethod();
        System.out.println("This is non static method "+nonStaticVariable);
        System.out.println("This is non static metod "+staticVariable);
        System.out.println("This is non static metod "+name1);
    }
    static void staticMethod(){
        StaticKeyword obj = new StaticKeyword();
        obj.nonStaticMethod();

        System.out.println("This is static method "+name);
        System.out.println("This is static method "+obj.name1);
        System.out.println("This is static method "+obj.nonStaticVariable);


    }

    public static void main(String[] args) {
       staticMethod();
       // StaticKeyword obj = new StaticKeyword();
       // obj.nonStaticMethod();
    }
}
