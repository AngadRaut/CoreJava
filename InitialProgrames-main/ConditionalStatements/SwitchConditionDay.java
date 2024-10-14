package ConditionalStatements;

import java.util.Scanner;

public class SwitchConditionDay {
    public static void main(String[] args){
        int day;
        System.out.println("Enter the Day number");
        Scanner D = new Scanner(System.in);
        day = D.nextInt();

        switch (day){
            case 1:
                System.out.println("Day is Monday");
            break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Say is Saturday");
            default:
                System.out.println("Enter day number in between 1 to 7");
        }
    }
}
