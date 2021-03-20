/**
 * Program for cloud storage data inherited from SharedCloud.
 *
 * @author Christinaa Danks
 * @version 11/5/2020
 */ 
public class PublicCloud extends SharedCloud {

   // constant
   /**
    * COST_FACTOR set to 2.0.
    */
   public static final double COST_FACTOR = 2.0;
   
   /**
    * Constructor for PublicCloud.
    * @param nameIn for cloud name.
    * @param storageCostIn for base storage cost.
    * @param dataLimitIn for data limit amount in GB.
    * @param dataStoredIn for amount of data stored in GB.
    */ 
   public PublicCloud(String nameIn, double storageCostIn, 
               double dataStoredIn, double dataLimitIn)   {
      super(nameIn, storageCostIn, dataStoredIn, dataLimitIn);
   }
   
   /**
    * Method to get cost factor.
    * @return SharedCloud cost factor.
    */
   public double getCostFactor() {
      return PublicCloud.COST_FACTOR;
   }
   
   /**
    * Method to calculated monthly cost of cloud storage.
    * @return monthly cost of cloud storage.
    */
   public double monthlyCost()   {
      double cost = storageCost + dataOverage() * PublicCloud.COST_FACTOR;
      return cost;
      
      
   }
   
}