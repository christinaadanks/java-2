import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * PublicCloud jUnit test.
 *
 * @author Christinaa Danks
 * @version 11/5/2020
 */
public class PublicCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Tests getName() method.
    * Should return cloud name.
    */
   @Test public void getNameTest()   {
      PublicCloud rick = new PublicCloud("Rick", 44.0, 25.0, 18.0);
      Assert.assertEquals("Rick", rick.getName());
   }
   
   /**
    * Tests setName() method.
    * Should set a new cloud name, and return new name.
    */
   @Test public void setNameTest()   {
      PublicCloud rick = new PublicCloud("Rick", 44.0, 25.0, 18.0);
      rick.setName("Morty");
      Assert.assertEquals("Morty", rick.getName());
   }
   /**
    * Tests getBaseStorageCost() method.
    * Should return storage cost.
    */
   @Test public void getBaseStorageCostTest()   {
      PublicCloud rick = new PublicCloud("Rick", 44.0, 25.0, 18.0);
      Assert.assertEquals(44.00, rick.getBaseStorageCost(), .000001);
   }
   /**
    * Tests setBaseStorageCost() method.
    * Should set a new base storage cost, and return new cost.
    */
   @Test public void setBaseStorageCostTest()   {
      PublicCloud rick = new PublicCloud("Rick", 44.0, 25.0, 18.0);
      rick.setBaseStorageCost(30.00);
      Assert.assertEquals(30.00, rick.getBaseStorageCost(), .000001);
   }
   
   /**
    * Tests getCount() method.
    * Should return the number of objects created.
    */
   @Test public void getCountTest() {
      PublicCloud rick = new PublicCloud("Rick", 44.0, 25.0, 18.0);
      rick.resetCount();
      Assert.assertEquals(0, rick.getCount(), .000001);
   }
   
   /**
    * Tests getCostFactor() method.
    * Should return 2.0 since it is a constant.
    */
   @Test public void getCostFactorTest()  {
      PublicCloud rick = new PublicCloud("Rick", 44.0, 25.0, 18.0);
      Assert.assertEquals(2.0, rick.getCostFactor(), .000001);
   }
   
   /**
    * Tests monthlyCost() method.
    * Should return the monthly cost of cloud storage calculated as
    * (base storage cost + data overage * cost factor).
    * Includes 3 separate instances, negative, positive, and 0 data overage.
    */
   @Test public void monthlyCostTest() {
      PublicCloud rick = new PublicCloud("Rick", 44.0, 25.0, 18.0);
      Assert.assertEquals(58.0, rick.monthlyCost(), .000001);
      
      PublicCloud morty = new PublicCloud("Morty", 44.00, 15.0, 18.0);
      Assert.assertEquals(44.0, morty.monthlyCost(), .000001);
      
      PublicCloud jerry = new PublicCloud("Jerry", 44.00, 25.0, 25.0);
      Assert.assertEquals(44.0, jerry.monthlyCost(), .000001);
   }
}
