/**
 * Program that holds an array of InventoryItems objects.
 *
 * @author Christina L
 * @version 11/9/2020
 */

public class ItemsList  {

   // instance variables
   private InventoryItem[] inventory;
   private int count;
   
   /**
    * Constructor for ItemsList.
    */
   public ItemsList()   {
      
      inventory = new InventoryItem[30];
      count = 0;   
   }
   
   /**
    * Method to add items to the array.
    * @param itemIn for item to add to array.
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
    * Method to calculate the total cost.
    * @param electronicsSurcharge for surcharge amount.
    * @return total cost.
    */
   public double calculateTotal(double electronicsSurcharge)   {
   
      double total = 0;
      for (int i = 0; i < count; i++)  {
      
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else  {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
    * Method to return String representation of ItemsList.
    * @return String representing all inventory items from array.
    */
   public String toString()   {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++)  {
         output += inventory[i] + "\n";
      }
      
      return output;
   
   }

}
