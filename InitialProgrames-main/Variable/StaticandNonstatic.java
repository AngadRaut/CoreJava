package Variable;

public class StaticandNonstatic {
    static int var1=10;
    int var2=10;

    public static void main(String[] args) {
        StaticandNonstatic b = new StaticandNonstatic();
        b.var1=20;

        b.var2=20;

        StaticandNonstatic c = new StaticandNonstatic();
        c.var1=1;

        c.var2=1;

        System.out.println(b.var1);
        System.out.println(b.var2);

        System.out.println(c.var1);
        System.out.println(c.var2);



    }
}
