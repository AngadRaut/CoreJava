package AbstractionClassPractice.InterfacePractice;
interface FinalVarriable
{
    final int a=300;     //variable in interface must be Public,Static,Final
    double show();
}
interface SameMethods
{
    double show();
}
public class InterfaceMultipleInheritance implements FinalVarriable,SameMethods
{

    @Override
    public double show()
    {
        System.out.println("while implementing two methods (same methods name) one implementation is needed ");
        System.out.println("final in value not changes and that is ="+a);
        return 0;
    }

    public static void main(String[] args) {
        InterfaceMultipleInheritance objjj = new InterfaceMultipleInheritance();
        objjj.show();
    }
}
