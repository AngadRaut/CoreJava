package May.Arrays;

public class FrequencyOfNoInArray {
    public static void main(String[] args){
        double [] doubleArray = { 5,5,3,33,2,7,1,34,3,53,33,23,23,23,1,1,2,2,3,3,4,5,5,6,2,21,1,3,4,5,6,5,5};
        int no = 5;
        int count=0;
        for(int i = 0 ; i < doubleArray.length ; i++){
            if(doubleArray[i] == no){
                count++;
            }
        }
        System.out.println("frequency of given no in array is = "+count);
    }
}
