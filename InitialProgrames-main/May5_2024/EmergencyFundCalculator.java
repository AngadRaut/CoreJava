package May5_2024;






        public class EmergencyFundCalculator {
            public static void main(String[] args) {
                double emergencyFund = 1000000; // Target emergency fund amount
                double monthlyEMI = 10000; // Monthly installment amount
                double annualInterestRate = 0.12; // Annual interest rate as a decimal

                // Convert annual interest rate to monthly interest rate
                double monthlyInterestRate = annualInterestRate / 12;

                // Calculate the number of months required to pay off the emergency fund
                int months = calculateMonths(emergencyFund, monthlyEMI, monthlyInterestRate);

                System.out.println("Number of months required to reach the target emergency fund amount: " + months);
            }

            public static int calculateMonths(double targetAmount, double monthlyEMI, double monthlyInterestRate) {
                int months = 0;
                double currentAmount = targetAmount;

                while (currentAmount > 0) {
                    // Calculate the interest for the current month
                    double interest = currentAmount * monthlyInterestRate;
                    // Calculate the principal paid this month
                    double principal = monthlyEMI - interest;
                    // Reduce the current amount by the principal paid
                    currentAmount -= principal;
                    // Increment the month counter
                    months++;
                    // Print the details for the current month
                    System.out.printf("Month %d: EMI = %.2f, Interest = %.2f, Principal = %.2f, Remaining Amount = %.2f%n",
                            months, monthlyEMI, interest, principal, currentAmount);
                }

                return months;
            }
        }



