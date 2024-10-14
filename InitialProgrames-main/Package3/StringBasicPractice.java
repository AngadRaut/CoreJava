package Package3;

public class StringBasicPractice {
    public static void main(String[] args) {
        String name="Aman";
        String name2="Khanna";
        String name3=name +" "+ name2;
        System.out.println(name3);
        System.out.println(name3.length());
        System.out.println(name3.charAt(0));
        System.out.println(name3.charAt(1));
        System.out.println(name3.charAt(2));
        System.out.println(name3.charAt(10));

        String name4=name.replace('a','b');
        String name5=name2.replace('n','d');

        System.out.println(name4);
        System.out.println(name5);

        String newnName = "Aman and akku";
        System.out.println(newnName.length());
        String earn = newnName.replace('a','b');
        System.out.println(earn);

    }
}
