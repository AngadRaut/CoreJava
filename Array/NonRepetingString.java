package array;

import java.util.Arrays;

public class NonRepetingString {
    public static void main(String[] args) {
        String s = "java programming is best among all other java is programming";
        String[] string_array  = s.split(" ");
        System.out.println(Arrays.toString(string_array));
        for(int i = 0 ; i<string_array.length ; i++){
            int count = 0 ;
            for(int j = 0 ; j< string_array.length ; j++){
                if(string_array[i].equals(string_array[j])){
                    count++;
                }
            }
            if(count ==1){
                System.out.println(string_array[i]);
                break;
            }
        }
    }
}
