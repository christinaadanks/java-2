/**
 * Program that adds and prints out items from the inventory.
 *
 * @author Christinaa Danks
 * @version 11/9/2020
 */


public class InventoryListApp {


   /**
    * Prints out items from the inventory.
    *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
   
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems.toString());
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
      
      
      
   
   }

}