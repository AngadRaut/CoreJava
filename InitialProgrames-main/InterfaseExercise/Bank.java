package InterfaseExercise;
interface BankAccount{
    public void deposit(float deposit);
    public void withdraw(float withdraw);
    public void interest();
    public int viewBalance();
}
class SavingAccount implements BankAccount{
    float deposit,withdraw;
    @Override
    public void deposit(float deposit){
        this.deposit=deposit;
        System.out.println(deposit);
    }
    @Override
    public void withdraw(float withdraw){
        this.withdraw=withdraw;
        System.out.println(withdraw);

    }
    @Override
    public void interest(){

    }

        @Override
    public int viewBalance(){
        float balance=deposit-withdraw;
            System.out.println(balance);
        return 0;
    }
}
class CurrentAccount implements BankAccount{
    @Override
    public void deposit(float deposit){

    }
    @Override
    public void withdraw(float withdraw){

    }
    @Override
    public void interest(){

    }
    @Override
    public int viewBalance(){
        return 0;
    }
}
public class Bank {
    public static void main(String[] args) {
        SavingAccount obj = new SavingAccount();
        obj.deposit(100);
        obj.withdraw(58);
        obj.viewBalance();

    }
}
