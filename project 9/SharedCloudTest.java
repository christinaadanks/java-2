import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * SharedCloud jUnit test.
 *
 * @author Christina L
 * @version 11/5/2020
 */
public class SharedCloudTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Tests getName() method.
    * Should return cloud name.
    */
   @Test public void getNameTest()   {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      Assert.assertEquals("Rick", rick.getName());
   }
   
   /**
    * Tests setName() method.
    * Should set a new cloud name, and return new name.
    */
   @Test public void setNameTest()   {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      rick.setName("Morty");
      Assert.assertEquals("Morty", rick.getName());
   }
   /**
    * Tests getBaseStorageCost() method.
    * Should return storage cost.
    */
   @Test public void getBaseStorageCostTest()   {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      Assert.assertEquals(44.00, rick.getBaseStorageCost(), .000001);
   }
   /**
    * Tests setBaseStorageCost() method.
    * Should set a new base storage cost, and return new cost.
    */
   @Test public void setBaseStorageCostTest()   {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      rick.setBaseStorageCost(30.00);
      Assert.assertEquals(30.00, rick.getBaseStorageCost(), .000001);
   }
   
   /**
    * Tests getCount() method.
    * Should return the number of objects created.
    */
   @Test public void getCountTest() {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      rick.resetCount();
      Assert.assertEquals(0, rick.getCount(), .000001);
   }

   /**
    * Tests getDataStored() method.
    * Should return amount of data that is stored.
    */
   @Test public void getDataStoredTest()  {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      Assert.assertEquals(25.0, rick.getDataStored(), .000001);
   }
   
   /**
    * Tests setDataStored() method.
    * Should set a new amount and return the new amount of data stored.
    */
   @Test public void setDataStoredTest()  {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      rick.setDataStored(20.0);
      Assert.assertEquals(20.0, rick.getDataStored(), .000001);
   }
   
   /**
    * Tests getDataLimit() method.
    * Should return the data limit amount.
    */
   @Test public void getDataLimitTest()   {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      Assert.assertEquals(18.0, rick.getDataLimit(), .000001);
   }
   
   /**
    * Tests setDataLimit() method.
    * Should set a new data limit and return the new limit.
    */
   @Test public void setDataLimitTest()   {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      rick.setDataLimit(50.0);
      Assert.assertEquals(50.0, rick.getDataLimit(), .000001);
   }
   
   /**
    * Tests getCostFactor() method.
    * Should return 1.0 since it is a constant.
    */
   @Test public void getCostFactorTest()   {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      Assert.assertEquals(1.0, rick.getCostFactor(), .000001);
   }
   
   /**
    * Tests dataOverage() method.
    * Should return data overage calculated as (data stored - data limit).
    * Includes 3 separate instances, negative, positive, and 0.
    */
   @Test public void dataOverageTest() {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      Assert.assertEquals(7.0, rick.dataOverage(), .000001);     
      
      SharedCloud morty = new SharedCloud("Morty", 44.00, 15.0, 18.0);
      Assert.assertEquals(0.0, morty.dataOverage(), .000001);
      
      SharedCloud jerry = new SharedCloud("Jerry", 44.00, 25.0, 25.0);
      Assert.assertEquals(0.0, jerry.dataOverage(), .000001);
   }
   
   /**
    * Tests monthlyCost() method.
    * Should return the monthly cost of cloud storage calculated as
    * (base storage cost + data overage * cost factor).
    * Includes 3 separate instances, negative, positive, and 0 data overage.
    */
   @Test public void monthlyCostTest() {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      Assert.assertEquals(51.0, rick.monthlyCost(), .000001);
      
      SharedCloud morty = new SharedCloud("Morty", 44.00, 15.0, 18.0);
      Assert.assertEquals(44.0, morty.monthlyCost(), .000001);
      
      SharedCloud jerry = new SharedCloud("Jerry", 44.00, 25.0, 25.0);
      Assert.assertEquals(44.0, jerry.monthlyCost(), .000001);
   }
   
   /**
    * Tests toString method.
    * Should return the String representation of object.
    */
   @Test public void toStringTest() {
      SharedCloud rick = new SharedCloud("Rick", 44.00, 25.0, 18.0);
      
      String output = "Rick (class SharedCloud) Monthly Cost: $51.00";
      output += "\nBase Storage Cost: $44.00";
      output += "\nData Stored: 25.000 GB";
      output += "\nData Limit: 18.000 GB";
      output += "\nOverage: 7.000 GB";
      output += "\nCost Factor: 1.0";
      
      Assert.assertEquals(output, rick.toString());
   }
   
   /**
    * Tests toString method.
    * Should return the String representation of object.
    */
   @Test public void toStringTest2() {
      SharedCloud morty = new SharedCloud("Morty", 44.00, 15.0, 18.0);
      
      String output = "Morty (class SharedCloud) Monthly Cost: $44.00";
      output += "\nBase Storage Cost: $44.00";
      output += "\nData Stored: 15.000 GB";
      output += "\nData Limit: 18.000 GB";
      output += "\nOverage: 0.000 GB";
      output += "\nCost Factor: 1.0";
      
      Assert.assertEquals(output, morty.toString());
   }

}
