package Encapsulation;
class Account{
    private long accountNo;
    private String customerName,address,email,dob;
    private float amount;

    public void setAccountNo(long accountNo){
        this.accountNo=accountNo;
    }
    public long getAccountNo(){
        return accountNo;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setAddress(String address){
        this.address =address;
    }
    public String getAddress(){
        return address;
    }
    public void setEmail(String email){
        this.email=email;
    }
public String getEmail(){
        return email;
    }
    public void setDob(String dob){
        this.dob=dob;
    }
    public String getDob(){
        return dob;
    }
    public void setAmmount(float amount){
        this.amount=amount;
    }
    public float getAmount(){
        return amount;
    }
    Account(){

    }
     Account(long accountNo,String customerName,String address,String email,String dob,float amount){
        this.accountNo=accountNo;
        this.customerName=customerName;
        this.address =address;
        this.email = email;
        this.dob=dob;
        this.amount=amount;
    }
}
public class EncapsulationBank {
    public static void main(String[] args){

        /**  object 1 */
        Account obj = new Account();
        obj.setAccountNo(123456789012345L);
        obj.setCustomerName("XYZ");
        obj.setAddress("At post tq. dist.Maharashtra");
        obj.setEmail("xyz2024@gmail.com");
        obj.setDob("12/12/1999");
        obj.setAmmount(500000000);
        System.out.println("Using Public setter and getter methods for" +
                " obj1\nAccount No = "+obj.getAccountNo()+"\nCustomer Name = "+obj.getCustomerName()+"\nAddress = "
        +obj.getAddress()+"\nEmail Id = "+obj.getEmail()+"\nDate of Birth = "+obj.getDob()+
                "\nAmount = "+obj.getAmount());

        /** object 2*/

        Account obj2 = new Account();
        obj2.setAccountNo(16353663875687138L);
        obj2.setCustomerName("XYZ 2 ");
        obj2.setAddress("At post tq Dist Mah");
        obj2.setEmail("xyz2@gmail.com");
        obj2.setDob("12/12/2012");
        obj2.setAmmount(326653658981273f);
        System.out.println("\nUsing public setter and getter method obj2\nAccount No = "+obj2.getAccountNo()+"\nCustomer Name = "+obj2.getCustomerName()+"\nAddress = "
                +obj2.getAddress()+"\nEmail Id = "+obj2.getEmail()+"\nDate of Birth = "+obj2.getDob()+
                "\nAmount = "+obj2.getAmount());

        /** 2) using constructor assign values  */

        Account obj3=new Account(1380984032840L,"XYZ 3","post maharashtra","xyz3@gmail.com","12/23/5587",4554434354f);
        System.out.println("\nUsing Parameterized constructor\nAccount No = "+obj3.getAccountNo()+"\nCustomer Name = "+obj3.getCustomerName()+"\nAddress = "
                +obj3.getAddress()+"\nEmail Id = "+obj3.getEmail()+"\nDate of Birth = "+obj3.getDob()+
                "\nAmount = "+obj3.getAmount());





    }
}
