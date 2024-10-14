package May5_2024.Polymorphism;

public class CompileTimeP {
    static void show(){
        System.out.println("No argument method ");
    }
    static void show(boolean a){
        System.out.println("one argument method");
    }
    public static void main(String[] args){
        CompileTimeP obj= new CompileTimeP();
        obj.show();
        obj.show(true);
    }

}
