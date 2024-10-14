package May5_2024.Constructors;
class GGp{
    void gGp(){
        System.out.println("great drand parents method");
    }
    GGp(){
        this(5);
        System.out.println("default constructor in GGp class");
    }
    GGp(int a){
        System.out.println("parameterized constructor in GGp class");
    }
    {
        System.out.println("nin static block 1");
    }
    static{
        System.out.println("static block 1");
    }
}
class GP extends GGp{
    static{
        System.out.println("static block 2");
    }
    void gP(){
        System.out.println("method in GP class");
    }
    GP(String b){
        super();
        System.out.println("parameterized constructor in GP class");
    }
    GP(){
        this("JJ");
        System.out.println("default constructor in GP class");
    }
    {
        System.out.println("non static block 2");
    }
}
class P extends GP{
    static{
        System.out.println("static block 3");
    }
    void p(){
        System.out.println("method in P class");
    }
    P(int a){
        this();
        System.out.println("parameterized constructor in P class");
    }
    P(){
        System.out.println("default constructor in P class");
    }
    {
        System.out.println("non static block 3");
    }
}
public class Basic {
    public static void main(String[] args){
        P obj=new P(4);
    }
}
