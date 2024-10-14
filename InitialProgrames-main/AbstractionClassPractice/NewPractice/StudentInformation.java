package AbstractionClassPractice.NewPractice;

abstract class School
{
    abstract void getinfo();
}
abstract class Student extends School
{
    abstract void display();
}
class Department extends Student
{
    @Override
    void display()
    {
        System.out.println("Student ");
    }
    @Override
    void getinfo()
    {
        System.out.println("Civil");
    }
}
class Division extends Student
{
    @Override
    void display()
    {
        System.out.println("Division");
    }
    @Override
    void getinfo()
    {
        System.out.println("A");
    }
}
public class StudentInformation {
    public static void main(String[] args)
    {
       Department obj = new Department();
       obj.getinfo();
       obj.display();

       Division abc = new Division();
       abc.getinfo();
       abc.display();
    }
}
