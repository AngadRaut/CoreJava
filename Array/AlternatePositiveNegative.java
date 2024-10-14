package array;
import java.util.Arrays;

// arrange array elements in the way of alternate positive and negative
public class AlternatePositiveNegative {
     static public final void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, -1, -4, -5, -6, -4, 4, 5, 7, 0, 8, 7, 6, -6, -5, -3,99,80,-11,-23,-4,5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i % 2 != 0) {
                    if (arr[i] > 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
         System.out.println(Arrays.toString(arr));
    }
}
