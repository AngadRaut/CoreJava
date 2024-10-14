package Inheritance;
class greatGrandParents{
    void show(){
        System.out.println("This method belongs to Great Grand Parents");
    }
}
class grandParents extends greatGrandParents{
    void test(){
        System.out.println("This method belongs to Grand Parents");
    }
}
class parents extends grandParents{
    void give(){
        System.out.println("This method belongs to Parents");
    }
}
class children extends parents{
    void child(){
        System.out.println("This method belongs to Children ");
    }
}
class grandChildren extends children{
    void take(){
        System.out.println("This method belongs to GrandChild");
    }
}

public class MultilevelInheritance extends grandChildren{
    public static void main(String[] args){
        MultilevelInheritance r = new MultilevelInheritance();
        r.child();
        r.give();
        r.show();
        r.test();
        r.take();
    }
}
