package May.Arrays;

public class CopyArrayIntoAnother2 {
    public static void main(String[] args){
        int[] intArray = { 1,3,4,5,56,663,35,45,22,5,65,454,6,57,88,99,556,35,456,456,456,3456,345,45,44,
                45,456,456,3456,34,34,34,34,6,667,767,67,67,5543,45652,66,24,422,4,6,4,52,10,2,225,5 };
        // declaring another array
        int[] intArray2=new int[intArray.length];
        // declare an method
        for (int i=0;i < intArray.length;i++) {
            intArray2[i]=intArray[i];
            System.out.print(intArray2[i]+" ");
        }
    }
}
