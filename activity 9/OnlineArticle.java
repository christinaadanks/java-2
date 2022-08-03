/**
 * Program to keep track of word count and more.
 *
 * @author Christina L
 * @version 11/2/2020
 */

public class OnlineArticle extends OnlineTextItem  {
   
   private int wordCount;
   
   /**
    * Constructor for OnlineArticle.
    * @param nameIn for item name.
    * @param priceIn for item price.
    */
   public OnlineArticle(String nameIn, double priceIn)   {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**
    * Method to set the word count.
    * @param wordCountIn for the new word count.
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}
