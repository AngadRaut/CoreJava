package array;
import java.util.Arrays;

public class UnionOfThree {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 345, 675, 5, 6, 8, 9, 56, 90, 56, 1};
        int[] arr2 = {11, 22, 33, 56, 78, 90, 1, 2, 5, 4, 3, 7, 9};
        int[] arr3 = {122, 345, 678, 345, 675, 543, 11, 22, 78, 7, 9, 90, 33, 325, 1};
        int len = arr.length + arr2.length + arr3.length;
        int[] arr4 = new int[len];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    arr4[i] = arr[i];
                    arr4[i+arr.length] = arr2[j];
                    arr4[i+arr.length+arr2.length] = arr3[k];
                }
            }
        }
        System.out.println(Arrays.toString(arr4));
    }
}
