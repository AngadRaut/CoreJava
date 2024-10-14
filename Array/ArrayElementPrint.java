package May.Arrays;


class PrintElements{
    void Print(){
        int [] arrayElement = { 10,20,30,40,50,60,70,80,90,100 };
        System.out.println("int array length is = "+arrayElement.length);

        String []stringArray  = { "Java","c++","Pythan","Perl","Java Script"};
        System.out.println("string array length is = "+stringArray.length);

         for(int i=0 ; i<arrayElement.length;i++){
             System.out.println("array element of int array at "+i+" is "+arrayElement[i]);
         }
        System.out.println("\nfor string");
         for (int i=0;i<stringArray.length;i++){
             System.out.println("array element of string array at "+i+" is "+stringArray[i]);
         }
    }
}
public class ArrayElementPrint {
    public static void main(String []args){
        PrintElements obj = new PrintElements();
        obj.Print();
    }
}
