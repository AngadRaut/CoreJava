package Variable;
class Types{
    int empty;
    static String b;
    protected int c;
    public float d;
    double e;
}
public class TypesOfVariables extends Types {
    public static void main(String[] args) {
        TypesVariable obj = new TypesVariable();
        System.out.println(b);
         b="Java";
        System.out.println(b);
        b = "Programming";
        System.out.println(b);

        obj.empty=44;
        System.out.println(obj.empty);


    }
}
