package Inheritance;
class mango{
    void give(){
        System.out.println("Mango is National froot of india");
    }
}
class about extends mango{
    int it(){
   System.out.println("It is one of the pulpiest,juicy and luscious fruits");
   return 0;
    }
}
class king extends about{
    float value(boolean a){
        System.out.println("Mango is known as the king of fruits");
        return 0;
    }
}
class property extends king{
    char show(){
        System.out.println("Mangoes comes in various shapes and sizes,are rich in vitamins and minerals");
        return 8;
    }
}
class season extends property{
    byte summer(){
        System.out.println("Mangoes mostly grown in summer season and is a summer fruit");
        return 3;
    }
}
class test extends season{
    long abc(int a,int b){
        System.out.println("They are sweet and sour flavoured");
        return 2;
    }
}
class color extends test{
    void is(boolean b){
        System.out.println("They are primarily in green and yellow colour");

    }
}
public class MultilevelInheritanceMango extends color {
    public static void main(String[] args){
        MultilevelInheritanceMango r = new MultilevelInheritanceMango();
        r.give();
        r.it();
        r.value(true);
        r.show();
        r.summer();
        r.abc(1,5);
        r.is(false);
    }

}
