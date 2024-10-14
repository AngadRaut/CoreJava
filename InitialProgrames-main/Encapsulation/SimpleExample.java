package Encapsulation;

public class SimpleExample {
    private int a=10;
    private int b=20;
     private String d="java";
     public void setA(int a){
         this.a=a;
     }
     public int getA(){
         return a;
     }
     public void setD(String d){
         this.d=d;
     }
     public String getD(){
         return d;
     }
     SimpleExample(){
         System.out.println("default constructor");
     }
     SimpleExample(int b){
         this.b=b;
     }
     public int getB(){
         return b;
     }
     public static void main(String[] args){
         SimpleExample obj = new SimpleExample(4);
         System.out.println("b="+obj.getB());
         obj.setA(44);
         System.out.println(obj.getA());
         obj.setD("vvv");
         System.out.println("string = "+obj.getD());
     }
}
