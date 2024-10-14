package ConstructorsInJAva;

public class ThisKeyword2 {
    ThisKeyword2(int a,int b){
        System.out.println("Add "+(a+ b));
    }
    public ThisKeyword2(int r){
        this(5,7);
        double area=3.14*r*r;
        System.out.println("Circle area="+(area));
    }
    protected ThisKeyword2(){
        this(4);
        System.out.println("default constructor Temp");
    }

    public static void main(String[] args) {
        ThisKeyword2 t = new ThisKeyword2();
//        ThisKeyword2 r = new ThisKeyword2(4);
//        ThisKeyword2 s = new ThisKeyword2(4,6);
    }
}
