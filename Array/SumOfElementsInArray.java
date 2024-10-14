package May.Arrays;

class Sum{
    // declaring and initializing an array
    double[] doubleArray={ 10,20,30,40,50,60,70,80,90,100};
    // declaring and initializing double type variable
    double sum=0;
    void sum(){
        for (int i = 0 ; i < doubleArray.length ; i++){
         sum = sum + doubleArray[i] ;
        }
        System.out.println("Sum of elements of given array is = "+sum);
    }
}

public class SumOfElementsInArray {
    // declaring main method
    public static void main(String [] args){
        // creating object of Sum class
        Sum obj = new Sum();
        // calling the sum method by using obj reference
        obj.sum();
    }
}
