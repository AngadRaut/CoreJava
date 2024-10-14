package ConditionalStatements;

import java.util.Scanner;

public class SwitchConditionVowels {
    public static void main(String[] args) {
        //char vowel,a; ;
        System.out.println("Enter the Alphabet");
        Scanner r = new Scanner(System.in);
        // String v = r.next().charAt(0);
        String v = r.nextLine();
        //System.out.println("Your  input is :" + v);

        int  C = v.replaceAll("aeiou","").length();

        switch(v) {
           // case 'a':
            //    System.out.println("Given input is vowels");
         //   break;
       //     case 'o':
           //     System.out.println("Given input is vowels2");

        }
    }
}
