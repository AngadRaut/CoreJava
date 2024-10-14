package May5_2024.String;

public class StringClass {
    void string(){
        String abc="Java";
        String xtz = new String("Test");
        String obj=new String("Java");
        System.out.println(abc.hashCode());
        System.out.println(obj.hashCode());
        // finding length of thease strings using length()
        System.out.println("length of original abc(tdit) string is = "+abc.length());
        System.out.println("length of original obj(java) string is = "+obj.length());

        //chainging(adding another) these strings using concat()
        abc=abc.concat(" solutions");
        obj=obj.concat(" Programming");
        System.out.println("after using concat() value of abc is = "+abc+"\nand value of obj is= "+obj);

        // comparing two string objects using equals()=> compare string object
        boolean t1= abc.equals(obj);
        System.out.println("objects are equal "+t1);

        // using == operator => compare string address i.e memory address
        boolean t2=(abc == obj);
        System.out.println("memory address are equal "+t2);

        // hash code of abc
        System.out.println("abc hash code = "+abc.hashCode());
        // hash code of obj
        System.out.println("obj hash code = "+obj.hashCode());
    }
    public static void main(String[] args){
        StringClass obj = new StringClass();
        obj.string();
    }
}
