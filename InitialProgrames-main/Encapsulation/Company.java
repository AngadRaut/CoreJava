package Encapsulation;
class CompanyEmployee{
    String companyName;
    private String name,position,workingOn;
    private int id;
    private float sallery,pf;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
       return id;
   }

    public void setId(int id) {
        this.id = id;
    }
    public void setPosition(String position){
        this.position =position;
    }
    public String getPosition(){
        return position;
    }
    public void setWorkingOn(String workingOn){
        this.workingOn=workingOn;
    }
    public String getWorkingOn(){
        return workingOn;
    }
    public void setSallery(float sallery){
        this.sallery=sallery;
    }
    public float getSallery(){
        return sallery;
    }
    public void setPf(float pf){
        this.pf = pf;
    }
    public float getPf(){
        return pf;
    }
}
public class Company {
    public static void main(String args[]){
        /**  Using getter and setter methods*/
        CompanyEmployee obj = new CompanyEmployee();
        obj.setName("Mohan");
       obj.setId(22);
        obj.setPosition("Fresher Developer");
        obj.setWorkingOn("Desk");
        obj.setSallery(200000);
        obj.setPf(12000);
        System.out.println("Name = "+obj.getName()+"\nId = "+obj.getId()+"\nPosition as "+obj.getPosition()+"\nWorking on" +
                " "+obj.getWorkingOn()+"\nSallery = "+obj.getSallery()+"\nPf amount = "+obj.getPf());

    }
}
