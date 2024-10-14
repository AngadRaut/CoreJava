package AbstractionClassPractice.InterfacePractice;

import com.sun.tools.attach.AgentInitializationException;

interface Employee
{
    void name();
}
interface Age extends Employee,Salary
{
    void age();
}
interface Salary
{
    void salary();
}
public class CorporateEmployee implements Employee,Age,Salary
{
    @Override
    public void name()
    {
        String name = "XYZ";
        System.out.println(name);
    }

    @Override
    public void age()
    {
        int age = 28;
        System.out.println("Age="+age);

    }

    @Override
    public void salary()
    {
        float salary=25000.00f;
        System.out.println("Salary="+salary);

    }

    public static void main(String[] args)
    {
        CorporateEmployee objjj = new CorporateEmployee();
        objjj.name();
        objjj.age();
        objjj.salary();
    }
}
