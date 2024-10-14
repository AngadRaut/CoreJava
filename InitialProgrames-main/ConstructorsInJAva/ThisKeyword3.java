package ConstructorsInJAva;
class Superrr{
    Superrr(){
        System.out.println("default");
    }
    Superrr(double e){
        System.out.println("Parameterized constructor");
    }
}
public class ThisKeyword3 extends Superrr {
    ThisKeyword3(double e) {
        //super(e);
    }


   public static void main(String[] args) {
//        ThisKeyword3 r = new ThisKeyword3(333.333333);
    }

}
