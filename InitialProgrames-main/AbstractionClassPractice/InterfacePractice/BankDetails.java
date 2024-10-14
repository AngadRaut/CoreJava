package AbstractionClassPractice.InterfacePractice;
interface Bank
{
    void deposit();
    void withdraw();
}
interface Bank11
{
    void loan();
    void account();
}
abstract class Bank22 implements Bank,Bank11
{
}
class Bank33 extends Bank22 {
    @Override
    public void deposit() {
        System.out.println("Your current deposit is "+100);
    }

    @Override
    public void withdraw() {
        System.out.println("Your withdrawn cash is  "+50);
    }

    @Override
    public void loan() {
        System.out.println("Loan on yor acc. is "+35);
    }

    @Override
    public void account() {
        System.out.println("Your current balance is  "+50);
    }
}
public class BankDetails extends Bank33{
    public static void main(String[] args) {
        BankDetails b = new BankDetails();
        b.deposit();
        b.withdraw();
        b.loan();
        b.account();
    }

}
