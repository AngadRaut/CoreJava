package May.Arrays;

public class AscendingOrder {
    public static void main(String[] args){
        int[] array={ 6,4,9,11,65,90,32,56,7,8,5,3,76,54,32,23,2,12 } ;
        for(int i = 0 ; i < array.length ; i ++){
            for( int j = i + 1 ; j < array.length ; j ++){
                if(array[i] > array[j]){
                    int temp = array[i] ;
                    array[i] = array[j] ;
                    array[j] = temp ;
                }
            }
        }
        for( int i = 0 ; i < array.length ; i ++){
            System.out.print(array[i]+" ");
        }

    }
}
