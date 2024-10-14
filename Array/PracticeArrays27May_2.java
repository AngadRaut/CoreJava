package May.Arrays;

// programme to find the frequency of two characters from given string
// program to find the frequency of array element
// find the frequency of an substring from given string


public class PracticeArrays27May_2 {
    public static void main(String[] args){
        String array1 =  "java is the best programming java is platform independent java is robust";
        int [] array2 = { 1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5 } ;
        // program to find the frequency of array element's 1 and 5 from array2 using one for loop
       int count1 = 0 ;
       int count5 = 0 ;
        for(int i = 0 ; i < array2.length ; i ++){
            if(array2[i] == 1){
                count1 = count1 + 1;
            }
            if(array2[i] == 5){
                count5 = count5 + 1 ;
            }
        }
//        System.out.println("in the array2 the frequency of element 1 in given array is = "+count1+" " +
//                "and element 5 is = "+count5);

        // programme to find the frequency of two characters a and j from given string
        int countA = 0 ;
        int countJ = 0 ;
        for(int i = 0 ; i < array1.length() ; i ++ ) {
            if (array1.charAt(i) == 'a') {
                countA = countA + 1; // or count++;
            } else if (array1.charAt(i) == 'j') {
                countJ = countJ + 1;
            }
        }
//            System.out.println("in the given array1 frequency of char a is = "+countA+
//                    " and char j is = "+countJ);

        /** To find the frequency of substring from the given string =>first we have to convert the string
         * to array
         * */
        String[] arrayString = array1.split(" ");
        for(int i=0 ; i < arrayString.length ; i ++){
            System.out.print(arrayString[i]+" ");
        }
        System.out.println("");
        int countJava = 0 ;
        int countIs = 0 ;
        for(int i = 0 ; i < arrayString.length;i++){
            if(arrayString[i].equals("java")){
                countJava = countJava + 1 ;
            }
            else if(arrayString[i].equals("is")){
                countIs = countIs + 1 ;
            }
        }
        System.out.println("frequency of substring java in given string is "+countJava+"\nand that of is substring " +countIs);
    }
}
