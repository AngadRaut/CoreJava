package AbstractionClassPractice;
abstract class Rectangle{
    abstract void rectangle();
}
class Area extends Rectangle{
    @Override
    void rectangle(){
        double area =  10 *  20;
        System.out.println("Area = "+area);
    }
}

class Perimeter extends Rectangle{
    @Override
    void rectangle(){
        double perimeter = 2*(10+20);
        System.out.println("Perimeter is ="+perimeter);
    }
}
public class RectangleAreaPerimeter {
    public static void main(String[] args){
        Area A = new Area();
        Perimeter P = new Perimeter();

        A.rectangle();
        P.rectangle();
    }

}
