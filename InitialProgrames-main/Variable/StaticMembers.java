package Variable;

public class StaticMembers {
    static String name = "Java";
    String name1 = "Small";
    static int a = 100;
    int b = 100;


    public static void main(String[] args) {
        System.out.println(name+"\t"+a);
        StaticMembers obj = new StaticMembers();
        System.out.println(obj.name1+"\t"+obj.b);

        StaticMembers obj2=new StaticMembers();
        obj2.name="Programming";
        obj2.name1="Big";
        obj2.a=200;
        obj.b=200;

        System.out.println("static data members after obj2 created  "+name+"\t"+a);
        System.out.println("non static data members after obj2 created  "+obj2.name1+"\t"+obj2.b);

        System.out.println("\n"+name+"\t"+a);    //  programming 200




    }
}
