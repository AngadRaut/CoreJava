package array;

import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {
        int[] array = { 1,2,3,4,5,6,7,8,9 };
        int[] array2 = new int[array.length];
        int k = 3;

        /*for(int i = 0 ; i < k ; i ++ ) {
            array2[i] = array[array.length-i-1];
        }*/
        for(int i = 0 ; i < array.length-k   ; i++) {
            array2[i + k] = array[i];
        }
        for(int i = 0 ; i < k ; i++){
            array2[i] = array[array.length-k+i];
        }

        System.out.println(Arrays.toString(array2));

    }
}
