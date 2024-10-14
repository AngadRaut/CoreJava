package May.Arrays;

// import scanner class
import java.util.Scanner;
public class FrequencyOfCharInArray {
    public static void main(String[] args) {
        char[] charArray = {'f', 'd', 'a', 'a', 'v', 'v', 's', 's', 't', 't', 't', 'r', 'r',
                            'y', 'y', 'e', 'e', 't'};
        int count = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check its frequency in given array");
        char ch = sc.next().charAt(0);
        for( int i = 0 ; i < charArray.length ; i++){
            if(charArray[i] == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
