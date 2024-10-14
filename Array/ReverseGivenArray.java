package May.Arrays;

// reverse the array elements

public class ReverseGivenArray {
    public static void main(String[] args){
        String[] stringArray = { "java", "programming","is","the","best","among","all","other","programming"};
        // for-loop to reverse the array
        for(int i = stringArray.length - 1 ; i >=0  ; i --){
            System.out.print(stringArray[i]+" ");
        }
    }
}
