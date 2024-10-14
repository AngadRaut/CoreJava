package Variable;
public class ClassPractice {
    int age =20;
    static int no=100;

    public static void main(String[] args) {

        int age=40;
        System.out.println(age);
        ClassPractice c = new ClassPractice();
        System.out.println(c.age);
        System.out.println(no);

        c.no=200;
        System.out.println(c.no);

        no=no+3;
        System.out.println(no);

        c.age =c.age+1;
        System.out.println(c.age);


    }
}
