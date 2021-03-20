/**
 * Program that represents an inventory item in a store.
 *
 * @author Christinaa Danks
 * @version 11/2/2020
 */

public class InventoryItem {

   // instance variables
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
    * Constructor for InventoryItem.
    * @param nameIn for item name.
    * @param priceIn for item price.
    */
   public InventoryItem(String nameIn, double priceIn)   {
      name = nameIn;
      price = priceIn;
   }
   
   // methods
   
   /**
    * Method to get item name.
    * @return item name
    */
   public String getName() {
      return name;
   }
   
   /**
    * Method to calculate cost of item.
    * @return price with tax.
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
    * Method to set the tax rate.
    * @param taxRateIn for new tax rate.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
    * Method to return String representation of InventoryItem.
    * @return String representing inventory item.
    */
   public String toString()   {
      return name + ": $" + calculateCost();
   }

}