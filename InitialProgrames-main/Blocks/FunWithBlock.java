package Blocks;

public class FunWithBlock {
     static{
        int a=100;
        System.out.println("static block 2 "+a);
    }
    {
        int  a=20;
        System.out.println("non static block 2");
    }
    {
        System.out.println("non static block 3");
    }

    public static void main(String[] args) {
        FunWithBlock obj = new FunWithBlock();    //6,27,10,13,24,32,24
        FunWithBlock obj2 =new FunWithBlock(2);
        FunWithBlock.run2();


    }
    static void run2(){
        System.out.println("static method run2");
    }
    FunWithBlock(){
        System.out.println("Default constructor");
    }
    static {
        System.out.println("static block 3");
    }
    FunWithBlock(int b){
        System.out.println("Parameterized constructor"+b);
    }


}
