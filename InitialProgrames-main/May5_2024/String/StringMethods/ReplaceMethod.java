package May5_2024.String.StringMethods;

/** replace() method => replace one char by another char in string
  * */
public class ReplaceMethod {
    public static void main(String[] args){
        String str1="Tata Corporation";
        String str2="Java Programming";
        String str3=new String("123412341234");
        System.out.println(str1.replace('a','b'));
        System.out.println(str2.replace('m','t'));
        System.out.println(str3.replace('1','4'));
    }

}
