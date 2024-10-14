package May.Arrays.Basics;

import java.util.Arrays;

// convert given string to array
public class StringToArray {
    public static void main(String[] args){
        String name = "I am learning the java programming ";
        // converting string to array
        String[] nameArray = name.split(" ");
        System.out.println(Arrays.toString(nameArray));
        System.out.println(nameArray[4]);
    }
}
