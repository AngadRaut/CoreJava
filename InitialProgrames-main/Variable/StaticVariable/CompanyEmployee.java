package Variable.StaticVariable;
class Company{
    String name;
    int id;
    static String companyName="BMW";

    Company(String a,int b){
        name=a;
         id=b;
    }
    void display(){
        System.out.println("\n Name = "+name+"\n ID = "+id+"\n Company name = "+companyName);
    }
}
public class CompanyEmployee {
    public static void main(String[] args) {
        Company obj = new Company("Anand",101);
        obj.display();

        Company obj2 = new Company("Krishna",102);
        obj.display();


    }
}
