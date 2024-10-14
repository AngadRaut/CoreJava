package Blocks;

public class InstanceBlockPractice {
    static {
        int a=100;
        System.out.println("static block 1");
    }
    {
        System.out.println("non static block1 ");
    }

    public static void main(String[] args) {
        run();
        InstanceBlockPractice obj = new InstanceBlockPractice();
        InstanceBlockPractice obj2 =new InstanceBlockPractice(2);   //output = 5,24,8,18,8,21

    }
    InstanceBlockPractice(){
        System.out.println("default constructor");
    }
    InstanceBlockPractice(int a){
        System.out.println("parameterized constructor");
    }
    static void run(){
        System.out.println("static method run");
    }
}
