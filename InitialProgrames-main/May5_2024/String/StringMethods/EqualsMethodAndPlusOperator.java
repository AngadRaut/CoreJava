package May5_2024.String.StringMethods;

public class EqualsMethodAndPlusOperator {
    public static void main(String [] args){
        String a1="Hellow";
        String a2=new String(" World");
        String a3=null;

        // concatenation using plus(+) operator
        System.out.println("a1 + a2 = "+(a1 + a2));
        System.out.println("a2 + a3 = "+(a2 + a3));
        System.out.println("a1 + a3 = "+(a1 + a3));

        // concatenation using concat() method
        System.out.println("a1.concat(a2) = "+a1.concat(a2));
        System.out.println("a2.concat(a3) = "+a2.concat(a3));    // not possible exception throws
        System.out.println("a1.concat(a3) = "+a1.concat(a3));    // not possible exception throws
    }
}
