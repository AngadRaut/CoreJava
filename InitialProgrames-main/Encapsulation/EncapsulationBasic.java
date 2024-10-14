package Encapsulation;
class Encapsulation {
    private int a,age;
    private String name="Java",lastName;
    private long mobileNo;
    private float balance, sallery;
    private boolean truth,isTruth;

    public void setAge(int age){
       this.age=age;
    }
    public int getAge(){
        return age;
    }
   public int getA(){
        return a;
   }
    public void setA(int a){
        this.a=a;
    }
    public void setName(String name ){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void  setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setMobileNo(long mobileNo){
        this.mobileNo=mobileNo;
    }
    public long getMobileNo(){
        return mobileNo;
    }
    public void setBalance(float balance){
        this.balance=balance;
    }
   public float getBalance(){
        return balance;
   }
   public void setSallery(float sallery){
        this.sallery = sallery;
   }
   public float getSallery(){
        return sallery;
   }
   public void setTruth(boolean truth){
        this.truth=truth;
   }
   public boolean getTruth(){
        return truth;
   }
   public void setIsTruth(boolean isTruth){
        this.isTruth=isTruth;
   }
   public boolean getIsTruth(){
        return isTruth;
   }
   Encapsulation(){

   }
   public Encapsulation(int a,int age){
        this.a=a;
        this.age=age;
   }
   public Encapsulation(String name,String lastName,float balance,float sallery){
        this.name=name;
        this.lastName=lastName;
        this.balance=balance;
        this.sallery=sallery;
   }


}
public class EncapsulationBasic {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setAge(20);
        obj.setLastName("Ravan");
        obj.setMobileNo(123456789012L);
        obj.setBalance(1234567F);
        obj.setSallery(10000000f);
        obj.setTruth(false);
        obj.setIsTruth(true);
        System.out.println("Use Public setter and getter method" +
                "\nName = "+obj.getName()+"\nAge = "+obj.getAge()+"\nLast Name = "+obj.getLastName()
        +"\nMobile no = "+obj.getMobileNo()+"\nBalance = "+obj.getBalance()+"\nSallery = "+obj.getSallery()
        +"\ntruth="+obj.getTruth()+"\nIs Truth = "+obj.getIsTruth());

        Encapsulation obj2 = new Encapsulation(1,2);
        System.out.println("\nParameterized constructor providing two parameters obj 2\n" +
                        ""+obj2.getA());
        System.out.println(obj2.getAge());

        Encapsulation obj3=new Encapsulation("java","Programming",1234567890F,10000000000F);
        System.out.println("\nParameterized constructor and getter methods obj 3\nName = "+obj3.getName()+"\nLast Name = "+obj3.getLastName()
        +"\nMobile no = "+obj3.getMobileNo()+"\nBalance = "+obj3.getBalance()+"\nSallery = "+obj3.getSallery()
                +"\ntruth="+obj.getTruth()+"\nIs Truth = "+obj.getIsTruth());
    }
}
