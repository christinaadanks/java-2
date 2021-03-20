import java.text.DecimalFormat;

/**
 * Program for cloud storage data inherited from CloudStorage.
 *
 * @author Christinaa Danks
 * @version 11/5/2020
 */
public class DedicatedCloud extends CloudStorage   {
   
   // instance variable
   private double serverCost;
   
   /**
    * Constructor for DedicatedCloud.
    * @param nameIn for cloud name.
    * @param storageCostIn for base storage cost.
    * @param serverCostIn for server cost.
    */
   public DedicatedCloud(String nameIn, double storageCostIn, 
               double serverCostIn)  {
      super(nameIn, storageCostIn);
      serverCost = serverCostIn;
   }
   
   /**
    * Method to get server cost.
    * @return server cost.
    */
   public double getServerCost() {
      return serverCost;
   }
   
   /**
    * Method to set server cost.
    * @param serverCostIn for new server cost.
    */
   public void setServerCost(double serverCostIn)  {
      serverCost = serverCostIn;
   }
   
   /**
    * Method to calculated monthly cost of cloud storage.
    * @return monthly cost of cloud storage.
    */
   public double monthlyCost()   {
      return storageCost + serverCost;
   }
   
   /**
    * Method to return a String describing DedicatedCloud object.
    * @return String representation of DedicatedCloud object.
    */
   public String toString()   {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      
      String output = super.toString();
      output += "\nServer Cost: " + df.format(getServerCost());
      
      return output;
   }
}