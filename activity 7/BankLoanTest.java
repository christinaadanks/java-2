import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * BankLoan jUnit test.
 * @author Christinaa Danks
 * @version 10/13/2020
 */

public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests chargeInterest method.
    */
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals("", 1100, loan1.getBalance(), .000001);
   }
   
   
   /**
    * Tests isInDebt method.
    */
   @Test public void isInDebtTest() {
      BankLoan chris = new BankLoan("Chris", .08);
      Assert.assertEquals(false, BankLoan.isInDebt(chris));
      chris.borrowFromBank(100);
      Assert.assertEquals(true, BankLoan.isInDebt(chris));
   }
   
   /**
    * Tests setInterestRate method.
    */
   @Test public void setInterestRateTest() {
      BankLoan chris = new BankLoan("Chris", .08);
      Assert.assertEquals(true, chris.setInterestRate(.02));
      Assert.assertEquals(false, chris.setInterestRate(2.0));
   }
   
   /**
    * Tests borrowFromBank method.
    */
   @Test public void borrowFromBankTest() {
      BankLoan chris = new BankLoan("Chris", .08);
      Assert.assertEquals(true, chris.borrowFromBank(1000.00));
      Assert.assertEquals(false, chris.borrowFromBank(200000.00));
      chris.borrowFromBank(1000.00);
      Assert.assertEquals(2000, chris.getBalance(), .000001);
      chris.borrowFromBank(200000.00);
      Assert.assertEquals(2000, chris.getBalance(), .000001);
   }
   
   /**
    * Tests payBank method.
    */
   @Test public void payBankTest()  {
      BankLoan rick = new BankLoan("Rick", .15);
      rick.borrowFromBank(1000.00);
      Assert.assertEquals(500, rick.payBank(1500.00), .000001);
   }
   
  
   /**
    * Tests isAmountValid method.
    */
   @Test public void isAmountValidTest()  {
      BankLoan morty = new BankLoan("Morty", .30);
      Assert.assertEquals(true, BankLoan.isAmountValid(200));
      Assert.assertEquals(false, BankLoan.isAmountValid(-10));
   }
   
   /**
    * Tests getLoansCreated method.
    */
   @Test public void getLoansCreatedTest() {
      Assert.assertEquals("", 3, BankLoan.getLoansCreated());
   }    
   
   /**
    * Tests resetLoansCreated method.
    */
   @Test public void resetLoansCreatedTest() {
      BankLoan.resetLoansCreated();
      Assert.assertEquals("", 0, BankLoan.getLoansCreated());
   }   
   
   /**
    * Tests toString method.
    */
   @Test public void toStringTest() {
      BankLoan morty = new BankLoan("Morty", .30);
      morty.borrowFromBank(3000.00);
      String expected = "Name: " + "Morty" + "\r\n" 
         + "Interest rate: " + morty.getInterestRate() + "%\r\n" 
         + "Balance: $" + morty.getBalance() + "\r\n";
      Assert.assertEquals("", expected, morty.toString());

   }


   
}
