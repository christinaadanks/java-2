import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * DedicatedCloud jUnit test.
 *
 * @author Christinaa Danks
 * @version 11/5/2020
 */
public class DedicatedCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests getName() method.
    * Should return cloud name.
    */
   @Test public void getNameTest()   {
      DedicatedCloud rick = new DedicatedCloud("Rick", 44.00, 12.00);
      Assert.assertEquals("Rick", rick.getName());
   }
   
   /**
    * Tests setName() method.
    * Should set a new cloud name, and return new name.
    */
   @Test public void setNameTest()   {
      DedicatedCloud rick = new DedicatedCloud("Rick", 44.00, 12.00);
      rick.setName("Morty");
      Assert.assertEquals("Morty", rick.getName());
   }
   /**
    * Tests getBaseStorageCost() method.
    * Should return storage cost.
    */
   @Test public void getBaseStorageCostTest()   {
      DedicatedCloud rick = new DedicatedCloud("Rick", 44.00, 12.00);
      Assert.assertEquals(44.00, rick.getBaseStorageCost(), .000001);
   }
   /**
    * Tests setBaseStorageCost() method.
    * Should set a new base storage cost, and return new cost.
    */
   @Test public void setBaseStorageCostTest()   {
      DedicatedCloud rick = new DedicatedCloud("Rick", 44.00, 12.00);
      rick.setBaseStorageCost(30.00);
      Assert.assertEquals(30.00, rick.getBaseStorageCost(), .000001);
   }
   
   /**
    * Tests getCount() method.
    * Should return the number of objects created.
    */
   @Test public void getCountTest() {
      DedicatedCloud rick = new DedicatedCloud("Rick", 44.00, 12.00);
      rick.resetCount();
      Assert.assertEquals(0, rick.getCount(), .000001);
   }
   
   /**
    * Tests getServerCost method.
    * Should return the server cost.
    */
   @Test public void getServerCostTest()  {
      DedicatedCloud rick = new DedicatedCloud("Rick", 44.00, 12.00);
      Assert.assertEquals(12.00, rick.getServerCost(), .000001);
   }
   
   /**
    * Tests setServerCost method.
    * Should set a new server cost and return the new cost.
    */
   @Test public void setServerCostTest()  {
      DedicatedCloud rick = new DedicatedCloud("Rick", 44.00, 12.00);
      rick.setServerCost(25.00);
      Assert.assertEquals(25.00, rick.getServerCost(), .000001);
   }
   
   /**
    * Tests monthlyCost method.
    * Should return the monthly cost calculated by the sum
    * of base storage and server cost.
    */
   @Test public void monthlyCostTest() {
      DedicatedCloud rick = new DedicatedCloud("Rick", 44.00, 12.00);
      Assert.assertEquals(56.00, rick.monthlyCost(), .000001);
   }
   
   /**
    * Tests toString method.
    * Should return the String representation of object.
    */
   @Test public void toStringTest() {
      DedicatedCloud rick = new DedicatedCloud("Rick", 44.00, 12.00);
      String test = "Rick (class DedicatedCloud) Monthly Cost: $56.00";
      test += "\nBase Storage Cost: $44.00";
      test += "\nServer Cost: $12.00";
      
      Assert.assertEquals(test, rick.toString());
   }
}
