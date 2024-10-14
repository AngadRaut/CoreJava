package array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,1,2,3,4,6,7,8,9};
        int length = arr1.length;
        for( int i = 0 ; i < length ; i++ ){
            for( int j = i + 1 ; j < length-1 ; j++ ){
                if(arr1[i] == arr1[j]){
                    arr1[j] = arr1[length-1];
                    j--;
                    length--;
                }
            }
        }
//        for(int i = 0 ; i < arr1.length ; i++){
//            System.out.print(arr1[i]+",");
//        }
        Integer[] arr = Arrays.copyOf(arr1,length);
        System.out.println(Arrays.toString(arr));

       /* List<Integer> list = new ArrayList<>();
        for(Integer i : arr1){
            list.add(i);
        }
        System.out.println("list = "+list);


        // remove duplicates from array
        String [] arr = {"nana","java","pro"};
        List<Integer> a = Arrays.asList(arr1);
        System.out.println(a);*/

    }
}
