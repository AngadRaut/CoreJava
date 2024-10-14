package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ZeroesToLeft {
    public static void main(String[] args) {
        byte b = -128 ;
        byte c = 127 ;
        int a = 1757890909 ;
        int[] ar = { 1,2,0,2,5,0,0,5,3,0,0 };

        List<Integer> l = Arrays.asList(1,2,3,6,8,9,3,5,4);
        System.out.println(l);
        Integer max = l.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

        // find the second max
        List<Integer> i = l.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).toList();
        System.out.println(i);

   /*     for(int i = 0 ; i < ar.length ; i++){
            for( int j = i+1 ; j < ar.length ; j++){
                if(ar[i] > ar[j]){
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp ;
                }
            }
        }
        System.out.println("zeroes to the left ");
        System.out.println(Arrays.toString(ar));*/
    }
}
