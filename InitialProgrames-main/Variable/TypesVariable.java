package Variable;
class Name{
   static int aa=20;
    static int bb=100;
    static String hh="Patekar";

    public int empty;
    protected String age;
    float cc =33737.7763f;
    String dd="Nana";
    double ee=3384846574d;
    boolean ff=false;
    byte gg=46;
    void variable(){
         int age=33;
         String name;
         double value;
         int abcd;
    }


}
public class TypesVariable extends Name {
    public static void main(String[] args) {
        Name n = new TypesVariable();
       hh=hh+"\tnana";
        System.out.println(hh);

        System.out.println(n.dd);



        n.variable();

        System.out.println(n.age);
    }
}
