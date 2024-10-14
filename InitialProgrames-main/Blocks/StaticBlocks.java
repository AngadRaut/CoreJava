package Blocks;
class Blocks{
    int a=100;
    static int b=100;
    static String c ="java";
    String d ="Programming";

    static{
        System.out.println("static block part1 ");
    }
    void method(){
        System.out.println("method 1");
    }
    static {
        System.out.println("static block part2 ");
    }
    static{
        System.out.println("static block part3 ");
    }

}
public class StaticBlocks {
    static {
        System.out.println("part 4");

    }
    public static void main(String[] args){
        System.out.println("main method");
        Blocks obj = new Blocks();
        obj.method();
    }
    static {
        System.out.println("part 5");
    }
    static {
        System.out.println("part 6");
    }
}
