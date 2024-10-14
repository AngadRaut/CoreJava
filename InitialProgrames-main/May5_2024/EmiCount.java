package May5_2024;

public class EmiCount {
    public static void main(String[] args){
        float emergencyFund=1000000;
        int interestRate = 12;
        float monthlysip=10000;
        int emiCount=0;
        float totalinterest=0;
        float amount=0;

      //  emergencyFund=monthlysip((1+Math.pow(interestRate/12)))
        for(float i=monthlysip;i<=emergencyFund;i++){
            totalinterest = monthlysip*interestRate;
            amount=monthlysip+totalinterest;
             emergencyFund-=(emergencyFund-amount);
            monthlysip=monthlysip+amount;
             emiCount++;
            System.out.println(" instalment = "+monthlysip+"  amount = "+amount+"  total interest="+amount+"" +
                    "  amount remaining="+amount);

        }
        System.out.println("emi count="+emiCount);
    }
}
