package May5_2024.String.StringMethods;

/** equalsIgnoreCase() => compare two strings by ignoring case consideration
 * */
public class EqualsIgnoreCaseMethod {
    public static void main(String[] args){
        String h=new String("LEARN JAVA");
        String i="learn java";
        String j=null;

        System.out.println("h and i strings compare using equalsIgnoreCase() method result " +
                "is = "+h.equalsIgnoreCase(i));     // true

        System.out.println("h and j strings compare using equalsIgnoreCase() method result " +
                "is = "+h.equalsIgnoreCase(j));    // false
    }
}
