/**
 * Program that holds an array of numerical values.
 * 
 * @author Christina L
 * @version 10/27/2020
 */
public class Scores  {
   
   // instance variable
   private int[] numbers;
   
   /**
    * constructor for the Scores class.
    * @param numbersIn for the array of int values (scores).
    */
   public Scores(int[] numbersIn)   {
      numbers = numbersIn;
   
   }
   
   // methods
   /**
    * find even numbers in the array.
    * @return even numbers in array.
    */
   public int[] findEvens()   {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++)  {
         if (numbers[i] % 2 == 0)   {
            numberEvens++;
         }
      }
      
      // create an array to store the number of even numbers.
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++)  {
         if (numbers[i] % 2 == 0)   {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
   /**
    * find odd numbers in the array.
    * @return odd numbers in array.
    */
   public int[] findOdds() {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++)  {
         if (numbers[i] % 2 == 1)   {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++)  {
         if (numbers[i] % 2 == 1)   {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
      
      
   }
   
   /**
    * calculate average of all scores in array.
    * @return average of all scores in array.
    */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++)  {
         sum += numbers[i];
      }
      return (double) sum / numbers.length;
   }
   
   /**
    * Print out String containing all scores in array.
    * @return String containing all scores.
    */
   public String toString()   {
      String result = "";
      for (int i = 0; i < numbers.length; i++)  {
         result += numbers[i] + "\t";
      }
      return result;
   }
   
   /**
    * Print out String in reverse order.
    * @return String containing all scores in reverse order.
    */
   public String toStringInReverse()   {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--)   {
         result += numbers[i] + "\t";
      }
      return result;
   }

}
