package May5_2024;

public class EmergencyFund {
    public static void main(String[] args){
        double emergencyFund=1000000;
        double interestRate=0.12;
        double initialInstalment=10000;
        double totalInterest=0;
        double emiCount=0;
        while(emergencyFund>0){
            double interest=initialInstalment*interestRate;
             totalInterest +=interest;

             emergencyFund -=(initialInstalment-interest);
             emiCount++;
            System.out.println("emiCount="+emiCount+" total="+initialInstalment+" interest"+interest+" remaining value="+emergencyFund);
            initialInstalment=initialInstalment+interest;
        }
        System.out.println("\ntotal emi ="+emiCount);
        System.out.println("\ntotal interest paid="+totalInterest);



//    for (initialInstalment=10000,emergencyFund<=1000000,emergencyFund++) {
//
//    }

 }
}