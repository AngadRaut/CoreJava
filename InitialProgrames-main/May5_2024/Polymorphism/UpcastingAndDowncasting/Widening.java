package May5_2024.Polymorphism.UpcastingAndDowncasting;

//   Widening in java => lower data type is transfered into higher data type
public class Widening {
    public static void main(String[] args){
        int a=34;
        long l=a;
        double d=a;
        float f=a;
        System.out.println("long ="+l+"\ndouble="+d+"\nfloat="+f);
    }
}
