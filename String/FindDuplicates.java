package string;

public class FindDuplicates {
    public static void main(String[] args) {
        String s = "java Programming";
        for(int i = 0 ; i<s.length()-1 ; i++ ){
            for(int j = i+1 ;j<s.length() ; j++){
                if(s.charAt(i) == s.charAt(j)){
                    System.out.print(s.charAt(i)+",");
                    break;
                }

            }
        }
    }
}
