import java.text.DecimalFormat;

/**
 * Program for cloud storage data inherited from CloudStorage.
 *
 * @author Christinaa Danks
 * @version 11/5/2020
 */ 
public class SharedCloud extends CloudStorage   {

   // instance variables
   protected double dataStored;
   protected double dataLimit;
   
   // constant
   /**
    * COST_FACTOR set to 1.0.
    */
   public static final double COST_FACTOR = 1.0;
   
   /**
    * Constructor for SharedCloud.
    * @param nameIn for cloud name.
    * @param storageCostIn for base storage cost.
    * @param dataLimitIn for data limit amount in GB.
    * @param dataStoredIn for amount of data stored in GB.
    */ 
   public SharedCloud(String nameIn, double storageCostIn, 
               double dataStoredIn, double dataLimitIn)  {
      super(nameIn, storageCostIn);
      dataLimit = dataLimitIn;
      dataStored = dataStoredIn;
   }
   
   /**
    * Method to get amount of data stored.
    * @return amount of data stored in GB.
    */
   public double getDataStored() {
      return dataStored;
   }
   
   /**
    * Method to set amount of data stored.
    * @param dataStoredIn for new amount of data stored in GB.
    */
   public void setDataStored(double dataStoredIn) {
      dataStored = dataStoredIn;
   }
   
   /**
    * Method to get data limit amount.
    * @return data limit amount in GB.
    */
   public double getDataLimit()  {
      return dataLimit;
   }
   
   /**
    * Method to set data limit amount.
    * @param dataLimitIn for new data limit amount in GB.
    */
   public void setDataLimit(double dataLimitIn) {
      dataLimit = dataLimitIn;
   }
   
   /**
    * Method to get cost factor.
    * @return SharedCloud cost factor.
    */
   public double getCostFactor() {
      return SharedCloud.COST_FACTOR;
   }
   
   /**
    * Method to return the data overage amount.
    * @return data overage amount.
    */
   public double dataOverage()   {
      double amount = dataStored - dataLimit;
      
      if (amount >= 0)   {
         return amount;
      }
      return 0.0;
   }
   
   /**
    * Method to calculated monthly cost of cloud storage.
    * @return monthly cost of cloud storage.
    */
   public double monthlyCost()   {
      double cost = storageCost + dataOverage() * SharedCloud.COST_FACTOR;
      return cost;
   }
   
   /**
    * Method to return a String describing SharedCloud object.
    * @return String representation of SharedCloud object.
    */
   public String toString()   {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      DecimalFormat df2 = new DecimalFormat("0.000");
      
      String output = super.toString();
      output += "\nData Stored: " + df2.format(getDataStored()) + " GB";
      output += "\nData Limit: " + df2.format(getDataLimit()) + " GB";
      output += "\nOverage: " + df2.format(dataOverage()) + " GB";
      output += "\nCost Factor: " + getCostFactor();
      
      return output;
   }
   
}