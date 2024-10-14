package Encapsulation;
class Dog {
    private String name;
    private String color;

    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setColor(String c){
        this.color=c;
    }
    public String getColor(){
        return color;
    }
    public Dog(String n,String c){
        this.name=n;
        this.color=c;
    }
    public Dog(){

    }
}
public class DogInfo extends Dog {
    private String breed;
    private int age;
    public void setBreed(String b){
        this.breed=b;
    }
    public String getBreed(){
        return breed;
    }
    public void setAge(int a){
        this.age=a;
    }
    public int getAge(){
        return age;
    }
    public DogInfo(String b,int a){
        super("Rony","White");
        this.breed=b;
        this.age=a;
    }
    public DogInfo(){

    }
    public static void main(String[] args){
        /** By using Public get and set method*/
        DogInfo obj = new DogInfo();
        obj.setName("Moti");
        obj.setColor("Black");
        obj.setBreed("Gavran");
        obj.setAge(2);
        System.out.println("\nName = "+obj.getName()+"\ncolor = "+obj.getColor()+"\nBreed = "+obj.getBreed()+
                "\nAge  = "+obj.getAge());

        /** by using Parameterized constructor*/
        DogInfo obj2=new DogInfo("Haski",3);
        System.out.println("\nName = "+obj2.getName()+"\ncolor = "+obj2.getColor()+"\nBreed = "+obj2.getBreed()+
                "\nAge  = "+obj2.getAge());


    }
}