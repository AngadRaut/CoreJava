package array;


// find odd even no's and count them
public class FindOddEven {
    public static void main(String[] args) {
        double[] arr = {10.00,33.00,35.00,56.00,67.00,12.00,57.00};
        int even_count = 0;
        int odd_count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i] +" is even");
                even_count++;
            }
            else {
                System.out.println(arr[i] +" is odd");
                odd_count++;
            }
        }
        System.out.println(even_count+" even no in array\n"+odd_count+"odd no in array");
    }
}
