package May.Arrays;

/**Array[] => Arrays store multiple values of same data type into a single variable
 *          => code optimization,random access,but there is size limit  */
class Arrays{
    // one way of declaring array
    // int intArray [] = {10,20,30,40,50,60};
    int [] intArray={ 10,20,30,40,50,60 };


    //second way of declaring array
    double [] doublesArray=new double[10];
    // 10 is the limit of no of elements in given array
    void printArrayElement(){
//        System.out.println("int aeeay is="+printArrayElement(););
        System.out.println("first array element = "+intArray[0]);
        // print the length of doublesArray
        System.out.println("length of doublesArray is = "+doublesArray.length);

        System.out.println("element of doubles array at 0 is = "+doublesArray[0]);
        // as we haven't initializes array so default constructor will provide us default value for that element i.e 0.0 :
    }
}
public class First {
    public static void main(String[] args){
        Arrays obj = new Arrays();
        obj.printArrayElement();
    }
}
