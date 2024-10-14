package Variable;

public class DeclareStaticVar {
    static int a=0;
    DeclareStaticVar(){
        a++;
        //System.out.println(a);
    }
   void increment(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        DeclareStaticVar obj = new DeclareStaticVar();
        //DeclareStaticVar obj2= new DeclareStaticVar();
       // DeclareStaticVar obj3 = new DeclareStaticVar();

        obj.increment();
        obj.increment();
        obj.increment();

       // obj.increment();
    }
}
