package May5_2024.String.StringMethods;

/**  equals() method => checks contents of string
 * */

public class EqualsMethod {
    public static void main(String[] args){
        String abc="Java";
        String abc2=new String("Java");
        String abc3=new String("Programming");
        String abc4="Programming";

        boolean t1=abc.equals(abc2);
        System.out.println("comparing two strings abc and abc2 "+t1); // true

        boolean t2=abc3.equals(abc4);
        System.out.println("comparing two strings abc3 and abc4 "+t2);  //true

        boolean t3=abc.equals(abc3);
        System.out.println("comparing two strings abc and abc3 "+t3);    // false

    }
}
