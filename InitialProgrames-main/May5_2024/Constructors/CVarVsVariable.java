package May5_2024.Constructors;

 class T {
    int t = 20;
    static int b=45;
    T() {
        t = 40;
        b=99;
    }
    abstract class InnerClass{
        void add(int b,int c){
            int a=b+c;
        }
    }
}
class Main {
    public static void main(String args[]) {
        T t1 = new T();
        System.out.println(t1.t);
        System.out.println(T.b);
        // t=40 Because The values assigned inside constructor overwrite the values initialized with declaration.
    }
}
public class CVarVsVariable {
}
