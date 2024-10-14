package ConstructorsInJAva;
class ThisKeyword11{
    ThisKeyword11(){
        this(3);
        System.out.println("Student Information");

    }
    ThisKeyword11(int Rollno){
        this("ram");
        System.out.println("Roll No:"+Rollno);
    }
    ThisKeyword11(String name){
        System.out.println("Name:"+name);
    }
}
class SuperKeyword11 extends ThisKeyword11{
    SuperKeyword11(){
        this("Xyz");


        System.out.println("School");

  }
    SuperKeyword11(String div){
        this(1);
        System.out.println("Address"+div);
    }
    SuperKeyword11(int a){
        System.out.println("Standard"+a);
    }
}
public class SuperAndThisKeyword extends SuperKeyword11{
    public SuperAndThisKeyword(){
        super();
    }

    public static void main(String[] args) {
        SuperAndThisKeyword obj = new SuperAndThisKeyword();
    }
}
