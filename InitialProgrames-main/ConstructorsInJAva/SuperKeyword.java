package ConstructorsInJAva;
class Temp{
    Temp(int a,int b){
        System.out.println("Add "+(a+ b));
    }
   public Temp(int r){
        this(1,4);
        double area=3.14*r*r;
        System.out.println("Circle area="+(area));
    }
    protected Temp(){
        this(5);
       System.out.println("default constructor Temp");
   }
}
class Dummy11 extends Temp{
    Dummy11(){
        super(5);
        System.out.println("dummy default");

    }
}
public class SuperKeyword extends Dummy11{
    public static void main(String[] args) {
        SuperKeyword s  = new SuperKeyword();
    }
}
