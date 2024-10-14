package Polymorpism.MethodOverloading;

public class PrivateMethodOverload {
    private int addition(){
        System.out.println("No Parameter method");
        return 0;
    }
    private void addition(int a,int b){
        int sum=a+b;
        System.out.println("sum of digits = "+sum);
    }
    private void addition(String a,String b){
        String sum=a+b;
        System.out.println("String Addition is = "+sum);
    }
    public void addition(int a,String b){
        String sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args){
        PrivateMethodOverload obj = new PrivateMethodOverload();
        obj.addition();
        obj.addition(2,4);
        obj.addition(2," PrivateMethod");
        obj.addition("java ","programming");
    }
}
