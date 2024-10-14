package array;

import java.util.ArrayList;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,11,45,23 };
        int max = 0 ;
        int secondMax = 0  ;
        /*for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.println(secondMax);
        System.out.println(max);
        */
        // remove duplicates ]
        ArrayList<Integer> list = new ArrayList<>();
        int length = arr.length;
        for(int i = 0; i<length-1 ; i++){
            for(int j = i+1; j<length ;j++){
                if(arr[i] == arr[j]){
                    arr[j] = arr[length-1];
                    j--;
                    length--;
                    list.add(arr[i]);
                }
            }
        }
        System.out.println(list);
    }
}
