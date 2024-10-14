package Inheritance.HybridInheritance;

class Jghsd {
    void hsd(){
        System.out.println("hsd method in Jghsd class");
    }
}
class Kkjsh extends Jghsd {
    void yfj(){
        System.out.println("yfj method in Kkjsh class");
    }

}
class Bbb extends Jghsd {
    void tthh(){
        System.out.println("tthh method in Bbb class");
    }
}
class OneGeneration extends Jghsd {
    void get()
    {
        System.out.println("One generation");
    }
}
class SecondGeneration extends OneGeneration {
    void ddsg(){
        System.out.println("second generation");
    }
}
class ThirdGeneration extends SecondGeneration {
    void sss(){
        System.out.println("Third Generation");
    }
}
public class FirstExample {
    public static void main(String[] args){
        Kkjsh k = new Kkjsh();
        k.hsd();
        k.yfj();

        Bbb b = new Bbb();
        b.hsd();
        b.tthh();

        ThirdGeneration t = new ThirdGeneration();
        t.hsd();
        t.sss();
        t.ddsg();
        t.get();


    }
}
