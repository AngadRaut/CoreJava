package string;

public class IsPalindrome {
    public static void main(String[] args) {
        // check no is palindrome or not
        int no = 151 ;
        int newNo = no;
        int sum = 0;
        while(no>0){
            int rem = no % 10 ;
            sum = sum *10 + rem;
            no = no / 10 ;
        }
        if(sum == newNo){
            System.out.println("palindrome");
        }else System.out.println("not palindrome");


        // check the string is palindrome or not
        String name = "shiwa" ;
        String empty = "";
        for(int i = name.length()-1 ; i >=0 ;i--){
            empty = empty+name.charAt(i);
        }
        if(empty.equals(name)){
            System.out.println("palindrome");
        }
        else System.out.println("not palindrome");




    }
}
