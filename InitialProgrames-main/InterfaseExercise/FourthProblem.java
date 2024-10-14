package InterfaseExercise;
interface Resizable{
    void resizeHeight(int height);
    void resizeWidth(int width);
}
class Rectangle implements Resizable{
    int height,width;
    public void resize(int height,int width){
        this.height=height;
        this.width=width;

    }

    @Override
    public void resizeHeight(int height) {
        this.height=height;

    }

    @Override
    public void resizeWidth(int width) {
        this.width=width;

    }

}
public class FourthProblem extends Rectangle {


    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.resizeHeight(2);
        r.resizeWidth(1);
        System.out.println("resize height="+"height"+"resize width ="+ "width");
    }
}
