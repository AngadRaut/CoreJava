package May5_2024.Polymorphism.UpcastingAndDowncasting;

//  Narrow casting=> higher data type is transfered into lower data type
public class NarrowCasting {
    public static void main(String[] args){
        double dub=44444444;
        float flot=555.555f;
        int a = (int) flot;
        System.out.println(a);

         short sho=(short) dub;
        System.out.println(sho);
    }
}
