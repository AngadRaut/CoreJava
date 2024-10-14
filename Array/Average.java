package May.Arrays;

public class Average {
    public static void main(String[] args){
        int[] arrayA={ 1,3,4,5,6,6,4,3,3,23,9,5,24,44,54,35,56};
        double avg;
        double sum=0;
        for (int i = 0; i < arrayA.length ; i++ ){
           sum=sum+arrayA[i];
          //  avg=arrayA[i]/arrayA.length;
        }
        System.out.println("length of the array is = "+arrayA.length);
        System.out.println("sum = "+sum);
        avg=sum/arrayA.length;
        System.out.println("average = "+avg);
    }
}
