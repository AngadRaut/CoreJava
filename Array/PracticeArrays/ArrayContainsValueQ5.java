package May.Arrays.PracticeArrays;


// 5. Write a Java program to test if an array contains a specific value.
public class ArrayContainsValueQ5 {
    public static void main(String[] args){
        int[] array = { 1,2,3,4,5,4,5,4,7 };
        for (int i = 0 ; i < array.length;i++){
            if(array[i] == 7){
                System.out.println("yes");
            }
        }
       // System.out.println("no");
    }
}
