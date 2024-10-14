package string;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurence {
    public static void main(String[] args) {
        // Java program to count Occurrences of Each
        // Character in String
        String s = "java programming";
        char[] ar = s.toCharArray();
        ArrayList<Character> al = new ArrayList();
        for(char c : ar){
            al.add(c);
        }
        System.out.println(al);
        Map<Character,Long> m = al.stream().collect(Collectors.groupingBy(a -> a,Collectors.counting()));
        System.out.println(m);

      /*  int len = s.length();
        for(int i = 0 ; i < len-1 ; i++){
            int count = 0 ;
            for(int j = i+1 ; i < len ; j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                    System.out.println(s.charAt(i)+" = "+count);
                }
                len -- ;
                j --;
            }
        }*/
    }
}
