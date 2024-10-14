package string;

public class SCPandNEW {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("java");
        String s4 = new String("java");
        System.out.println("checking s1 and s2 using == operator -> "+(s1 == s2));
        System.out.println("checking s3 and s4 using == operator -> "+(s3 == s4));
    }
}
