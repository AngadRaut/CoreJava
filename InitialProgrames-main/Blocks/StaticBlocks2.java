package Blocks;
class run{
    static {
        System.out.println("part5");
    }
    static{
        System.out.println("part6");
    }
}

public class StaticBlocks2 {

    static {
        System.out.println("part1");
    }

    static {
        System.out.println("part2");
    }
    public static void main(String[] args) {
        run obj = new run();
        System.out.println("main method");

    }

    static {
        System.out.println("part3");
    }

    static{
        System.out.println("part4");
    }
}
