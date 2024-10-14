package May5_2024.Polymorphism.RunTimePol;
/**Rules of Runtime Polymorphism*/
/* 1) In java, Method can only overriden in child class ,not in same class.
   2) The argument list/ method signature must be exactly same as that of overridden parent class method
   3) Return type must be same for  parent and child classes
* */
class ParentClass{
    void show(){
        System.out.println("show method in parent class");
    }
    int test(int a,int b){
        int add=a+b;
        System.out.println("Return method add = "+add);
        return add;
    }
    double dummy(String a,String b ){
        String dummy=a+b;
        System.out.println("double method return string add= "+dummy);
        return 0;
    }
}
class ChildClass1 extends ParentClass{
    @Override
    void show(){
        System.out.println("Overridden method in childclass1");
    }
    @Override
    int test(int a,int b){
        int sub=a-b;
        System.out.println("overriden method in child class1 sub = "+sub);
        return sub;
    }
    @Override
    double dummy(String a,String b){
        String name=a+b+34;
        System.out.println("overriden method in child class1 string name = "+name);
       return 0;
    }
}
class ChildClass2 extends ParentClass{
    @Override
    void show(){
        System.out.println("Overriden method show in childclass2");
    }
    @Override
    int test(int a,int b){
       int sum=a+b+3444;
        System.out.println("overriden method test in class childclass2 sum = "+sum);
        return sum;
    }
    @Override
    double dummy(String a,String b){
        String add=a+b+"tatya";
        System.out.println("Overriden method dummy in child class2 string ="+add);
        return 0;
    }
}
public class Rule123  {
    public static void main(String[] args){
       // ParentClass obj = new ParentClass();
        //ChildClass1 obj = new ChildClass1();
        ChildClass2 obj = new ChildClass2();
        obj.show();
        obj.test(2,4);
        obj.dummy("java"," programming ");
    }
}
