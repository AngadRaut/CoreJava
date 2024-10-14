package Variable.StaticVariable;
class Calculate{
    static int a=100;
    static int b=200;
}
public class CallStaticVariable {
    void addition(){
        int c=Calculate.a+Calculate.b;
        System.out.println(c);
    }
    void sub(){
        int d=Calculate.a-Calculate.b;
        System.out.println(d);
    }
    public static void main(String[] args){
        CallStaticVariable obj = new CallStaticVariable();
        obj.addition();
        obj.sub();
    }
}
