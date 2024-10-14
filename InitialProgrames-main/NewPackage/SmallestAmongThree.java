package NewPackage;

import java.util.Scanner;

class SmallestNo{
    double a,b,c;
    void find(){
        System.out.println("Enter the three numbers ");
        Scanner obj = new Scanner(System.in);
        a=obj.nextDouble();
        b=obj.nextDouble();
        c=obj.nextDouble();
        if(a<b && a<c){
            System.out.println(a+" is smaller than "+b+" and "+c);
        } else if (b<a && b<c) {
            System.out.println(b+" is smaller than "+a+" and "+c);
        }
        else if (c<a && c<b){
            System.out.println(c+" is smaller than "+a+" and "+b);
        }
    }

}
public class SmallestAmongThree {
    
    public static void main(String[] args) {
        SmallestNo obj2=new SmallestNo();
        obj2.find();
    }
}
