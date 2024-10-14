package WhileLoop;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter the limit");
        int j=n.nextInt();
        for(int i=0;i <=j ;i++){
            if(i%5==0){
                System.out.println(i);
            }
        }
        }
    }
