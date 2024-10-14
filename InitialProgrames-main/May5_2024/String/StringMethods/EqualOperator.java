package May5_2024.String.StringMethods;

/** == operator => checks memory address of string
 * using new keyword => heap memory => always create new string object in memory
 * using literal => scp(string constant pool) => first check,if object is already created
 *                                           use it else create new string object*/

public class EqualOperator {
    public static void main(String[] args){
        String xyz="XYZ";
        String xyz2=new String("XYZ");

    }
}
