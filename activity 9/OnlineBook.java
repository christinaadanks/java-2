/**
 * Program for online book inventory.
 *
 * @author Christinaa Danks
 * @version 11/2/2020
 */

public class OnlineBook extends OnlineTextItem  {

   protected String author;
   
   /**
    * Constructor for OnlineBook.
    * @param nameIn for book name.
    * @param priceIn for book price.
    */
   public OnlineBook(String nameIn, double priceIn)   {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
    * Method to return String representation of OnlineBook.
    * @return String representing book inventory.
    */ 
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
   
   /**
    * Method to set author name.
    * @param authorIn for author name.
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}