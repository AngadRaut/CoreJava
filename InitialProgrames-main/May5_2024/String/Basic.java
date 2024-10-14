package May5_2024.String;
/**  String ==> strings are objects that allows us to store sequence of
 *              characters which may contain alpha numeric values enclosed in curly braces
 *              ==> sequanced collection of characters represented in curly brackets
 *
 *             1) length() => to calculate no of characters in given string
 *             2) concat() => to connect/add new string in old
 *             3) hashcode()=> is a function/method of object class in java that returns unique hash
 *                             value(int format) for every string value
 *             4) equals() => compare containts of string objects
 *             5) == operator=> compare memory address of string objects*/


public class Basic {
    public static void main(String[] args){
       // string can store any type of value in curly brackets
        String number="123";
        String doublevalue="7467675437738.734878";
        String booleanvalue="true";
        String mix="123 Java Programming";

        String obj =new String("java123");// ==>Using new keyword ==> object stores in heap memory
         System.out.println(obj+":length = "+obj.length());//7 find the length of string
        obj=obj.concat(" Java123");
        System.out.println("after concat java123 becomes = "+obj+" And its length = "+obj.length());

        String literal="java";  // Using literal==>objects store in perm gen (String constant pool)
        System.out.println(literal+" :length= "+literal.length());

        literal=literal.concat(" Programming");
        System.out.println("after concat programming becomes = "+literal+" And its length = "+literal.length());
    }
}
