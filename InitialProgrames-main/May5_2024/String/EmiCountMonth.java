package May5_2024.String;

public class EmiCountMonth {
    public static void main(String[] args){
        double emergencyfund=1000000;
        double firstinstalment=10000;
        float interestrate=0.12f;
        double totalinterest=0;
        int count=0;

        while(emergencyfund>0){
            totalinterest=firstinstalment*interestrate;
            firstinstalment=totalinterest+10000;
            System.out.println(firstinstalment);
            count++;
        }
        System.out.println(" months required"+count);
    }
}
