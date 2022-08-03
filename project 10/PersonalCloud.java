/**
 * Program for cloud storage data inherited from SharedCloud.
 *
 * @author Christina L
 * @version 11/5/2020
 */ 
public class PersonalCloud extends SharedCloud  {
   
   // constant
   /**
    * COST_FACTOR set to 3.0.
    */
   public static final double COST_FACTOR = 3.0;
   
   /**
    * Constructor for PersonalCloud.
    * @param nameIn for cloud name.
    * @param storageCostIn for base storage cost.
    * @param dataLimitIn for data limit amount in GB.
    * @param dataStoredIn for amount of data stored in GB.
    */ 
   public PersonalCloud(String nameIn, double storageCostIn, 
               double dataStoredIn, double dataLimitIn) {
      super(nameIn, storageCostIn, dataStoredIn, dataLimitIn);   
   }
   
   /**
    * Method to get cost factor.
    * @return PersonalCloud cost factor.
    */
   public double getCostFactor()  {
      return PersonalCloud.COST_FACTOR;
   }
   
   /**
    * Method to calculated monthly cost of cloud storage.
    * @return monthly cost of cloud storage.
    */
   public double monthlyCost() {
      double cost = storageCost + dataOverage() * PersonalCloud.COST_FACTOR;
      return cost;
   }
   
   
}
