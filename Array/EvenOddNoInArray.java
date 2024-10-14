package May.Arrays;

// declaring public class
public class EvenOddNoInArray {
    // Main method
    public static void main(String[] args){
        // declaring and initializing variables which are helpful in program
        int counteven=0;
        double sumeven=0;
        int countodd =0;
        double sumodd=0;
        // declaring and initializing an int type array
        int [] intArray= { 45,5,4,3,2,65,34,23,56,4,4,6,75,2,54,56,32,6,43,6,33,65,3,7,6,5,5,54};
        // loop to print even numbers from array
        System.out.println("even numbers in given array are ");
        for( int i= 0; i < intArray.length ; i++){
            if(intArray[i] % 2 == 0){
                System.out.print(intArray[i]+",");
                counteven++;
                sumeven=sumeven+intArray[i];
            }
        }
        // printing even numbers and their sum on output string
        System.out.println("\ntotal even numbers in given array are = "+counteven);
        System.out.println("sumeven = "+sumeven);

        // loop to print odd numbers and their sum from array
        System.out.println("\nodd numbers in given arrays are ");
        for ( int i = 0 ; i < intArray.length ; i++){
            if(intArray[i] % 2 != 0 ){
                System.out.print(intArray[i]+",");
                countodd++;
                sumodd=sumodd+intArray[i];
            }
        }
        // printing odd numbers and sum of them from array
        System.out.println("\ntotal odd numbers in given array are = "+ countodd);
        System.out.println("sumodd="+sumodd);
    }
}
