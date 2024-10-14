package Variable;

public class StaticNonStaticMethods {
    static int a=20;
    static String name="java";
    int b=10;
    String abc="Hellow";
    int  sum(){
        int sum=a+b;          //non static method = can access static and non static vairable's
        System.out.println(a);
        System.out.println(abc);
        return sum;

    }
    static void sum2(){
        System.out.println(name);
        System.out.println(a);
        name=name+" programming";
        System.out.println(name);

       // System.out.println(obj.abc);   //non static variables and methods cannot access in static method
                                   //only accessible when we create object and then call them
    }

    public static void main(String[] args) {
        sum2();

        StaticNonStaticMethods obj = new StaticNonStaticMethods();
        obj.a=30;
        obj.b=30;

    }

}
