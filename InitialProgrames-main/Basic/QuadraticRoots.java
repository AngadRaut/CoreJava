package Basic;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Give first values");
        double a=obj.nextInt();
        System.out.println("Give Second  values");
        double b =obj.nextInt();
        System.out.println("Give third  values");
        double c=obj.nextInt();
        System.out.println(a+"x^2"+b+"x"+c);

        double x1 = ((-b)+Math.sqrt(b*b-4*a*c))/(2*a);
       // double x2 = ((-b)-Math.sqrt(b*b-4*a*c))/(2*a);

        double m = 3.3543;

        System.out.println("First values"+x1); //+"\n"+"Second value"+x2);
    }
}
