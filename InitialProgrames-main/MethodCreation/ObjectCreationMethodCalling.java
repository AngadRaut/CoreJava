package MethodCreation;

public class ObjectCreationMethodCalling {
    void name(){
        System.out.println("Method ic created");
    }
   public int print(int a){
        System.out.println("Value of parameter a is"+a);
        return a*2;
    }
    protected int give(int a,int b){
        int add=a+b;
        System.out.println("add");
        return add;
    }
   public void show(int a,boolean b){
        System.out.println("The two parameters are taken");
    }
    public static void main(String[] args){
        ObjectCreationMethodCalling r = new ObjectCreationMethodCalling();
        r.name();
        r.print(2);
        r.show(2,false);

    }
}
