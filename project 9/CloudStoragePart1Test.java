import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * CloudStoragePart1 jUnit test.
 *
 * @author Christinaa Danks
 * @version 11/5/2020
 */
public class CloudStoragePart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Tests getCount() and resetCount() method.
    * Should return the amount of objects created in CloudStoragePart1.
    */
   @Test public void getCountTest() {
      CloudStorage.resetCount();
      CloudStoragePart1.main(null);
      Assert.assertEquals(5, CloudStorage.getCount(), .000001);
   }
   
   /**
    * Tests main method.
    */
   @Test public void mainTest()  {
      CloudStoragePart1.main(new String[] {});
   }
}
