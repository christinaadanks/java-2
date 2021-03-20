/**
 * InvalidCategoryException for CloudStorageList.
 *
 * @author Christinaa Danks
 * @version 11/17/2020
 */

public class InvalidCategoryException extends Exception  {

   /**
    * Constructor for InvalidCategoryException.
    * @param categoryIn for invalid category.
    */
   public InvalidCategoryException(String categoryIn)   {
      super("For category: " + categoryIn);
   }

}