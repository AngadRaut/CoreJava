package Variable;
class Access{
    static int a=100;
    int b=100;
    void take(){
        System.out.println(a);
        System.out.println(b);
        take2();
    }
    static void take2(){

        Access obj = new Access();
        System.out.println(obj.b);
    }
}
public class AccessBothVariables {
    public static void main(String[] args) {

    }
}
