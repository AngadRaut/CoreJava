package ConstructorsInJAva;
class Name{
    protected Name(){
        System.out.println("Name");
    }
    public Name(int a){
        System.out.println("Name Parameterized");
    }
}
class Class extends Name{
    Class(){
        System.out.println("Class");
    }
    public Class(String a){
        super(2);
        System.out.println("Class Parameterized");
    }
}
class School extends Class{
    School(){
        System.out.println("School");
    }
    public School(double v){
        super("name");
        System.out.println("School parameterized");
    }
}
class Object extends School{
    Object(){
       // super(47766.677846);
    }

}
public class Student extends Object{
    public static void main(String[] args) {
        Student s = new Student();
    }
}
