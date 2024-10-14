package May.Arrays;

/** 1) find length of an array
 * 2) print all the elements of an array
 * 3) sum of all elements
 * 4) even/odd no from array add them count them
 * 5) find the average of given no's from given array
 * */
public class PracticeArrays27May {
    // main method
    public static void main(String[] args){
        // declaring and initializing an sting,double and int type array respectively
        String [] arrayString = { "java","is","the","best","programming","language"};
        double[] arrayDouble = { 1001,1002,1003,1004,1005,1001,1002,1003,1004,1005,1001,1002,1003,1004,1005};
        int[] arrayInt = { 1,2,3,4,5,1,2,3,4,5,1,2,3,4,5 };

        // finding length of an each array
        System.out.println("length of an arraystring is = "+arrayString.length+"\nlength of an arrayDouble is = " +
                ""+arrayDouble.length+"\nlength of an arrayInt is = "+arrayInt.length);

        // print the all elements of an arrayString at each index
        for(int i = 0 ; i < arrayString.length ; i++){
            System.out.println("array element of arrayString at index "+i+" is = "+arrayString[i]);
        }

        //print all the elements of an arrayInt at each index
        for( int i = 0 ; i < arrayInt.length ; i ++){
            System.out.println("array element of arrayInt at index "+i+" is = "+arrayInt[i]);
        }
        // sum of all elements of an double array
        double sum=0;
//        for ( int i = 0 ; i < arrayDouble.length ; i ++){
//            sum = sum + arrayDouble[i] ;
//        }
//        System.out.println("sum of all elements of double array is = "+sum);

        // print the even/odd elements from given int/double array count them and find their sum
        int count = 0 ;
        for (int i = 0 ; i < arrayInt.length ; i ++){
            if(arrayInt[i] % 2 == 0){
                System.out.println(arrayInt[i]);
                sum = sum + arrayInt[i] ;
                count = count + 1 ;
            }
        }
        System.out.println("even no's in above arrayInt are = "+count+"\nand their sum = "+sum);

        // find the average of arrayDouble elements
        double average;
        double sum2=0;
        for(int i=0;i<arrayDouble.length;i++){
            sum2=sum2+arrayDouble[i];
        }
        average = sum2/arrayDouble.length;
        System.out.println("average of arrayDouble is = "+average);
    }

}
