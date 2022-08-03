import java.text.DecimalFormat;

/**
 * Abstract class that describes cloud storage data.
 *
 * @author Christina L
 * @version 11/5/2020
 */

public abstract class CloudStorage  {

   // instance variables
   protected String name;
   protected double storageCost;
   
   // class variables
   protected static int count = 0;
   
   /**
    * Constructor for CloudStorage.
    * @param nameIn for cloud name.
    * @param storageCostIn for base storage cost.
    */
   public CloudStorage(String nameIn, double storageCostIn) {
      name = nameIn;
      storageCost = storageCostIn;
      count++;
   }
   
   /**
    * Method to get cloud name.
    * @return cloud name.
    */
   public String getName()  {
      return name;
   }
   
   /**
    * Method to set cloud name.
    * @param nameIn for new cloud name.
    */
   public void setName(String nameIn)  {
      name = nameIn;
   }
   
   /**
    * Method to get base storage cost.
    * @return base storage cost.
    */
   public double getBaseStorageCost()   {
      return storageCost;
   }
   
   /**
    * Method to set storage cost.
    * @param storageCostIn for new storage cost.
    */
   public void setBaseStorageCost(double storageCostIn)  {
      storageCost = storageCostIn;
   }
   
   /**
    * Method to get the number of cloud objects.
    * @return number of cloud objects.
    */
   public static int getCount()   {
      return count;
   }
   
   /**
    * Method to reset the number of cloud objects.
    */
   public static void resetCount() {
      count = 0;
   }
   
   /**
    * Method to return a String describing CloudStorage object.
    * @return String representation of CloudStorage object.
    */
   public String toString()   {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      
      String output = name + " (" + this.getClass() + ") "; 
      output += "Monthly Cost: " + df.format(monthlyCost());
      output += "\nBase Storage Cost: " + df.format(getBaseStorageCost());
      return output;
   }
   
   /**
    * Abstract method representing the monthly cost of cloud storage.
    * @return monthly cost of cloud storage.
    */
   public abstract double monthlyCost();

}
