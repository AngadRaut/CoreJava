package May5_2024.String;

/** hashCode() => is a function/method of object class in java that returns unique hash
 *                value(int format) for every string value */

public class StringHashCode {
    public static void main(String[] args){

        String abc=new String("Java");    //store object in heap memory
        String name=new String("java");  // heap memory
        String id="java";                        // perm gen / (string constant pool)
        String name2="JAVA";

        System.out.println("hash code of abc is = "+abc.hashCode()+"\nhash code of name is = "+name.hashCode()+
                "\nhash code of id is = "+id.hashCode());
        /** comparing two strings using hash code
         *  1) == operator ==> if they are pointing to same memory address
         *  2)equals() method ==> if you want to compare containts of string
         *  */
        boolean A = (name==id);
        boolean B =name.equals(id);
        System.out.println("compare strings (name and id) memory address "+A);//false because name-heap and id-perm gen
        System.out.println("compare string (name and id) containts "+B);//true same content i.e Java

    }
}
