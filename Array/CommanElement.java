package May.Arrays;

public class CommanElement {
    public static void main(String[] args){
        int[] array1={ 1,2,3,4,5,6,7,8,9 };
        int[] array2={2,4,6,8};
        int[] array3=new int[array1.length];
        for(int i = 0 ; i < array1.length ; i ++){
            for(int j = 0;j< array2.length;j++){
                if(array1[i]==array2[j]){
                    array3[i]=array1[i];
                    System.out.print(array3[i]+" ");
                }
            }
        }
        System.out.println(array3);
        //System.out.println("length of array 3 is = "+array3.length);
//        for(int i= 0 ; i < array2.length;i++){
//            System.out.print(array3[i]+" ");
//        }
       // System.out.print(array3);
    }
}
