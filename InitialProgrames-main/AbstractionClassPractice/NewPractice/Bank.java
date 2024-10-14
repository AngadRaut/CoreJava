package AbstractionClassPractice.NewPractice;

abstract class BankAccount
{
    abstract void deposit();

}
abstract class Account extends BankAccount {
    abstract void withdraw();
}
class SavingAccount extends Account
{
    @Override
    void deposit()
    {
        System.out.println("Slip for cash deposit for Saving Account");
    }

    @Override
    void  withdraw()
    {
        System.out.println("Slip for cash withdraw for Saving Account ");
    }
}
class CurrentAccount extends Account{
    @Override
    void deposit()
    {
        System.out.println("Slip for cash deposit for Current Account");
    }
    @Override
    void withdraw()
    {
        System.out.println("Slip for cash deposit for Current Account");
    }
}
public class Bank
{
    public static void main(String[] args)
    {
        SavingAccount obj = new SavingAccount();
        obj.deposit();
        obj.withdraw();

        CurrentAccount rj = new CurrentAccount();
        rj.deposit();
        rj.withdraw();

    }
}
