package May5_2024.String;

public class NewEmerFund {
    public static void main(String[] args){
        double emergencyfund = 1000000;
        double initialinstalment=10000;
        float interestrate=0.12f;
        int count=0;
        double interest;
        double totalinterest=0;
        double amount=0;
        while(emergencyfund>0){
            //calculate interest for the month
            interest=initialinstalment*interestrate;
            totalinterest=interest+initialinstalment;


            emergencyfund=emergencyfund-totalinterest;
           // initialinstalment=initialinstalment+interest;
            count++;
            System.out.println("month ="+count+" interest="+interest+" total amount ="+totalinterest+
                    "required amount to pay ="+emergencyfund);
        }
    }
}
