/**
 * Program to divide two integers.
 *
 * @author Christinaa Danks
 * @version 11/16/2020
 */

public class Division   {

   /**
    * Method to perform integer division.
    * @param numerator for the numerator.
    * @param denominator for the denominator.
    * @return integer result of division.
    */
   public static int intDivide(int numerator, int denominator)   {
      
      try   {
         int result = numerator / denominator;
         return result;
      }
      
      catch (ArithmeticException e)  {
         return 0;
      }
   }
   
   /**
    * Method to perform floating point division.
    * @param numerator for the numerator.
    * @param denominator for the denominator.
    * @return floating point result of division.
    * @throws IllegalArgumentException if denominator is zero.
    */
   public static double decimalDivide(int numerator, int denominator)  {
      

      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      
      double result = (double) numerator / denominator;
      return result;
   }

}