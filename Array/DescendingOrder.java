package May.Arrays;


// descending order program

public class DescendingOrder {
    public static void main(String[] args){
        double[] array = { 102,109,105,101,104,107,106,103,100,111 } ;

        for(int i = 0 ; i < array.length ; i ++){
             for( int j = i + 1 ; j < array.length ; j ++){
                 if (array[i]<array[j]){
                     double temp = array[i];
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
