/**
 * Bank Loan class for calculating bank loans.
 *
 * @author Christina L 
 * @version 10/13/2020
 */

public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   
   // static variables
   private static int loansCreated = 0;

   // constructors
   /**
    * @param customerNameIn to determine customer name.
    * @param interestRateIn to determine interest rate.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   
   /**
    * boolean value for if loan was made.
    * @return if loan was made.
    * @param amount is the amount to borrow from bank.
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

   /**
    * @param amountPaid is the amount paid to bank.
    * @return new balance.
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
    * @return balance.
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * set the interest rate.
    * @return true if interest rate is greater than or equal to 0 and
    * less than or equal to 1, and false otherwise.
    * @param interestRateIn is the inputted interest rate.
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * @return interest rate.
    */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
    * @return amount of loans created.
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
    * reset the amount of loans created to 0.
    */
   public static void resetLoansCreated()  {
      loansCreated = 0;
   }
   
   /**
    * charge interest.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
    * @return true if loan amount is greater than or equal to 0.
    * @param amount is the loan amount.
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
   /**
    * @return true if loan balance is greater than 0, and false otherwise.
    * @param loan for bank loan amount.
    */
   public static boolean isInDebt(BankLoan loan)   {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
    * @return name, interest rate, and balance.
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
