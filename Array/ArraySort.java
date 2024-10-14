package array;


import java.util.Arrays;

//  Sort an array without using in-built method
public class ArraySort {
    public static void main(String[] args) {
        int[] ar = {23,45,67,89,8,7,65,45,32,12,12,13,45};
        // sort in ascending order
     /*   for(int i = 0 ; i < ar.length ; i++){
            for(int j = i + 1  ; j < ar.length ; j ++){
                if(ar[i] > ar[j]){
                    int temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        for(int i = 0 ; i < ar.length ; i ++){
            System.out.print(ar[i]+",");
        }*/

        // sort in descending order
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        for(int i = 0 ; i < ar.length ; i++){
            for(int j = i + 1 ; j < ar.length ; j ++){
                if(ar[i] < ar[j]){
                    int temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp ;
                }
            }
        }
        for(int i = 0 ; i < ar.length ; i ++){
            System.out.print(ar[i]+",");
        }
    }
}
