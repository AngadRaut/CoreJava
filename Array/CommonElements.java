package array;

public class CommonElements {
    public static void main(String[] args) {
        // Find common elements between two arrays
        int[] array1 = {1, 2, 3, 4, 5,10};
        int[] array2 = {4, 5, 6, 7, 8,10};

        for(int i = 0 ; i<array1.length ;i++){
            for(int j = 0; j< array2.length ;j++){
                if(array1[i] == array2[j]){
                    System.out.print(array1[i]+",");
                }
            }
        }
        System.out.println();
        // find distinct elements from two arrays


    }
}
