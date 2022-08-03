/**
 * Program that inherits from InventoryItem for electronics items.
 *
 * @author Christina L
 * @version 11/2/2020
 */

public class ElectronicsItem extends InventoryItem  {
   
   // instance variables
   protected double weight;
   
   /**
    * The value of SHIPPING_COST is {@value}.
    */
   public static final double SHIPPING_COST = 1.5;
   
   /**
    * Constructor for ElectronicsItem.
    * @param nameIn for item name.
    * @param priceIn for item price.
    * @param weightIn for item weight.
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn)  {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
    * Method to calculate cost with shipping based on weight.
    * @return total price.
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}
