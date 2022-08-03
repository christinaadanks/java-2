import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * PersonalCloud jUnit test.
 *
 * @author Christina L
 * @version 11/5/2020
 */
public class PersonalCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Tests getName() method.
    * Should return cloud name.
    */
   @Test public void getNameTest()   {
      PersonalCloud rick = new PersonalCloud("Rick", 44.00, 25.0, 18.0);
      Assert.assertEquals("Rick", rick.getName());
   }
   
   /**
    * Tests setName() method.
    * Should set a new cloud name, and return new name.
    */
   @Test public void setNameTest()   {
      PersonalCloud rick = new PersonalCloud("Rick", 44.00, 25.0, 18.0);
      rick.setName("Morty");
      Assert.assertEquals("Morty", rick.getName());
   }
   /**
    * Tests getBaseStorageCost() method.
    * Should return storage cost.
    */
   @Test public void getBaseStorageCostTest()   {
      PersonalCloud rick = new PersonalCloud("Rick", 44.00, 25.0, 18.0);
      Assert.assertEquals(44.00, rick.getBaseStorageCost(), .000001);
   }
   /**
    * Tests setBaseStorageCost() method.
    * Should set a new base storage cost, and return new cost.
    */
   @Test public void setBaseStorageCostTest()   {
      PersonalCloud rick = new PersonalCloud("Rick", 44.00, 25.0, 18.0);
      rick.setBaseStorageCost(30.00);
      Assert.assertEquals(30.00, rick.getBaseStorageCost(), .000001);
   }
   
   /**
    * Tests getCount() method.
    * Should return the number of objects created.
    */
   @Test public void getCountTest() {
      PersonalCloud rick = new PersonalCloud("Rick", 44.00, 25.0, 18.0);
      rick.resetCount();
      Assert.assertEquals(0, rick.getCount(), .000001);
   }
   
   /**
    * Tests getCostFactor() method.
    * Should return 3.0 since it is a constant.
    */
   @Test public void getCostFactorTest()  {
      PersonalCloud rick = new PersonalCloud("Rick", 44.00, 25.0, 18.0);
      Assert.assertEquals(3.0, rick.getCostFactor(), .000001);
   }
   
   /**
    * Tests monthlyCost() method.
    * Should return the monthly cost of cloud storage calculated as
    * (base storage cost + data overage * cost factor).
    * Includes 3 separate instances, negative, positive, and 0 data overage.
    */
   @Test public void monthlyCostTest() {
      PersonalCloud rick = new PersonalCloud("Rick", 44.00, 25.0, 18.0);
      Assert.assertEquals(65.0, rick.monthlyCost(), .000001);
      
      PersonalCloud morty = new PersonalCloud("Morty", 44.00, 15.0, 18.0);
      Assert.assertEquals(44.0, morty.monthlyCost(), .000001);
      
      PersonalCloud jerry = new PersonalCloud("Jerry", 44.00, 25.0, 25.0);
      Assert.assertEquals(44.0, jerry.monthlyCost(), .000001);
   }
}
