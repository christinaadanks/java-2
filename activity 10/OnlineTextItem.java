/**
 * Program for online text items that users can buy.
 *
 * @author Christinaa Danks
 * @version 11/2/2020
 */

public abstract class OnlineTextItem extends InventoryItem  {
   
   /**
    * Constructor for OnlineTextItem.
    * @param nameIn for item name.
    * @param priceIn for item price.
    */
   public OnlineTextItem(String nameIn, double priceIn)  {
      super(nameIn, priceIn);
   }
   
   /**
    * Method to calculate cost of item.
    * @return the price of the item.
    */
   public double calculateCost() {
      return price;
   }  
}