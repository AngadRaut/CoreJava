package May.Arrays;

// public class
public class CopyArrayIntoAnother {
    // main method
    public static void main(String [] args){
        double sum=0;
        double average=0;
        // declaring and initializing an array
        int[] array1 = { 1,2,3,4,5,6,7,8,9,11,12,23,445,56,66,465,436,4,807,76,54654,876,523,665,9,8,7,6,55 };
        // declaring another array
        double[] array2 = new double[array1.length];
        // using for loop
        for( int i = 0 ; i < array1.length ; i++){
            // assigning elements of array1 to array2
            array2[i] = array1[i];
            // printing array2 elements
            System.out.print(array2[i]+" ");
            // adding elements off array2 and find overall sum
            sum =sum + array2[i] ;

        }
        System.out.println("sum of elements in array2 is = "+sum);
    }
}
