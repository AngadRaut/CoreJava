package string;

public class SwapStrings {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "programming";
       // swap strings by using third variable
     /*   String temp = s1;
        s1 = s2 ;
        s2 = temp ;
        System.out.println("s1 = "+s1+ " s2 = "+s2 );
*/
        // swap strings here not using third variable
        s1 = s1.concat(s2);
        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length(),s1.length());
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

    }
}

