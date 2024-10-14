package May5_2024.String.StringMethods;

/** contains() method in string class => checks whether the specified string(sequence of characters)
 *                                      are present in in string or not..
 *                                      = returns true if string is present in given string
 *                                      = returns false if string is not present in given string
 * */
public class ContainsMethod {
    public static void main(String[] args){
        String b= new String("Java programming is the best programming");
        System.out.println(" check contains in given string using contains method "+b.contains("is"));

        System.out.println(" check contains in given string using contains method "+b.contains("given"));
    }
}
