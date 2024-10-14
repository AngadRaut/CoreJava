package May5_2024.String.StringMethods;

public class HashCode {
    public static void main(String[] args){
        String q="1234567890";
        String r="1234567890";
        String t=new String("77846467fufsdhd783");
        String s=new String("78sdhj874hjfd87484678hfj");

        // using hashCode() method
        System.out.println("hash codes of strings \nq = "+q.hashCode()+"\nr = "+r.hashCode() +
                "\nt = "+t.hashCode()+"\ns = "+s.hashCode());
    }
}
