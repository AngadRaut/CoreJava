package array;


// add alternate no's in array
public class AddAlternate {
    public static void main(String[] args) {
        int[] arr = { 11,9,89,5,5,6,5,3,4,2,1 };
        int sum_even_place=0;
        int sum_odd_place=0;
        for(int i = 0 ; i<arr.length ; i++){
            if(i%2==0){
                sum_even_place = sum_even_place+arr[i];
            }
            else {
                sum_odd_place = sum_odd_place+arr[i];
            }
        }
        System.out.println("even place element sum = "+sum_even_place+" \nodd places element sum = "+sum_odd_place);
    }
}
