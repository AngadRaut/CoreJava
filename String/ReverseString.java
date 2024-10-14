package string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "java Programming";
        String s1 = "";
        for(int i = s.length()-1 ;i>=0;i--){
            s1 = s1 + s.charAt(i);
        }
        System.out.println(s1);

        //  for loop
       /* String input = "raut angad";
        char ch;
        String nstr = "";
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed String is : " + nstr);*/
    }
}
