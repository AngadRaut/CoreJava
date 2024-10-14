package Variable.StaticVariable;
class Define{
    int a=10;
    static int b=10;

    void dummy(){
        System.out.println(a);
        System.out.println(b);
    }
    static void dummy1(){
        System.out.println(b);
        // System.out.println(a);//cannot access
    }
}

public class CallStaticMembers {
    public static void main(String[] args) {
        Define ref = new Define();
        ref.dummy();
        ref.dummy1();    //call static members using reference/object of class
        Define.dummy1();   //call static member using class name outside the class
    }
}
