package ConditionalStatements;

import java.util.Scanner;

public class IfExample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if (button==1){
            System.out.println("Namaste");
        } else if (button==2) {
            System.out.println("Hellow");
        }else if (button==3){
            System.out.println("Welcome");
        } else {
            System.out.println("Invalid Button");
        }
    }
}
