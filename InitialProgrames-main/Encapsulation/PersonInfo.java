package Encapsulation;
class Person{
    String name,address;
    long adharNo,mobNo;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
    public void setAdharNo(long adharNo){
        this.adharNo=adharNo;
    }
    public long getAdharNo(){
        return adharNo;
    }
    public void setMobNo(long mobNo){
        this.mobNo=mobNo;
    }
    public long getMobNo(){
        return mobNo;
    }
    public Person(String name,String address,long adharNo,long mobNo){
        this.name=name;
        this.address=address;
        this.adharNo=adharNo;
        this.mobNo=mobNo;
    }
    Person(){

    }

}
public class PersonInfo  {
    public static void main(String[] args) {
        /**  Using Public Setter and Getter methods*/
        Person obj = new Person();
        obj.setName("XYZ");
        obj.setAddress("Mah.");
        obj.setAdharNo(6342643278793821263L);
        obj.setMobNo(68342656326943132L);

        System.out.println("Using Public setter and getter method\nName = "+obj.getName()+"\nAddress = "+obj.getAddress()+"\nAdhar No = "+obj.getAdharNo()+"" +
                "\nMobile No = "+obj.getAdharNo()+"\n");

        /**  Use Parameterized constructor*/
        Person obj2 = new Person("XYZ 2","Mah2",6324563638678364L,682463248634267L);
        System.out.println("Use Parameterized constructor and setter method\nName = "+obj2.getName()+"\nAddress = "+obj2.getAddress()+"\nAdhar No = "+obj2.getAdharNo()+"" +
                "\nMobile No = "+obj2.getAdharNo());

    }
}
