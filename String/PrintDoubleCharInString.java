package string;

public class PrintDoubleCharInString {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "";
        for(int i = 0 ; i < s.length() ;i++){
            s1 =s1 + s.charAt(i) + s.charAt(i);
        }
        System.out.println(s1);
    }
}
