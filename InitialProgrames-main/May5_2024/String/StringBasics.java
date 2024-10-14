package May5_2024.String;
import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args){
        String abc="Java";
        String abc2=new String("Programming");
        String abc3=new String("Programming");
        System.out.println("hash code of abc2 is ="+abc2.hashCode());
        System.out.println("hash code of abc3 is = "+abc3.hashCode());

        //== to check memory address
        boolean t1=(abc == abc2);
        System.out.println(t1);

        // equals() check contents in string
        boolean t2=abc.equals(abc2);
        System.out.println(t2);

        boolean t3=(abc2 == abc3);
        System.out.println(t3);

        boolean t4=abc2.equals(abc3);
        System.out.println(t4);

        Scanner obj = new Scanner(System.in);
        char a=obj.next().charAt(0);

    }
}
