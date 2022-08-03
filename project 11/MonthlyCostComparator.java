import java.util.Comparator;

/**
 * Program that implements the Comparator interface.
 * I will implement the method compare that defines the ordering
 * from highest to lowest based on cloud storage monthly cost.
 * 
 * @author Christina L
 * @version 11/11/2020
 */
public class MonthlyCostComparator implements Comparator<CloudStorage>  {

   /**
    * Method to compare two objects.
    * @param c1 for item 1.
    * @param c2 for item 2.
    * @return int representing results of comparing the two items.
    * return -1 if cost of item 1 is great than item 2, putting it first.
    * return 1 if cost of item 1 is less than item 2.
    * return 0 if cost is equal.
    */
   public int compare(CloudStorage c1, CloudStorage c2)  {
      if (c1.monthlyCost() > c2.monthlyCost())  {
         return -1;
      }
      else if (c1.monthlyCost() < c2.monthlyCost())   {
         return 1;
      }
      else  {
         return 0;
      }
   }

}
