package Polymorpism.MethodOverloading;

public class MethodOverloading {
    /** Method overloading by chainging the no of arguments */
    void addition(int a,int b){
        int sum=a+b;
        System.out.println("sum of two numbers = "+sum);
    }
    void addition(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("sum of three numbers = "+sum);
    }
    /** method overloading by chainging the data tyoe of parameter */
    void substraction(int a,int b,int c){
        int sub=a-b-c;
        System.out.println(sub);
    }
    void substraction(double a,float b,double c){
        double sub=a-b-c;
        System.out.println(sub);
    }
    /** method overloading by chainging sequance of data type of parameters */
    int multiplication(int a,float b,double c){
        double mul=a*b*c;
        System.out.println(mul);
        return 0;
    }
    int multiplication(double a,float b,int c){
        double mul=a*b*c;
        System.out.println(mul);
        return  0;
    }
    public int division(int a,int b){
        int div=a/b;
        System.out.println(div);
        return 0;
    }
//    public int division(int c,int d){
//        int div =c/d;
//        System.out.println(div);
//        return  0;
//    }
//    public void division(int c,int d ){
//        int div=c/d;
//        System.out.println(div);
//    }

    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading();
        obj.addition(21,22,33);
        obj.addition(2,4,7);
        obj.substraction(1,3,5);
        obj.substraction(66.77,66f,777.66);

        obj.multiplication(1,33.4f,3333333L);
        obj.multiplication(3233233223L,332.4342432f,32332);
    }
}
