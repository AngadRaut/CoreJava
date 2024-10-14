package ForLoop;

import java.util.Scanner;

public class TableOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no you want to print table");
        int no=sc.nextInt();
        for(int i=1;i<=10;i++){
            int result =no*i;
            System.out.println(no+"*"+i+"="+result);
        }
    }
}
