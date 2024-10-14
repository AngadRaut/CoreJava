package Variable;

public class StaticandNonStaticVariables {
    static int a=100;
    int b =100;
    static String name="Java";
    String name1="Programming";
    static float c=10.55f;
    float d = 10.55f;
    static boolean e = true;
    boolean f = true;

    public static void main(String[] args) {
        System.out.println("static data members while defined 1st time "+a+"\t"+name+"\t"+c+"\t"+e);
        //System.out.println(name1);    // cannot access non static variables without creating object of class
        StaticandNonStaticVariables rr= new StaticandNonStaticVariables();
        System.out.println("non static data members while defined 1st time "+rr.b+"\t"+rr.name1+"\t"+rr.d+"\t"+rr.f);

        StaticandNonStaticVariables obj = new StaticandNonStaticVariables();
        obj.a=200;
        obj.b=200;
        obj.name="Java1";
        obj.name1="Programming1";
        obj.c=20.55f;
        obj.d=20.55f;
        obj.e=false;
        obj.f=false;
        System.out.println("\n static data members after 1st time object created " +
                ""+a+"\t"+name+"\t"+c+"\t"+e);         //for static variables/data members

        System.out.println("non static data members after 1st time object created " +
                ""+obj.b+"\t"+obj.name1+"\t"+obj.d+"\t"+obj.f);


    }

}
