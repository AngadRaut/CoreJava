package May5_2024.Practice;

public class Month {
    public static void main(String[] args){
        double emergencyfund=1000000;
        double interestrate=0.12;
        double initialinstalment=10000;
        int month=0;
        double monthlyinterest=0;
        while(initialinstalment<emergencyfund){
            monthlyinterest=initialinstalment*(interestrate/12);
            monthlyinterest+=monthlyinterest;
            month++;
        }
        System.out.println(month);
    }
}
