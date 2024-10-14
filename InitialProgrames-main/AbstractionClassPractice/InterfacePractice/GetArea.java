package AbstractionClassPractice.InterfacePractice;

interface Square
{
    void areaSquare();
}
interface Rectangle
{
    void areaRectangle();
}
interface Circle
{
    double areaCircle();
}
public class GetArea implements Square,Rectangle,Circle
{
    @Override
   public void areaSquare()
    {
        int side=20;
        double area = side*side;
        System.out.println("Area of Square is = "+area);
    }
    @Override
  public  void areaRectangle()
    {
        int length = 4;
        int width = 3;
        double area = length*width;
        System.out.println("Area of Rectangle is = "+area);

    }
    @Override
   public double areaCircle()
    {
        int radius=25;
        float pi=3.14f;
        double areaC= pi*radius*radius;
        System.out.println("Area of Circle is ="+areaC);
        return areaC;

    }
    public static void main(String[] args){
        GetArea abcc = new GetArea();
        abcc.areaSquare();
        abcc.areaRectangle();
        abcc.areaCircle();
    }
}
