package Variable;
class Dummy{
    static void dummy(){
        System.out.println("Static method dummy");
    }
}
class Child extends Dummy{
    public static void dummy(){
        System.out.println("child method");
    }


}
public class OverrideStaticMethod {
    public static void main(String[] args) {
        Child test = new Child();
        test.dummy();

        Dummy.dummy();
    }

}
