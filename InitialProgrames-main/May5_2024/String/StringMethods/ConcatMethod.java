package May5_2024.String.StringMethods;

/** concat() => join two strings / method concatenate two strings and returns it  */

public class ConcatMethod {
    public static void main(String[] args){

        String Abc="java";
        String Abc2=new String("programming");

        // concatenate string Abc and string Abc2
        System.out.println("after concatenating strings Abc and Abc2 new string is = "+Abc.concat(Abc2));

        // concatenate strings Abc2 and Abc
        System.out.println("after concatenating strings Abc2 and Abc new string is = "+Abc2.concat(Abc));

        // concatenate two strings using + operator
        // concatenate Abc and Abc2
        String c= Abc+Abc2;
        System.out.println("after concatenating two strings Abc and Abc2 using (+) operator " +
                "new string is = "+c);

        // concatenate Abc2 and Abc
        System.out.println("after concatenating two strings Abc2 and Abc using (+) operator " +
                "new string is ="+(Abc2+Abc));

        System.out.println(Abc.concat("programming12345"));
        Abc=Abc.concat("123");
        System.out.println(Abc);
    }
}
