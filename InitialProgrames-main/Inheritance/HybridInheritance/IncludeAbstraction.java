package Inheritance.HybridInheritance;
interface PythanDeveloper
{
    float pythanDeveloper();
}
interface JavaDeveloper   {
    double javaDeveloper();
}
class Employee implements PythanDeveloper,JavaDeveloper{
    void employee()
    {
        System.out.println("a");
    }

    @Override
    public float pythanDeveloper() {
        System.out.println("Ajit ia Pythan Developer");
        return 0;
    }

    @Override
    public double javaDeveloper() {
        System.out.println("Smita is Java Developer");

        return 0;
    }
}
class BackendDeveloper extends Employee {
    int Sallery(){
        int s = 35000;
        System.out.println("Backend developer sallery = "+s);
            return s;

    }
}
public class IncludeAbstraction extends BackendDeveloper {
    public static void main(String[] args) {
        IncludeAbstraction o = new IncludeAbstraction();
        o.Sallery();
        o.pythanDeveloper();
        o.javaDeveloper();
        o.employee();
    }
}

