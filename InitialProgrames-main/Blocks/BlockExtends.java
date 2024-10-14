package Blocks;
class  A{
    static {
        System.out.println("part1 class A");
    }
    void abc(){
        System.out.println("non static method abc in class A");
    }
    static {
        System.out.println("part2 class A");
    }
   static  void dum(){
       System.out.println("static method in class A");
   }
   A(){
       System.out.println("Default constructor in class A");
   }
   A(int a,String b){
       System.out.println("Parameterized constructor in class A");
   }
}
public class BlockExtends {
    static {
        System.out.println("Part 3 Class BlockExtends");
    }
    static void dum2(){
        System.out.println("static method in class BlockExtends");
    }

    public static void main(String[] args) {
        dum2();
        A.dum();
        BlockExtends obj = new BlockExtends();
        obj.add();

        System.out.println("Main Method");

        A obj2 = new A();    //default constructor ,static blocks direct access after object creation
        obj2.abc();
        A obj3 = new A(2,"name");
    }
    static {
        System.out.println("part 4 class BlockEtexnds");
    }
    void add(){
        System.out.println("instance method in BlockExtend class");
    }

}
