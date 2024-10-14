package May5_2024.String.StringMethods;

public class CharAt {
    public static void main(String[] args){

        // declaring strings using literals => perm gen=>string constant pool=>
        // SCP => first check that object is already created or not if created use it else create new object
        String a="Java Programming";
        // creating string object using new kryword => heap memory=>always create new object
        String aa=new String("Hellow World");
        String B=new String("1234567890");

        // find 1st character in above strings
        System.out.println("a string 1st cha.= "+a.charAt(0));
        System.out.println("aa string 1st cha.="+aa.charAt(0));
        System.out.println("B string 1st cha.="+B.charAt(0));

        // find 5th character on above string
        System.out.println("\n5th char of a string is ="+a.charAt(5));
        System.out.println("5th char of string aa is ="+aa.charAt(6));
        System.out.println("5th char of string B is = "+B.charAt(5));

        // If index passed to charAt() is -ve or out of bond then it throws an exception
        // StringIndexOutOfBoundsException
        System.out.println("\nchar which is out of bound "+B.charAt(44));
    }
}
